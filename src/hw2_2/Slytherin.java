package hw2_2;

public class Slytherin extends Hogwarts{
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

    @Override
    public String toString() {
        return getName() + "   " + "magic: " + getMagic() + ", transgression: " + getTransgression()
                + ", cunning: " + getCunning() + ", determination: " + getDetermination()
                + ", ambition: " + getAmbition() + ", resoursefulness: " + getResoursefulness()
                + ", powerthirst: " + getPowerthirst();
    }
}
