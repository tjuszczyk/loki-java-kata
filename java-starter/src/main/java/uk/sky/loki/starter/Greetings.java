package uk.sky.loki.starter;

import java.io.IOException;
import java.io.Writer;

public class Greetings {

    public void greet(Writer writer, String name) throws IOException {
        if (name == null || name.isEmpty()) {
            name = "Loki";
        }
        writer.write("Hello " + name + "!");
    }

    public void greetMany(Writer writer, String[] names) throws IOException {
        if (names == null || names.length == 0) {
            names = new String[1];
            names[0] = "Loki";
        }

        String greetings = "";

        for(String name : names){
            greetings += name + ", ";
        }

        greetings = greetings.substring(0, greetings.length() -2);
        String sentence =  "Hello " + greetings + "!";

        writer.write(sentence);
    }
}
