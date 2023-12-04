package hw2_2;

public abstract class Hogwarts {
    private final String name;
    private int magic;
    private int transgression;

    public Hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }


    private int ability(){
        return magic + transgression;
    }

    public void compareHogwarts(Hogwarts hogwarts){
        int ability1 = ability();
        int ability2 = hogwarts.ability();
        if (ability1 > ability2){
            System.out.printf("%s is better than %s: %d vs %d%n",
                    getName(), hogwarts.getName(), ability1, ability2);
        } else if (ability1 < ability2) {
            System.out.printf("%s is better than %s: %d vs %d%n",
                    hogwarts.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("%s and %s are equal: %d vs %d%n",
                    getName(), hogwarts.getName(), ability2, ability1);
        }
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return name + "   " + "magic: " + magic + ", transgression: " + transgression;
    }
}
