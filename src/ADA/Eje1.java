package ADA;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Eje1 {
    public static void main(String[] args) {
        Path path = Path.of("src/File/File.txt");
        int n = 0;
        int s = 0;
        String l;

        try (BufferedReader b = Files.newBufferedReader(path)) {
            while ((l = b.readLine()) != null) {
                s += l.length();
                n++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int pr = s/n;
        System.out.println(pr);
    }
}
