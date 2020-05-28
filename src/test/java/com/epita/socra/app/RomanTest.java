package com.epita.socra.app;

import com.epita.socra.app.tools.IOAdapter;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

public class RomanTest {

        @Test
        public void toRomanRegularCases() {
            var inputs = new ArrayList<Integer>();
            var outputs = new ArrayList<String>();
            inputs.add(1);
            outputs.add("I");

           for (var i = 0; i < inputs.size(); ++i) {
                assert (Roman.toRoman(inputs.get(i)).equals(outputs.get(i)));
           }
    }
}
