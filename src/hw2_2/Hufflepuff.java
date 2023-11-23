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

    @Override
    public String toString() {
        return getName() + "   " + "magic: " + getMagic() + ", transgression: " + getTransgression()
                + ", diligence: " + getDiligence() + ", loyalty: " + getLoyalty()
                + ", honesty: " + getHonesty();
    }
}
