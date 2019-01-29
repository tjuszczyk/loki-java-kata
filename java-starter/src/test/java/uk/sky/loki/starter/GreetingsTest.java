package uk.sky.loki.starter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringWriter;


public class GreetingsTest {

    @Test
    public void greetingsShouldPrintGreetings() throws IOException {
        StringWriter writer = new StringWriter();
        new Greetings().greet(writer, "Loki");

        Assertions.assertThat(writer.toString()).isEqualTo("Hello Loki!");
    }

    //KATA 1.1.7 add more tests

}