package ADA;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Stream;

import static ADA.FileListing.listDir;

public class FileListing2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ruta = sc.nextLine();

        Path path = Path.of(ruta);

        try (Stream<Path> paths = Files.list(path)) {
            System.out.println(paths.map(p -> {
                try {
                    return (int) (Files.size(p));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }).max((o1, o2) -> o2 - o1).get());

        } catch (IOException e) {
            throw new RuntimeException();
        }





    }


}
