package com.epita.socra.app;

import com.epita.socra.app.tools.*;

import java.util.regex.Pattern;

/**
 * Hello world!
 */
public final class App {
    private IOAdapter adapter;

    private App() {
        this(new ConsoleAdapter());
    }

    public App(IOAdapter adapter) {
        this.adapter = adapter;
    }

    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        App application = new App();
        application.run();
    }

    public void run(){
        adapter.write("Type a number:");
        String input = adapter.read();
        if (input.matches("[MDCLXVI]+")) {
            var stock = Roman.toArabic(input);
            adapter.write(stock.toString());
        }
        //else if (Pattern.matches(input, "[0-9]+"))
        else if (input.matches("[0-9]+"))
        {
            adapter.write(Roman.inputToRoman(input));
        }
        else
        {
            adapter.write("Invalid Number");
        }
    }
}
