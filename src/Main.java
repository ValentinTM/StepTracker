import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        StepTracker stepTracker = new StepTracker();

        System.out.println("ПРОГРАММА ПОДСЧЕТ ШАГОВ ЗАПУЩЕНА!");

        while (true) {
            printMenu();
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                System.out.println("Введите номер месяца");
                int numberMonth = scanner.nextInt();
                System.out.println("Введите номер дня");
                int numberDay = scanner.nextInt();
                System.out.println("Введите кол-во шагов");
                int steps = scanner.nextInt();
                stepTracker.addInArray(numberMonth, numberDay, steps);

            } else if (userInput == 2) {
                System.out.println("Введите номер месяца");
                int numberMonth = scanner.nextInt();
                stepTracker.getArray(numberMonth);
            } else if (userInput == 3) {
                System.out.println("Введите новую цель на день");
                int newSteps = scanner.nextInt();
                if(newSteps>=0){
                    System.out.println("Новая цель - " + stepTracker.changeTargetSteps(newSteps)+ " шагов!");}
                else{
                    System.out.println("Введено отрицательно значение! Попробуйте снова.");}
            } else if (userInput == 4) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }

        }
        System.out.println("Программа завершена");


    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Ввести количество шагов за определённый день, в нужный месяц, 0-11, где 0 - январь, 11 декабрь ");
        System.out.println("2 - Напечатать статистику за определённый месяц и день");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("4 - Выйти из приложения");

    }
}




