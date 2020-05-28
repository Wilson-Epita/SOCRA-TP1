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

}
