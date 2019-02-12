package uk.sky.java.stack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class PascalTriangleTest {

    @Test
    public void stack_overflow() {
        PascalTriangle x = new PascalTriangle();
        Throwable cause = Assertions.catchThrowable(() -> System.out.println(x.pascal(10, 5)));
        Assertions.assertThat(cause).isInstanceOf(StackOverflowError.class);
    }

}