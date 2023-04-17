// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 1;
        int IOS = 1;
        int Android = 0;
        if (clientOS == IOS) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        if (clientOS == Android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        int IOS = 1;
        int Android = 0;
        if (clientOS == IOS && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
          } else if (clientOS == IOS && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");}
        if (clientOS == Android && clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
          } else if (clientOS == Android && clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 400;
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 ==0));
            System.out.println(year + " год высокосный ");
        } else {
            System.out.println(year + " год не являестя високосным ");
        }
    }
}
