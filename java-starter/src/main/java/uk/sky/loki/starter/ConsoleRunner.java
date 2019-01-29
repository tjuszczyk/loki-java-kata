package uk.sky.loki.starter;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class ConsoleRunner {

    public static void main(String[] args) throws IOException {
        String name = new InputNameAnalyser().computeNameFromProgramInputs(args);
        new Greetings().greet(new OutputStreamWriter(System.out, "UTF-8"), name);
    }


}
