public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOs = 0;
        int ios = 0;
        int android = 1;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задание 2");
        int clientOs2 = 0;
        int clientDeviceYear = 2016;
        boolean ios2 = clientOs2 == 1;
        boolean android2 = clientOs2 == 0;
        boolean deviceYear = clientDeviceYear <= 2015;
        boolean deviceYear1 = clientDeviceYear > 2015;
        if (ios2 && deviceYear1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (ios2 && deviceYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (android2 && deviceYear1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (android2 && deviceYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("Задание 3");
        int year = 2027;
        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год является не високосным");
        }
        System.out.println("Задание 4");
        int deliveryDistance = 98;
        int a = 1;
        int b = 2;
        int c = 3;
        if (deliveryDistance <= 20 || 20 == a) {
            System.out.println("Потребуется дней: " + a);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60 || 60 == b) {
            System.out.println("Потребуется дней: " + b);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100 || 100 == c) {
            System.out.println("Потребуется дней: " + c);
        } else {
            System.out.println("Доставка в данный регион отсутствует");
        }
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }


    }
}