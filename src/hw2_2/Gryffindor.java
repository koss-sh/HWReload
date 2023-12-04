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

    private int ability() {
        return nobility + honor + courage;
    }

    public void compareGryffindors(Gryffindor gryffindor){
        int ability1 = ability();
        int ability2 = gryffindor.ability();
        if (ability1 > ability2){
            System.out.printf("%s is better than %s: %d vs %d%n",
                    getName(), gryffindor.getName(), ability1, ability2);
        } else if (ability1 < ability2) {
            System.out.printf("%s is better than %s: %d vs %d%n",
                    gryffindor.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("%s and %s are equal: %d vs %d%n",
                    getName(), gryffindor.getName(), ability2, ability1);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", nobility: " + nobility + ", honor: " + honor + ", courage: " + courage;
    }

}
