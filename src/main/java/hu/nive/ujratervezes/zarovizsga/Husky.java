package hu.nive.ujratervezes.zarovizsga;

public class Husky extends Dog{


    public Husky(String name) {
        super(name);
    }

    @Override
    public void feed() {
        happiness += 4;
    }
    @Override
    public void play(int hours){
        happiness = happiness + (hours * 3);
    }
}
