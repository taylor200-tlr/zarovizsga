package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {
    public List<Character> uniqueChars(String text) {
        List<Character> characters = new ArrayList<>();
        if (text != null) {
            char[] chars = text.toCharArray();
            for (char actualChar: chars){
                if (!characters.contains(actualChar)){
                    characters.add(actualChar);
                }
            }
        } else {
            throw new IllegalArgumentException("Empty text!");
        }
        return characters;
    }
}
