package uk.sky.java.stack;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StackOverflow {

    public static void main(String[] args) {
        operation(args,6,new String("TJ"));
    }

    public static String operation(String[] strings, long value, Object o){
        return Arrays.asList(strings).stream().map(s -> s+value+o).collect(Collectors.joining(","));
    }
}
