package com.epita.socra.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Roman {
    public static String toRoman(int decimal)
    {
        if (decimal < 0 || decimal > 3000)
            return "";

        var unit = new ArrayList<String>(Arrays.asList("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"));
        var dec = new ArrayList<String>(Arrays.asList("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"));
        var cent = new ArrayList<String>(Arrays.asList("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"));
        var mill = new ArrayList<String>(Arrays.asList("", "M", "MM", "MMM"));
        return mill.get(decimal / 1000) + cent.get((decimal / 100) % 10) + dec.get((decimal / 10) % 10) + unit.get(decimal % 10);
    }

    public static String inputToRoman(String decimal){
        var input_patern = "[0-9]+";
        if (!Pattern.matches(input_patern, decimal))
            return "";

        Integer result = Integer.parseInt(decimal);
        return toRoman(result);
    }
}
