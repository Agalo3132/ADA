package ADA;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class FileReading2 {
    public static void main(String[] args) {
        Path path = Path.of("ADA/File.txt");
        try {
            Stream<String> stringStream = Files.lines(path);
            Pattern p = Pattern.compile("\\p{javaWhitespace}+");
            //Files.readAllLines(path).stream();
            //Files.lines(path);

            stringStream
                    .flatMap(s -> p.splitAsStream(s))
                    .filter(s -> s.equals("programacion"))
                    .count();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
