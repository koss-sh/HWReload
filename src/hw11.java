import java.time.LocalDate;

public class hw11 {
    public static void main(String[] args) {
        checkYear(2024);
        suggestCorrectInstall(0, 2023);
        printDeliveryDays(105);
    }

    //task 1
    static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год»");
        } else {
            System.out.println(year + " год — невисокосный год»");
        }
    }

    //task 2
    static void suggestCorrectInstall(int os, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        String s1 = os == 0 ? "iOS" : "Android";
        String s2 = deviceYear >= currentYear ? "" : " облегченную";
        System.out.println("Установите" + s2 + " версию приложения для " + s1 + " по ссылке");
    }

    //task 3
    public static int requireDeliveryDays(int deliveryDistance) {
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
        int deliveryDays = requireDeliveryDays(distance);
        switch (deliveryDays) {
            case 1:
                System.out.println("Потребуется дней: 1");
                break;
            case 2:
                System.out.println("Потребуется дней: 2");
                break;
            case 3:
                System.out.println("Потребуется дней: 3");
                break;
            default:
                System.out.println("Доставки нет");
                break;
        }
    }
}
