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
        int ios2 = 1;
        int android2 = 0;
        boolean deviceYear = clientDeviceYear < 2015;
        if (clientOs2 == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (deviceYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOs2 == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (deviceYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
        System.out.println("Задание 3");
        int year = 2024;
        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
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
                System.out.println("Январь");
            case 2:
                System.out.println("Февраль");
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Март");
            case 4:
                System.out.println("Апрель");
            case 5:
                System.out.println("Май");
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Июнь");
            case 7:
                System.out.println("Июль");
            case 8:
                System.out.println("Август");
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Сентябрь");
            case 10:
                System.out.println("Октябрь");
            case 11:
                System.out.println("Ноябрь");
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Декабрь");
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }


    }
}