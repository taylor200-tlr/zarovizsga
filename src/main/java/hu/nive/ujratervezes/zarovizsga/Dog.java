package hu.nive.ujratervezes.zarovizsga;

public abstract class Dog {
    protected String name;
    protected int happiness;

    public Dog(String name) {
        this.name = name;
        happiness = 0;
    }

    public String getName() {
        return name;
    }

    public int getHappiness() {
        return happiness;
    }

    public abstract void feed();

    public abstract void play(int hours);
}
