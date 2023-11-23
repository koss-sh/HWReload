package hw2_2;

import java.util.Random;

public class Main {
    static Random random = new Random();
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101));
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101));
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101));
        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101));
        Slytherin grahamMontague = new Slytherin("Graham Montague", random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101));
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101));
        Hufflepuff zachariahSmith = new Hufflepuff("Zachariah Smith", random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101));
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101));
        Hufflepuff justinFinch_Fletchley = new Hufflepuff("Justin Finch-Fletchley",
                random.nextInt(0, 101), random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101),
                random.nextInt(0, 101));
        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang", random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101),
                random.nextInt(0, 101));
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101),
                random.nextInt(0, 101));
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101),
                random.nextInt(0, 101), random.nextInt(0, 101),
                random.nextInt(0, 101));

        HogwartsBook.printStudent(marcusBelby);
        HogwartsBook.compare2Ravenclaws(marcusBelby, padmaPatil);
        HogwartsBook.compareStudentsByMagicAndTransgression(harryPotter, marcusBelby);
    }
}
