import java.sql.SQLOutput;

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
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Продолжайте использовать Web версию");
        }
    }



    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2012;
        int clientOS = 0;
        String os = clientOS <= 0 ? "iOS" : "Android";
        String type = clientDeviceYear <= 2015 ? "облегченную" : "";
        System.out.println("Установите " + type + " версию приложения для " + os + " по ссылке");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2012;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 50;
        int days = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            if (deliveryDistance > 20) {
                days = days + 1;
            }
            if (deliveryDistance > 60) {
                days = days + 2;
            }
            System.out.println("Время доставки " + days + " дней");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 5;
        System.out.println("Выбранный месяц " + monthNumber + ".");
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц принадлежит зиме");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц принадлежит весне");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц принадлежит лету");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц принадлежит осени");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}