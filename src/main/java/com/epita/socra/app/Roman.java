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

    private static int roman_digit_value(char digit){
        switch (digit) {
            case 'M':
                return 1000;

            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            default :
                return 1;
        }
    }

    public static Integer toArabic(String roman)
    {
        var input_patern = "[MDCLXVI]+";
        if (!Pattern.matches(input_patern, roman))
            return -1;
        var res = 0;

        var roman_len = roman.length();
        for (var i = 0; i < roman_len; ++i) {
            var current_char_value = roman_digit_value(roman.charAt(i));
            res += current_char_value;

            if (i + 1 < roman_len) {
                var next_char_value = roman_digit_value(roman.charAt(i + 1));
                if (next_char_value > current_char_value) {
                    res += next_char_value - 2 * current_char_value;
                    ++i;
                }
            }
        }
        return res;
    }

}
