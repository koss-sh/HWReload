package hw2_2;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resoursefulness;
    private int powerthirst;

    public Slytherin(String name, int magic, int transgression, int cunning,
                     int determination, int ambition, int resoursefulness, int powerthirst) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resoursefulness = resoursefulness;
        this.powerthirst = powerthirst;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResoursefulness() {
        return resoursefulness;
    }

    public void setResoursefulness(int resoursefulness) {
        this.resoursefulness = resoursefulness;
    }

    public int getPowerthirst() {
        return powerthirst;
    }

    public void setPowerthirst(int powerthirst) {
        this.powerthirst = powerthirst;
    }

    private int ability() {
        return cunning + determination + ambition + resoursefulness + powerthirst;
    }

    public void compareSlytherins(Slytherin slytherin) {
        int ability1 = ability();
        int ability2 = slytherin.ability();
        if (ability1 > ability2) {
            System.out.printf("%s is better than %s: %d vs %d%n",
                    getName(), slytherin.getName(), ability1, ability2);
        } else if (ability1 < ability2) {
            System.out.printf("%s is better than %s: %d vs %d%n",
                    slytherin.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("%s and %s are equal: %d vs %d%n",
                    getName(), slytherin.getName(), ability2, ability1);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", cunning: " + cunning + ", determination: " + determination
                + ", ambition: " + ambition + ", resoursefulness: " + resoursefulness
                + ", powerthirst: " + powerthirst;
    }
}
