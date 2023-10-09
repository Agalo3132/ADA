package ADA;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Path path = Path.of(str);

        try (Stream<Path> paths = Files.list(path)) {
            Path tamaño = paths.filter(Files::isRegularFile).max((p1, p2) -> {
                try {
                    long tm1 = Files.size(p1);
                    long tm2 = Files.size(p2);
                    return Long.compare(tm1, tm2);

                } catch (IOException e) {
                    throw new RuntimeException(e);

                }
            }).orElse(null);

            if (tamaño != null) {
                System.out.println(tamaño.getFileName());
                System.out.println(Files.size(tamaño));
            } else {
                System.out.println("Nada");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
