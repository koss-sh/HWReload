public class hw6 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
    public static void task2() {
        System.out.println();
        System.out.println("task 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
    public static void task3() {
        System.out.println();
        System.out.println("task 3");
        for (int i = 0; i <= 17; i=i+2) {
            System.out.print(i + " ");
        }
    }
    public static void task4() {
        System.out.println();
        System.out.println("task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
    }
    public static void task5() {
        System.out.println();
        System.out.println("task 5");
        int start = 1904;
        int finish = 1914;
        for (int i = start; i <= finish; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 100 == 0)
            System.out.println(i + " год является високосным");
        }
    }
    public static void task6() {
        System.out.println();
        System.out.println("task 6");
        for (int i = 7; i <= 98; i+=7) {
           System.out.print(i + " ");
        }
    }
    public static void task7() {
        System.out.println();
        System.out.println("task 7");
        for (int i = 1; i <= 512; i*=2) {
            System.out.print(i + " ");
        }
    }
    public static void task8() {
        System.out.println();
        System.out.println("task 8");
        int deposit = 29000;
        int sum = 0;
        for (int i = 1; i <= 12; i++) {
            sum = sum + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }
    }
    public static void task9() {
        System.out.println();
        System.out.println("task 9");
        int deposit = 29000;
        double sum = 0;
        double percentage = 12;
        for (int month = 1; month <= 12; month++) {
            sum = sum * (1 + (percentage/100)/12) + deposit;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month, sum);
        }
    }
    public static void task10() {
        System.out.println();
        System.out.println("task 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*"+i+"="+(2*i));
        }
    }
}

