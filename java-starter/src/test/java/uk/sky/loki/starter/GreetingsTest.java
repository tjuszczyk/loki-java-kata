package uk.sky.loki.starter;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.*;

class GreetingsTest {


    @Test
    public void testWriterOutput() throws IOException {
        //given
        Greetings greetings = new Greetings();
        StringWriter stringWriter = new StringWriter();

        //when
        greetings.greet(stringWriter, "");

        //then
        assertEquals("Hello Loki!", stringWriter.toString());
        assertNotEquals("RANDOM", stringWriter.toString());
    }

    @Test
    public void shouldGreetWithName() throws IOException {
        //given
        Greetings greetings = new Greetings();
        StringWriter stringWriter = new StringWriter();

        //when
        greetings.greet(stringWriter, "Remus");

        //then
        assertEquals("Hello Remus!", stringWriter.toString());
    }

    @Test
    public void shouldGreetWithLokiWhenNameIsNull() throws IOException {
        //given
        Greetings greetings = new Greetings();
        StringWriter stringWriter = new StringWriter();

        //when
        greetings.greet(stringWriter, null);

        //then
        assertEquals("Hello Loki!", stringWriter.toString());
    }

    @Test
    public void shouldGreetMultipleLokiTeamMembers() throws IOException{
        //given
        Greetings greetings = new Greetings();
        StringWriter stringWriter = new StringWriter();
        String[] lokiMembers = {"Remus","Emma","Ola", "Tomasz","Chris","Paul"};

        //when
        greetings.greetMany(stringWriter, lokiMembers);

        //then
        assertEquals("Hello Remus, Emma, Ola, Tomasz, Chris, Paul!", stringWriter.toString());

    }

    @Test
    public void shouldGreetSingleLokiTeamMember() throws IOException{
        //given
        Greetings greetings = new Greetings();
        StringWriter stringWriter = new StringWriter();
        String[] lokiMembers = {"Remus"};

        //when
        greetings.greetMany(stringWriter, lokiMembers);

        //then
        assertEquals("Hello Remus!", stringWriter.toString());

    }

    @Test
    public void shouldGreetLokiIfNoLokiTeamMembers() throws IOException{
        //given
        Greetings greetings = new Greetings();
        StringWriter stringWriter = new StringWriter();
        String[] lokiMembers = new String[0];

        //when
        greetings.greetMany(stringWriter, lokiMembers);

        //then
        assertEquals("Hello Loki!", stringWriter.toString());

    }

    @Test
    public void shouldGreetLokiIfLokiTeamMembersIsNull() throws IOException{
        //given
        Greetings greetings = new Greetings();
        StringWriter stringWriter = new StringWriter();
        String[] lokiMembers = null;

        //when
        greetings.greetMany(stringWriter, lokiMembers);

        //then
        assertEquals("Hello Loki!", stringWriter.toString());

    }

}