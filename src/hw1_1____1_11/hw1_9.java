package hw1_1____1_11;

public class hw1_9 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("task 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int e : arr) {
            sum += e;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("task 2");
        int[] arr = generateRandomArray();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int e : arr) {
            if (e < min) {
                min = e;
            }
            if (e > max) {
                max = e;
            }
        }
        if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей." +
                    " Максимальная сумма трат за день составила " + max + " рублей");
        }
    }

    public static void task3() {
        System.out.println("task 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int e : arr) {
            sum += e;
        }
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей%n", (double) sum / arr.length);
    }

    public static void task4() {
        System.out.println("task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}

