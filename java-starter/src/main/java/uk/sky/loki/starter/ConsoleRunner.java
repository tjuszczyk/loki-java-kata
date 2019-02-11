package uk.sky.loki.starter;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class ConsoleRunner {

    public static void main(String[] args) throws IOException {
        List<String> names = Arrays.asList(args);
        Greetings greetings = new Greetings();
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"));
        greetings.greet(printWriter, names);
        printWriter.flush();
    }
}