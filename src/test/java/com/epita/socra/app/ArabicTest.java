package com.epita.socra.app;

import org.junit.Test;

public class ArabicTest {
    @Test
    public void toArabicConvertI(){
        assert (Roman.toArabic("I").equals(1));
    }

    @Test
    public void toArabicConvertII() {
        assert (Roman.toArabic("II").equals(2));
    }

    @Test
    public void toArabicConvertIII() {
        assert (Roman.toArabic("III").equals(3));
    }

    @Test
    public void toArabicConvertIV() {
        assert (Roman.toArabic("IV").equals(4));
    }

    @Test
    public void toArabicConvertV() {
        assert (Roman.toArabic("V").equals(5));
    }

    @Test
    public void toArabicConvertVIII() {
        assert (Roman.toArabic("VIII").equals(8));
    }

    @Test
    public void toArabicConvertCXLII() {
        assert (Roman.toArabic("CXLII").equals(142));
    }

    @Test
    public void toArabicConvertMMDCXCI() {
        assert (Roman.toArabic("MMDCXCI").equals(2691));
    }

    @Test
    public void toArabicInvalidInput(){
        assert (Roman.toArabic("A").equals(-1));
    }

    @Test
    public void toArabicConvertM(){
        assert (Roman.toArabic("M").equals(1000));
    }

    @Test
    public void toArabicConvertD(){
        assert (Roman.toArabic("D").equals(500));
    }

    @Test
    public void toArabicConvertC(){
        assert (Roman.toArabic("C").equals(100));
    }

    @Test
    public void toArabicConvertL(){
        assert (Roman.toArabic("L").equals(50));
    }

    @Test
    public void toArabicConvertX(){
        assert (Roman.toArabic("X").equals(10));
    }

    @Test
    public void toArabicInvalidInput2(){
        assert (Roman.toArabic("B").equals(-1));
    }
}
