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



    @Override
    public String toString() {
        return getName() + "   " + "magic: " + getMagic() + ", transgression: " + getTransgression()
                + ", intellect: " + getIntellect() + ", wisdom: " + getWisdom()
                + ", wittiness: " + getWittiness() + ", creativity: " + getCreativity();
    }
}
