package ADA;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Ejercicio2 {
    public static void main(String[] args) {
        Path path = Path.of(args[0]);

        try (Stream<Path> paths = Files.find(path, Integer.MAX_VALUE, ((p, attr) -> attr.isRegularFile() && p.getFileName().toString().equals("File.txt")))) {
            if (path != null) {
                System.out.println("Existe");
            }
        } catch (IOException e) {
            System.out.println("No existe");
        }

    }

}
