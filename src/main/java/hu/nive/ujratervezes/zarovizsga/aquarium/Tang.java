package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Tang extends Fish{
    public Tang(String name, int weight, String color) {
        super(name, weight, color);
    }

    @Override
    public boolean hasMemoryLoss() {
        return true;
    }

    @Override
    public void feed() {
        setWeight(getWeight()+1);
    }
}
