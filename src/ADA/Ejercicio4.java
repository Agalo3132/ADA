package ADA;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Stream;

import static ADA.FileListing.listDir;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Path path = Path.of("src/ADA/File.txt");

        try (Stream<Path> paths = Files.walk(path, Integer.MAX_VALUE)) {
            paths
                    .filter(path1 -> Files.isRegularFile(path1))
                    .forEach(path1 -> System.out.println(listDir(path1)));





        } catch (IOException e) {
            throw new RuntimeException();
        }




    }

}
