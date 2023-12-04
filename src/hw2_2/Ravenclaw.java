package hw2_2;

public class Ravenclaw extends Hogwarts {
    private int intellect;
    private int wisdom;
    private int wittiness;
    private int creativity;


    public Ravenclaw(String name, int magic, int transgression, int intellect, int wisdom, int wittiness, int creativity) {
        super(name, magic, transgression);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWittiness() {
        return wittiness;
    }

    public void setWittiness(int wittiness) {
        this.wittiness = wittiness;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    private int ability() {
        return intellect + wisdom + wittiness + creativity;
    }

    public void compareRawenclaws(Ravenclaw ravenclaw) {
        int ability1 = ability();
        int ability2 = ravenclaw.ability();
        if (ability1 > ability2) {
            System.out.printf("%s is better than %s: %d vs %d%n",
                    getName(), ravenclaw.getName(), ability1, ability2);
        } else if (ability1 < ability2) {
            System.out.printf("%s is better than %s: %d vs %d%n",
                    ravenclaw.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("%s and %s are equal: %d vs %d%n",
                    getName(), ravenclaw.getName(), ability2, ability1);
        }
    }


    @Override
    public String toString() {
        return super.toString() + ", intellect: " + intellect + ", wisdom: " + wisdom
                + ", wittiness: " + wittiness + ", creativity: " + creativity;
    }
}
