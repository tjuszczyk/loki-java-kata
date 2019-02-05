package uk.sky.loki.starter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class GreetingsTest {

    @Test
    public void shouldThrowNullPointerExceptionIfLokiTeamMembersIsNull() throws IOException {
        //given
        Greetings greetings = new Greetings();
        StringWriter stringWriter = new StringWriter();
        List<String> lokiMembers = null;

        //then
        Assertions.assertThatThrownBy(() -> {
            greetings.greet(stringWriter, lokiMembers);
        }).isInstanceOf(NullPointerException.class);
    }

    @Test
    public void shouldThrowNullPointerExceptionIfWriterIsNull() throws IOException {
        //given
        Greetings greetings = new Greetings();
        StringWriter stringWriter = null;
        List<String> lokiMembers = new ArrayList<>();

        //then
        Assertions.assertThatThrownBy(() -> {
            greetings.greet(stringWriter, lokiMembers);
        }).isInstanceOf(NullPointerException.class);
    }

    @MethodSource("createGreetingsWithNames")
    @ParameterizedTest
    public void shouldGreet(List<String> names, String expectedGreetingMessage) throws IOException{
        //given
        Greetings greetings = new Greetings();
        StringWriter stringWriter = new StringWriter();

        //when
        greetings.greet(stringWriter, names);

        //then
        Assertions.assertThat(stringWriter.toString()).isEqualTo(expectedGreetingMessage);
    }

    private static Stream<Arguments> createGreetingsWithNames() {
        return Stream.of(
                Arguments.of(Collections.emptyList(),"Hello Loki!"),
                Arguments.of(Arrays.asList("Remus"),"Hello Remus!"),
                Arguments.of(Arrays.asList("Remus", "Emma", "Ola", "Tomasz", "Chris", "Paul"),"Hello Remus, Emma, Ola, Tomasz, Chris, Paul!"),
                Arguments.of(Arrays.asList("Remus"),"Hello Remus!")
        );
    }

}