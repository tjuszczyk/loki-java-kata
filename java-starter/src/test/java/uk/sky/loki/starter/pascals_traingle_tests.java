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

class pascals_traingle_tests {

    @MethodSource("pascaltriangletest")
    @ParameterizedTest
    public void pascalTriangle(long expectedValue, int k, int n) throws IOException{
        //n = the row
        //k = the number from the left

        long actualValue = PascalTriangle.pascalsTriangle(k, n);
    Assertions.assertThat(actualValue).isEqualTo(expectedValue);
    }

    private static Stream<Arguments> pascaltriangletest() {
        return Stream.of(
                Arguments.of(1,0,0),
                Arguments.of(3,1,3),
                Arguments.of(15,2,6)

        );
    }

}