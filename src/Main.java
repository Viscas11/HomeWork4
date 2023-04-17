// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
          if (deliveryDistance <= 20) {
              System.out.println("Потребуется 1 день для доставки");
          }
          if (deliveryDistance > 20 && deliveryDistance <= 60) {
              System.out.println("Потребуется 2 дня для доставки");
          }
          if (deliveryDistance > 60 && deliveryDistance <= 100) {
              System.out.println("потребуется 3 дня для доставки");
          } else {
              System.out.println("Доставки нет");
          }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("январь месчяц зимы");
                break;
            case 2:
                System.out.println("февраль месяц зимы");
                break;
            case 3:
                System.out.println("март месяц весны");
                break;
            case 4:
                System.out.println("апрель месяц весны");
                break;
            case 5:
                System.out.println("май месяц весны");
                break;
            case 6:
                System.out.println("июнь месяц лета");
                break;
            case 7:
                System.out.println("июль месяц лета");
                break;
            case 8:
                System.out.println("август месяц лета");
                break;
            case 9:
                System.out.println("сентябрь месяц осени");
                break;
            case 10:
                System.out.println("октябрь месяц осени");
                break;
            case 11:
                System.out.println("ноябрь месяц осени");
                break;
            case 12:
                System.out.println("декабрь месяц зимы");
                break;
            default:
                System.out.println("такого месяца нет");
        }
    }
}
