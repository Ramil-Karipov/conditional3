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
        int clientOs2 = 1;
        int clientDeviceYear = 2013;
        int ios2 = 0;
        int android2 = 1;
        boolean deviceYear = clientDeviceYear < 2015;
        if (clientOs2 == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (deviceYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOs2 == 0) {
                System.out.println("Установите версию приложения для Android по ссылке");
                if (deviceYear) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }


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
        int deliveryDistance = 95;


    }
}
