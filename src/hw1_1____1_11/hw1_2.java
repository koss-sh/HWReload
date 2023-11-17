package hw1_1____1_11;

public class hw1_2 {
    public static void main(String[] args) {
        //task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 2
        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 3
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        //task 5;
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);

        //task 6;
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Total weight: " + totalWeight);
        var weightDif = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Weight difference: " + weightDif);

        //task 7;
        weightDif = secondBoxerWeight % firstBoxerWeight;
        System.out.println(weightDif);

        //task 8
        var totalHours = 640;
        var hoursPerEmployee = 8;
        var totalEmployees = totalHours / hoursPerEmployee;
        System.out.println("Всего работников в компании — " + totalEmployees + " человек");
        var newTotalEmployees = totalEmployees + 94;
        var newTotalHours = newTotalEmployees * hoursPerEmployee;
        System.out.println("Если в компании работает " + newTotalEmployees + " человек," +
                " то всего " + newTotalHours + " часов работы может быть" +
                " поделено между сотрудниками");

    }
}
