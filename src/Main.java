public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void viscousYear() {
        int year = 2021;
        if ((year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високостным");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        viscousYear();
    }

    public static void androidIliIOS() {
        int clientOS = 1;
        int clientDeviceYear = 2022;
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else  if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Чтото пошло не так");
        }
    }


    public static void task2() {
        System.out.println("Задача 2");
        androidIliIOS();
    }

    public static void deliveryTask(){
    int deliveryDistance = 95;
    int a = 1;
    int b = 2;
    int c = 3;
    if (deliveryDistance <= 20) {
        System.out.println("Потребуется дней: " + a);
    } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
        System.out.println("Потребуется дней: " + b);
    } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
        System.out.println("Потребуется дней: " + c);
    } else {
        System.out.println("Свыше 100 км доставки нет.");
    }
    }


    public static void task3() {
        System.out.println("Задача 3");
        deliveryTask();
    }
}
