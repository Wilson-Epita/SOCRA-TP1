package com.epita.socra.app;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.epita.socra.app.tools.IOAdapter;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void givenAMock_WhenRunningMain_AskToConvertToRoman_with10() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("10");
        App app = new App(mock);
        app.run();

        verify(mock).write("Type a number:");
        verify(mock).write(argThat(message -> message.contains("X")));
    }

    @Test
    public void givenAMock_WhenRunningMain_AskToConvertToRoman_with1000() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("1000");
        App app = new App(mock);
        app.run();

        verify(mock).write("Type a number:");
        verify(mock).write(argThat(message -> message.contains("M")));
    }

    @Test
    public void givenAMock_WhenRunningMain_AskToConvertToArabic_with10() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("X");
        App app = new App(mock);
        app.run();

        verify(mock).write("Type a number:");
        verify(mock).write(argThat(message -> message.contains("10")));
    }

    @Test
    public void givenAMock_WhenRunningMain_AskToConvertToArabic_with1000() {
        IOAdapter mock = mock(IOAdapter.class);
        when(mock.read()).thenReturn("M");
        App app = new App(mock);
        app.run();

        verify(mock).write("Type a number:");
        verify(mock).write(argThat(message -> message.contains("1000")));
    }
}
