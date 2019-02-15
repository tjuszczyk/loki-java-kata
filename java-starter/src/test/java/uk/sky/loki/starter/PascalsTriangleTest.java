package uk.sky.loki.starter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.stream.Stream;

class PascalsTriangleTest {

    @MethodSource("pascalsTriangle")
    @ParameterizedTest
    public void pascalTriangle(long expectedValue, int n, int k) throws IOException {
        //n = the row
        //k = the number from the left

        long actualValue = new PascalTriangle().pascalsTriangle(n, k);
        Assertions.assertThat(actualValue).isEqualTo(expectedValue);
    }

    @Test
    public void shouldThrowExceptionIfKIsGreaterThanN() throws IOException {
        //n = the row
        //k = the number from the left

        //given
        int n = 2;
        int k = 4;

        //then
        Assertions.assertThatThrownBy(
                () -> new PascalTriangle().pascalsTriangle(n, k)
        ).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void shouldThrowExceptionIfNegativeValuesPassedIn() {
        //given
        int n = -1;
        int k = -2;

        //then
        Assertions.assertThatThrownBy(
                () -> new PascalTriangle().pascalsTriangle(n, k)
        ).isInstanceOf(IllegalArgumentException.class);
    }

    private static Stream<Arguments> pascalsTriangle() {
        return Stream.of(
                Arguments.of(1, 0, 0),
                Arguments.of(3, 3, 1),
                Arguments.of(15, 6, 2)
        );
    }
}