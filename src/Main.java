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
        if (clientOs2 == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            if (clientOs2 == 0) {
                System.out.println("Установите версию приложения для Android по ссылке");
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                System.out.println("Задание 3");
                int year = 2021;


            }
        }
    }
}