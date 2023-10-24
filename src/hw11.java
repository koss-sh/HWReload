import java.time.LocalDate;

public class hw11 {
    public static void main(String[] args) {
        printYear(2024);
        suggestCorrectInstall(0, 2023);
        printDeliveryDays(105);
    }

    //task 1
    static void printYear(int year) {
        boolean leapYear = isLeapYear(year);
        if (leapYear) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    //task 2
    static void suggestCorrectInstall(int os, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        String s1 = os == 0 ? "iOS" : "Android";
        String s2 = deviceYear >= currentYear ? "" : " облегченную";
        System.out.println("Установите" + s2 + " версию приложения для " + s1 + " по ссылке");
    }

    //task 3
    public static int defineDeliveryDays(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance < 100) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void printDeliveryDays(int distance) {
        int deliveryDays = defineDeliveryDays(distance);
        if (deliveryDays == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }
}
