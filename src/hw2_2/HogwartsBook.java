package hw2_2;


public class HogwartsBook {


    static void printStudent(Hogwarts student) {
        System.out.println(student);
    }

    static void compare2Gryffindors(Gryffindor s1, Gryffindor s2) {
        int sum1 = s1.getCourage() + s1.getHonor() + s1.getNobility();
        int sum2 = s2.getCourage() + s2.getHonor() + s2.getNobility();
        if (sum1 > sum2) {
            System.out.println(s1.getName() + " is better Gryffindor than " + s2.getName());
        } else {
            System.out.println(s2.getName() + " is better Gryffindor than " + s1.getName());
        }
    }
    static void compare2Hufflepuffs(Hufflepuff s1, Hufflepuff s2) {
        int sum1 = s1.getDiligence() + s1.getHonesty() + s1.getLoyalty();
        int sum2 = s2.getDiligence() + s2.getHonesty() + s2.getLoyalty();
        if (sum1 > sum2) {
            System.out.println(s1.getName() + " is better Hufflepuff than " + s2.getName());
        } else {
            System.out.println(s2.getName() + " is better Hufflepuff than " + s1.getName());
        }
    }
    static void compare2Ravenclaws(Ravenclaw s1, Ravenclaw s2) {
        int sum1 = s1.getCreativity() + s1.getIntellect() + s1.getWittiness()
                + s1.getWisdom();
        int sum2 = s2.getCreativity() + s2.getIntellect() + s2.getWittiness()
                + s2.getWisdom();
        if (sum1 > sum2) {
            System.out.println(s1.getName() + " is better Rawenclaw  than " + s2.getName());
        } else {
            System.out.println(s2.getName() + " is better Rawenclaw  than " + s1.getName());
        }
    }
    static void compare2Slytherins(Slytherin s1, Slytherin s2) {
        int sum1 = s1.getAmbition() + s1.getDetermination() + s1.getResoursefulness()
                + s1.getCunning() + s1.getPowerthirst();
        int sum2 = s2.getAmbition() + s2.getDetermination() + s2.getResoursefulness()
                + s2.getCunning() + s2.getPowerthirst();
        if (sum1 > sum2) {
            System.out.println(s1.getName() + " is better Slytherin  than " + s2.getName());
        } else {
            System.out.println(s2.getName() + " is better Slytherin  than " + s1.getName());
        }
    }

    static void compareStudentsByMagicAndTransgression(Hogwarts s1, Hogwarts s2) {
        System.out.print(s1.getName()+ " is ");
        if (s1.getMagic() > s2.getMagic()) {
            System.out.print("better in magic and ");
          } else {
            System.out.print("worse in magic and ");
        }
        if (s1.getTransgression() > s2.getTransgression()) {
           System.out.println("better in transgression than " + s2.getName());
        } else {
            System.out.println("worse in transgression than " + s2.getName());
        }
    }



}
