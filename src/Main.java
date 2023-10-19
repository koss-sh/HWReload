public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int clientOS = 1;
        if (clientOS == 0) System.out.println("Установите версию приложения для iOS по ссылке");
        if (clientOS == 1) System.out.println("Установите версию приложения для Android по ссылке");
    }
    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2013;
        if (clientOS == 0) {
            if (clientDeviceYear >=2015) System.out.println("Установите версию приложения для iOS по ссылке");
            else System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            if (clientDeviceYear >=2015) System.out.println("Установите версию приложения для Android по ссылке");
            else System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void task3() {
        int year = 2020;
        if ((year > 1584) && (year % 4 == 0) && (year % 100 != 0))
            System.out.println(year + " год является високосным");
        else System.out.println(year + " год не является високосным");
    }
    public static void task4() {
        int deliveryDistance = 95;
        int deliveryDays = 0;
        if (deliveryDistance < 20) {
            deliveryDays = 1;
            System.out.println("Потребуется дней:" + deliveryDays);
        }
        else if (deliveryDistance < 60) {
            deliveryDays = 2;
            System.out.println("Потребуется дней:" + deliveryDays);
        }
        else if (deliveryDistance < 100) {
            deliveryDays = 3;
            System.out.println("Потребуется дней:" + deliveryDays);
        }
        else System.out.println("Доставки нет");
    }
    public static void task5() {
        int monthNumber = 13;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Неверный месяц");
        }
    }
}
