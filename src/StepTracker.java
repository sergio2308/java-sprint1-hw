
public class StepTracker {
    public static month[] printMonthStatistic() {
    }

    public static int goal(int newGoal) {
        int goal = 10000;
            System.out.println("По умолчанию в программе установлена цель в 10000 шагов.");
            System.out.println("Введите новую цель:");
            if (newGoal > 0) {
                goal = newGoal;
                return goal;
            } else {
                System.out.println("Введите положительное число шагов, в качестве цели");
            }
    }

    public static void steps() {
    }
}
