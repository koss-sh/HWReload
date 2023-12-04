package hw2_2;

public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int magic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    private int ability() {
        return diligence + loyalty + honesty;
    }

    public void compareHufflepuffs(Hufflepuff hufflepuff) {
        int ability1 = ability();
        int ability2 = hufflepuff.ability();
        if (ability1 > ability2) {
            System.out.printf("%s is better than %s: %d vs %d%n",
                    getName(), hufflepuff.getName(), ability1, ability2);
        } else if (ability1 < ability2) {
            System.out.printf("%s is better than %s: %d vs %d%n",
                    hufflepuff.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("%s and %s are equal: %d vs %d%n",
                    getName(), hufflepuff.getName(), ability2, ability1);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", diligence: " + diligence + ", loyalty: " + loyalty
                + ", honesty: " + honesty;
    }
}
