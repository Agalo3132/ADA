package ADA;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileListing {

    public static void main(String[] args) {

        Path path = Path.of("");

        /*
        //list, no es recursivo, no entra a subniveles
        try (Stream<Path> paths = Files.list(path)) {

            paths.forEach(path1 -> System.out.println(listDir(path1)));

            //paths.forEach(System.out::println);
            //paths.filter(path1 -> Files.isDirectory(path1)).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException();
        }
        */


        //walk, es recursivo, entra a todos los directorios y subdirectorios
        //- 0 directorio root
        //- 1 directorio actual
        //- num directorios hijos a este nivel
        //si no pongo nada entra a todo
        /*
        try (Stream<Path> paths = Files.walk(path, Integer.MAX_VALUE)) {
            paths
                    .filter(path1 -> Files.isRegularFile(path1))
                    .forEach(path1 -> System.out.println(listDir(path1)));

            //paths.forEach(path1 -> System.out.println(listDir(path1)));

        } catch (IOException e) {
            throw new RuntimeException();
        }
         */
                                                                        //atributos de ese path
        try (Stream<Path> paths = Files.find(path, Integer.MAX_VALUE, ((p, attr) -> attr.isRegularFile() && attr.size() > 300))) {
            paths
                    .forEach(path1 -> System.out.println(listDir(path1)));

            //paths.forEach(path1 -> System.out.println(listDir(path1)));

        } catch (IOException e) {
            throw new RuntimeException();
        }

        /*
        //sin profundidad, pero utiliza iteradores
        try (Stream<Path> paths = Files.newDirectoryStream(path) {
            paths
                    .forEach(path1 -> System.out.println(listDir(path1)));

            //paths.forEach(path1 -> System.out.println(listDir(path1)));

        } catch (IOException e) {
            throw new RuntimeException();
        }
         */



    }

    public static String listDir(Path path) {
        boolean isDir = Files.isDirectory(path);
        try {
            return Files.getLastModifiedTime(path) + " \t\t"
                    + (isDir ? "<DIR>\t" :"\t\t\t") + Files.size(path) + "\t\t\t" + path;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
