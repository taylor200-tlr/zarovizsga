package hu.nive.ujratervezes.zarovizsga;

public class Beagle extends Dog{

    public Beagle(String name) {
        super(name);
    }

    @Override
    public void feed() {
        happiness += 2;
    }
    @Override
    public void play(int hours){
        happiness = happiness + (hours * 2);
    }
}
