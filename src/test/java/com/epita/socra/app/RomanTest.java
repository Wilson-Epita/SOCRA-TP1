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
    public void toRomanConvert1(){
            assert (Roman.toRoman(1).equals("I"));
    }

    @Test
    public void toRomanConvert7(){
        assert (Roman.toRoman(7).equals("VII"));
    }

    @Test
    public void toRomanConvert8(){
        assert (Roman.toRoman(8).equals("VIII"));
    }

    @Test
    public void toRomanConvert9(){
        assert (Roman.toRoman(9).equals("IX"));
    }
    @Test
    public void toRomanConvert142(){
        assert (Roman.toRoman(142).equals("CXLII"));
    }

    @Test
    public void toRomanConvert2691(){
        assert (Roman.toRoman(2691).equals("MMDCXCI"));
    }

    @Test
    public void toRomanNegativeNumber(){
        assert (Roman.toRoman(-1).equals(""));
    }

    @Test
    public void toRomanOutOfRange(){
        assert (Roman.toRoman(3002).equals(""));
    }

    @Test
    public void imputToRomanFromString1() {
        assert (Roman.inputToRoman("1").equals("I"));
    }

    @Test
    public void inputToRomanWithNegativeValue(){
        assert (Roman.inputToRoman("-1").equals(""));
    }

    @Test
    public void inputToRomanWithOutOfRangeValue(){
        assert (Roman.inputToRoman("5004").equals(""));
    }

    @Test
    public void inputToRomanWithInvalidInput(){
        assert (Roman.inputToRoman("Bonjour").equals(""));
    }
}
