package hw2_2;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int magic, int transgression, int nobility, int honor, int courage) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return getName() + "   " + "magic: " + getMagic() + ", transgression: " + getTransgression()
                + ", nobility: " + getNobility() + ", honor: " + getHonor() + ", courage: " + getCourage();
    }

}
