public class Main {
    public static void main(String[] args) {
        //task 1
        int age = 20;
        System.out.print("Если возраст человека равен ");
        if (age >= 18)
            System.out.println(age + ", то он совершеннолетний");
        else System.out.println(age + ", то он не достиг совершеннолетия, нужно немного подождать");

        //task 2
        int temperature = 9;
        if (temperature <= 5)
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        else System.out.println("На улице " + temperature + " градусов, можно идти без шапки");

        //task 3
        int speed = 70;
        if (speed > 60)
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        else System.out.println("Если скорость " + speed + ", то можно ездить спокойно");

        //task 4
        int humanAge = 25;
        System.out.print("Если возраст человека равен ");
        if (humanAge >= 2 && humanAge < 6)
            System.out.println(humanAge + ", то ему нужно ходить в детский сад");
        else if (humanAge < 18)
            System.out.println(humanAge + ", то ему нужно ходить в школу");
        else if (humanAge < 24)
            System.out.println(humanAge + ", то его место в университете");
        else System.out.println(humanAge + ", то ему пора ходить на работу");

        //task 5
        int childAge = 4;
        System.out.print("Если возраст ребенка равен ");
        if (childAge < 5)
            System.out.println(childAge + ", то ему нельзя кататься на аттракционе");
        else if (childAge < 14)
            System.out.println(childAge + ", то он может кататься только в сопровождении взрослого");
        else System.out.println(childAge + ", то он может кататься без сопровождения взрослого");

        //task 6
        int capacity = 120;
        int occupied = 120;
        if (occupied < 60) System.out.println("Место есть. Сидячее.");
        else if (occupied < capacity) System.out.println("Место есть. Только стоячее.");
        else System.out.println("Мест нет");

        //task 7
        int one = 2;
        int two = 5;
        int three = 4;
        if (one > two && one > three) System.out.println(one + " :большее");
        else if (two > one && two > three) System.out.println(two + " :большее");
        else System.out.println(three + " :большее");
    }
}
