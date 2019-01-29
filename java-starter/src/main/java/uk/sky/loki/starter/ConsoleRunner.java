package uk.sky.loki.starter;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class ConsoleRunner {

    public static void main(String[] args) throws IOException {

        Greetings greetings = new Greetings();
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"));
//        greetings.greet(printWriter, args[1]);
        greetings.greetMany(printWriter, args);
        printWriter.flush();
    }


}
