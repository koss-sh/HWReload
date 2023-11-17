package hw1_1____1_11;

public class hw1_3 {
    public static void main(String[] args) {
        //task 1
        int a = 100;
        byte b = -5;
        short c = -100;
        long d = 425_00L;
        float e = 58f;
        double f = 52.25987233;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        //task 3
        byte studentsLP = 23;
        short studentsAS = 27;
        int studentsEA = 30;
        long totalSheets = 480L;
        System.out.println("На каждого ученика рассчитано "
                + totalSheets / (studentsLP+studentsAS+studentsEA) +" листов бумаги");

        //task 4
        int perMinute = 16 / 2;
        System.out.println("За 20 минут машина произвела " + 20 * perMinute + " штук бутылок");
        System.out.println("За сутки машина произвела " + 60 * perMinute * 24 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + 60 * perMinute * 24 * 3 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + 60 * perMinute * 24 * 30 + " штук бутылок");

        //task 5
        int total = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;
        int classes = total / (whitePerClass + brownPerClass);
        System.out.println("В школе, где " + classes +
                " классов, нужно " + whitePerClass * classes + " банок белой краски и "
                + brownPerClass * classes + " банок коричневой краски");

        //task 6
        int bananas = 5 * 80;
        int milk = 200 / 100 * 105;
        int icecream = 2 *100;
        int eggs = 4 * 70;
        System.out.println("в граммах: " + (bananas+milk+icecream+eggs));
        System.out.println("в килограммах: " + (double)(bananas+milk+icecream+eggs) / 1000);

        //task 7
        int goal = 7;
        int max = (int) ( goal / 0.25);
        int min = (int) ( goal / 0.5);
        int average = (int) ( goal / ((0.5+0.25)/2));
        System.out.println(max);
        System.out.println(min);
        System.out.println(average);

        //task 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double index = 10;
        System.out.println("Маша теперь получает " + masha *(100+index)/100 + " рублей." +
                " Годовой доход вырос на " + (int)(12*masha*((100+index)/100-1)) + " рублей");
        System.out.println("Денис теперь получает " + denis *(100+index)/100 + " рублей." +
                " Годовой доход вырос на " + (int)(12*denis*((100+index)/100-1)) + " рублей");
        System.out.println("Кристина теперь получает " + kristina *(100+index)/100 + " рублей." +
                " Годовой доход вырос на " + (int)(12*kristina*((100+index)/100-1)) + " рублей");


    }
}
