package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class DaVinciCode {


    public int encode(String path, char c) {
        int result;
        if ((c == '0') || (c == '1') || (c=='x')){
            try {
                List<String> lines = Files.readAllLines(Path.of(path));
                result = getSymbol(lines, c);
            } catch (IOException e) {
                throw new IllegalStateException("Can not read file", e);
            }

        }else {
            throw new IllegalArgumentException("Wrong symbol! '" + c +"'");
        }

        return result;

    }

    private int getSymbol(List<String> lines, char c) {
        int result = 0;
        for (String line : lines){
            for (char actualChar : line.toCharArray()){
                if (actualChar == c){
                    result++;
                }
            }
        }
        return result;
    }
}
