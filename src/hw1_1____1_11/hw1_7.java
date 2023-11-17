package hw1_1____1_11;

import java.time.LocalDate;

public class hw1_7 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("task 1");
        int deposit = 15000;
        double sum = 0;
        int target = 2_459_000;
        double interest = 12;
        int month = 0;
        while (sum <= target) {
            month++;
            sum = sum * (1 + (interest / 100) / 12) + deposit;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month, sum);
        }
    }

    public static void task2() {
        System.out.println("task 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("task 3");
        int population = 12_000_000;
        int fertilityPer1000 = 17;
        int mortalityPer1000 = 8;
        int year = 1;
        while (year <= 10) {
            population = population + (fertilityPer1000 - mortalityPer1000) * population / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year++;
        }
    }

    public static void task4() {
        System.out.println("task 4");
        double sum = 15000;
        int target = 12_000_000;
        double interest = 7;
        int month = 1;
        while (sum <= target) {
            sum = sum * (1 + (interest / 100));
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month, sum);
            month++;
        }
    }

    public static void task5() {
        System.out.println("task 5");
        double sum = 15000;
        int target = 12_000_000;
        double interest = 7;
        int month = 1;
        while (sum <= target) {
            sum = sum * (1 + (interest / 100));
            if (month % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month, sum);
            }
            month++;
        }
    }

    public static void task6() {
        System.out.println("task 6");
        int sum = 15000;
        int term = 9 * 12;
        double interest = 7;
        int month = 1;
        while (month <= term) {
            sum = (int) (sum * (1 + (interest / 100)));
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
            month++;
        }
    }

    public static void task7() {
        System.out.println("task 7");
        int friday = 1;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }
    }

    public static void task8() {
        System.out.println("task 8");
        int currentYear = LocalDate.now().getYear();
        int start = currentYear - 200;
        int finish = currentYear + 100;
        int period = 79;
        int firstTimeAppeared = 0;
        for (int year = firstTimeAppeared; year <= finish; year += period) {
            if (year >= start) {
                System.out.println(year);
            }
        }
    }
}
