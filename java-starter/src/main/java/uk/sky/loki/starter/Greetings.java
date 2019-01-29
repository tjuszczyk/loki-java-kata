package uk.sky.loki.starter;

import java.io.IOException;
import java.io.Writer;

public class Greetings {
//  KATA 1.1
//    public void greet(){
//        System.out.println("Hello Loki!");
//    }

    //KATA 1.7
    public void greet(Writer writer, String name) throws IOException {
        writer.write(String.format("Hello %s!",name));
        writer.flush();
    }
}
