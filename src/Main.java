import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int command = scanner.nextInt();

        while (command != 0) {
            if (command = 1) {
                StepTracker.steps();
            } else if (command = 2) {
                StepTracker.printMonthStatistic();
            } else if (command = 3) {
                int newGoal = scanner.nextInt();
                System.out.println("Ваша новая цель - " + StepTracker.goal(newGoal); + " шагов!");
            } else if (command = 0) {
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
