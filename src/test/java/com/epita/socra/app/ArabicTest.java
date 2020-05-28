package com.epita.socra.app;

import org.junit.Test;

public class ArabicTest {
    @Test
    public void toArabicConvertI(){
        assert (Roman.toArabic("I").equals(1));
    }
}
