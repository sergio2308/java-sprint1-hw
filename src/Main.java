import java.util.Scanner;
public class Main { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int command = scanner.nextInt();
        StepTracker stepTracker = new StepTracker();

        while (command != 0) {
            if (command == 1) {
                System.out.println("Введите номер месяца, за который вы хотите ввести данные (нумерация месяцев начинается с 0)");
                int monthNumber = scanner.nextInt();
                System.out.println("За какой день месяца вы хотите внести данные (номерация дней начинается с 0)");
                int dayNumber = scanner.nextInt();
                System.out.println("Введите количество шагов за этот день:");
                int steps = scanner.nextInt();
                stepTracker.steps(monthNumber, dayNumber, steps);
            } else if (command == 2) {
                System.out.println("За какой месяц вывести статистику?");
                int monthNumber = scanner.nextInt();
                stepTracker.stepsStat(monthNumber);
                System.out.println("Лучшая серия " + stepTracker.seriesStat(monthNumber) + " дней.");
            } else if (command == 3) {
                System.out.println("По умолчанию в программе установлена цель в 10000 шагов.");
                System.out.println("Введите новую цель:");
                int newGoal = scanner.nextInt();
                System.out.println("Ваша цель - " + stepTracker.goal(newGoal) + " шагов!");
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Такой команды нет");
            }
            printMenu();
            command = scanner.nextInt();
        }
        System.out.println("Программа остановлена");
    }

    private static void printMenu() {
        System.out.println("Какое действие вы хотите выполнить?");
        System.out.println("1 - Ввести количество шагов");
        System.out.println("2 - Напечатать статиистику");
        System.out.println("3 - Изменить цель по количеству шагов");
        System.out.println("0 - Выйти из программы");
    }
}
