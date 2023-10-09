package ADA;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Eje2 {
    public static void main(String[] args) {
        Path path = Path.of("src/File/File.txt");
        int c = 0;
        String l;

        try (BufferedReader b = Files.newBufferedReader(path)) {
            while ((l = b.readLine()) != null) {
                String[] str = l.split("\\s+");
                for (String string: str) {
                    if (string.length() < 4) {
                        c++;
                    }
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(c);
    }
}
