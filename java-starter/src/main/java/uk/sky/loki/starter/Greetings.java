package uk.sky.loki.starter;

import com.google.common.base.Preconditions;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Greetings {

    public void greet(@NonNull Writer writer, @NonNull List<String> names) throws IOException {

        Preconditions.checkNotNull(names);
        Preconditions.checkNotNull(writer);

        if (names.isEmpty()) {
            names = Arrays.asList("Loki");
        }

        String greetings = names.stream().collect(Collectors.joining(", "));

        writer.write("Hello " + greetings + "!");
    }
}
