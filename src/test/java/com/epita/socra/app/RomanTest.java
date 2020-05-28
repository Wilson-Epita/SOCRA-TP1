package com.epita.socra.app;

import com.epita.socra.app.tools.IOAdapter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

public class RomanTest {
    @Test
    public void toRomanSmallCases(){
        var inputs = Arrays.asList(1, 7, 8, 9);
        var outputs = Arrays.asList("I", "VII", "VIII", "IX");
        for (var i = 0; i < inputs.size(); ++i) {
            assert (Roman.toRoman(inputs.get(i)).equals(outputs.get(i)));
        }
    }
    @Test
    public void toRomanMiddleCases(){
        var inputs = Arrays.asList(142, 263, 999);
        var outputs = Arrays.asList("CXLII", "CCLXIII", "CMXCIX");
        for (var i = 0; i < inputs.size(); ++i) {
            assert (Roman.toRoman(inputs.get(i)).equals(outputs.get(i)));
        }
    }

    @Test
    public void toRomanBiggerCases(){
        var inputs = Arrays.asList(1234, 2691, 3000);
        var outputs = Arrays.asList("MCCXXXIV", "MMDCXCI", "MMM");
        for (var i = 0; i < inputs.size(); ++i) {
            assert (Roman.toRoman(inputs.get(i)).equals(outputs.get(i)));
        }
    }

    @Test
    public void toRomanInvalidImputNumber(){
        var inputs = Arrays.asList(-1, 3002, 35000);
        for (var i = 0; i < inputs.size(); ++i) {
            assert (Roman.toRoman(inputs.get(i)).equals(""));
        }
    }

    @Test
    public void toRomanFromString() {
        var inputs = Arrays.asList("1", "2", "3");
        var outputs = Arrays.asList("I", "II", "III");
        for (var i = 0; i < inputs.size(); ++i) {
            assert (Roman.inputToRoman(inputs.get(i)).equals(outputs.get(i)));
        }
    }
}
