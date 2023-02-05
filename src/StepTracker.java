


public class StepTracker {
    MonthData[] monthToData;
    int goal = 10000;
    public StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }

    }

    public class MonthData {
        int[] days = new int[30];
    }
    public void steps(int monthNumber, int dayNumber, int steps) {
        if (((monthNumber >= 0) && (monthNumber <=11)) && ((dayNumber >= 0) && (dayNumber <= 29)))//диапазон номера месяца проверяю от 0 до 29 т.к. в ТЗ указано, что в месяце 30 дней
        {
            monthToData[monthNumber].days[dayNumber] += steps;
        }
        else {
            System.out.println("Данные не были внесены. Вы ввели неверный номер месяца или дня. Введите номер месяца от 0 до 11 и номер дня от 0 до 29.");
        }
    }

    public void stepsStat(int monthNumber) {
        int stepsAmount = 0;
        System.out.println("Ваша статистика за " + monthNumber + "-й месяц:");
        for (int i = 0; i < ((monthToData[monthNumber].days.length) - 1); i++) {
            System.out.print((i + 1) + " день: " + monthToData[monthNumber].days[i] + ", ");
        }
        System.out.print("30 день: " + monthToData[monthNumber].days[29]);
        for (int i = 0; i < monthToData[monthNumber].days.length; i++) { 
            stepsAmount = stepsAmount + monthToData[monthNumber].days[i];
        }
        System.out.println();
        System.out.println("Общее количество шагов за месяц: " + stepsAmount);
        int maxSteps = 0;
        for (int i = 0; i < monthToData[monthNumber].days.length; i++) {
            if (monthToData[monthNumber].days[i] > maxSteps) {
                maxSteps = monthToData[monthNumber].days[i];
            }
        }
        System.out.println("Максимальное пройденное количество шагов: " + maxSteps);
        int averageSteps = stepsAmount / monthToData[monthNumber].days.length; //делим на длину массива, а не на 30 т.к. в будущем может быть учтена реальная длина месяцев
        System.out.println("Среднее количество шагов: " + averageSteps);
        System.out.println("Пройденная дистанция в километрах: " + Converter.stepsConverter(stepsAmount));
        System.out.println("Сожжено калорий: " + Converter.caloriesConverter(stepsAmount));
    }

    public int seriesStat (int monthNumber) {
        int maxSeries = 0;
        int daysCounter = 0;
        for (int i = 0; i < monthToData[monthNumber].days.length; i++) {
            if (monthToData[monthNumber].days[i] < goal) {
                if (daysCounter > maxSeries) {
                    maxSeries = daysCounter;
                }
                daysCounter = 0;
                continue;
            }
            daysCounter++;
        }
        return maxSeries;
    }

    public int goal(int newGoal) {
        if (newGoal > 0) {
            goal = newGoal;
            return goal;
        } else {
            System.out.println("Введите положительное число шагов, в качестве цели!");
        }
        return goal;
    }
}
