package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.List;

//        addFish(), amivel halakat lehet hozzáadni
//        feed(), ami megeteti az összes halat az akváriumban, és ezzel megnöveli a súlyukat
//        removeFish(), eltávolít minden olyan halat az akváriumból, ami legalább 11 grammos
//        getStatus(), ami visszaadja a halak státuszát egy String listában

public class Aquarium {

    private List<Fish> fishInAquarium = new ArrayList<>();

    public void addFish(Fish fish) {
        fishInAquarium.add(fish);
    }

    public List<String> getStatus() {
        List<String> fishStatus = new ArrayList<>();
        if (fishInAquarium.size() > 0) {
            for (Fish actualFish : fishInAquarium) {
                fishStatus.add(actualFish.status());
            }
        }
        return fishStatus;
    }

    public void feed() {
        for (Fish actualFish : fishInAquarium) {
            actualFish.feed();
        }
    }

    public void removeFish() {
        List<Fish> smallFish = new ArrayList<>();
        for (Fish actualFish : fishInAquarium) {
            if (actualFish.getWeight() < 11) {
                smallFish.add(actualFish);
            }
        }
        fishInAquarium.clear();
        fishInAquarium.addAll(smallFish);
    }
}
