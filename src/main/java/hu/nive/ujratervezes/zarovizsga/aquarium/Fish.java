package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class Fish {

    private String name;
    private int weight;
    private String color;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
    public abstract boolean hasMemoryLoss();

    public String status(){
        return (getName()+", weight: "+getWeight()+", color: "+getColor()+", short term memory loss: "+hasMemoryLoss());

    }
    public abstract void feed();

}
