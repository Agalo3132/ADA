package ADA;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Eje3 {
    public static void main(String[] args) {
        Path path = Path.of("src/File/numeros.txt");
        int n = 0;
        int s = 0;
        String l;

        try (BufferedReader b = Files.newBufferedReader(path)) {
            while ((l = b.readLine()) != null) {
                String[] str = l.split(";");

                for (String string: str) {
                    try {
                        double db = Double.parseDouble(string);
                        s += n;
                        n++;
                    } catch (NumberFormatException e) {
                        throw new RuntimeException(e);
                    }

                }
            }

            if (n > 0) {
                int m = s / n;
                System.out.println(m);
            } else {
                System.out.println("Sin numeros");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
