package uk.sky.loki.starter;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class InputNameAnalyserTest {

    @Test
    public void shouldUseLokiAsDefault() {
        System.clearProperty("name");
        String name = new InputNameAnalyser().computeNameFromProgramInputs(null);

        Assertions.assertThat(name).isEqualTo("Loki");
    }

    @Test
    public void shouldUseFirstInputParamAsName() {
        String name = new InputNameAnalyser().computeNameFromProgramInputs(new String[]{"Tomasz"});

        Assertions.assertThat(name).isEqualTo("Tomasz");
    }

    @Test
    public void shouldUseSystemParameterAsName() {
        System.setProperty("name", "Tomasz");
        String name = new InputNameAnalyser().computeNameFromProgramInputs(new String[]{});

        Assertions.assertThat(name).isEqualTo("Tomasz");
    }

    @Test
    @Disabled
    //TODO KATA 1.2 decouple your code from System, args, env.......and then easily test
    public void shouldUseEnvironmentVarAsName() {
        System.getenv().put("name", "Tomasz");
        String name = new InputNameAnalyser().computeNameFromProgramInputs(new String[]{});

        Assertions.assertThat(name).isEqualTo("Tomasz");
    }

    //TODO KATA 1.2 add full test coverage/ consider data driven test (parameterised test)
}