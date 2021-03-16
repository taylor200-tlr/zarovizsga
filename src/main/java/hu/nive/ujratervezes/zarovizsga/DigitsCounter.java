package hu.nive.ujratervezes.zarovizsga;

import java.util.ArrayList;
import java.util.List;

public class DigitsCounter {
    public int getCountOfDigits(String s) {
        List<Character> characters = new ArrayList<>();
        int result = 0;
        if ((s == null) || (s.length() < 1)) {
            return result;
        }
        for (int i = 0; i < s.length(); i++) {

            if(Character.isDigit(s.charAt(i))){
                if (!characters.contains(s.charAt(i))){
                    characters.add(s.charAt(i));
                }
            }

        }
        return characters.size();
    }
}
