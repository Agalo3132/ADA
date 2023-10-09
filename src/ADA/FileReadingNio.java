package ADA;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileReadingNio {

    //Character set
    //letras, numeros, simbolos, signos de puntuacion

    /**
     * caracter se le asigna un codigo numerico unico conocido como CODE POINT
     * 2 conjuntos de caracteres mas comunes ASCII y Unicode
     * ASCII -> Más viejo
     * Unicode -> Más reciente
     *
     * Character encoding, consiste en codificar los caracteres en numeros -> glifos
     * Glifo -> caracat, alfanu, emoji, simbolo, signo punf
     * ASCII --> codificaciones: US-ASCII(7bits), ISO(8bits)
     * Unicode --> codific. UTF-8(var1-4bytes), UTF-16, UTF-32
     */
    public static void main(String[] args) {
        System.out.println(System.getProperty("file.encoding"));
        System.out.println(Charset.defaultCharset());


        Path path = Path.of("src/File/File.txt");
        try (Stream<String> stringStream = Files.lines(path)) {
            //4 metodos --> leen el fichero en memoria
            //almacenan hasta 2 gigabytes

            //devuelve byte[], cierra automaticamente
            System.out.println(new String(Files.readAllBytes(path)));

            //devuelve una lista de strings, cierra en memoria
            System.out.println((Files.readAllLines(path)));

            //devuelve un string
            System.out.println(Files.readString(path));

            //devuelve  un Stream de Strings, ope.ter, cerrarse(try-with-r)
            stringStream.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
