package ADA;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ejerec1 {
    public static void main(String[] args) {

        Path path = Path.of("src/File/File.txt");


        try (Stream<String> stringStream = Files.lines(path)) {
            List<String> lineas = Files.readAllLines(path);
            Pattern p = Pattern.compile("\\p{javaWhitespace}+");

            System.out.println(stringStream.flatMap(s -> p.splitAsStream(s)).count());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
