package ADA;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


class Student {
    private String name;
    private int age;
    private LocalDate birthday;

    public Student(String name, int age, LocalDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + birthday;
    }
}

public class FileWriting {

    public static void main(String[] args) {
        Path path = Path.of("src/File/student.csv");
        String header = "name,age,birthday";
        Student s = new Student("Patri", 23, LocalDate.now());
        Student s2 = new Student("Alvaro", 19, LocalDate.of(2004, 07, 8));
        List<Student> list = new ArrayList<>();
        list.add(s);
        list.add(s2);

        try {
            //StandardOpenOptions hay opciones para escribir o leer
            /**
             * CREATE: si no existe se crea
             * TRUNCATE_EXISTING: borra el contenido de la tabla
             * WRITE
             */
            Files.writeString(path, header + "\n");
            for (Student student: list) {
                Files.writeString(path, student.toString(), StandardOpenOption.APPEND);
            }

            Files.writeString(path, s.toString(), StandardOpenOption.APPEND);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //2
        List<String> studString = new ArrayList<>();
        studString.add(s.toString());
        studString.add(s2.toString());
        try {
            Files.writeString(path, header + "\n");
            //mas eficiente
            Files.write(path, studString, StandardOpenOption.APPEND);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //java 1
        //OutputStream, FileOutputStream -- bytes
        //FileWriter, BufferedWriter, PrintWriter --texto

        //3
        try (FileWriter fw = new FileWriter("src/File/fileWriter.csv")) {
            fw.write(header);
            fw.write(System.lineSeparator());//salto de linea
            fw.write(s.toString());

            for (Student student: list) {
                fw.write(student.toString());
                fw.write(System.lineSeparator());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //4
        try (PrintWriter fw = new PrintWriter("src/File/fileWriter2.csv")) {
            fw.println(header);

            for (Student student: list) {

                System.out.format("%d%c",1, 'e');

                fw.println(student.toString());
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        //5
        try (BufferedWriter fw = Files.newBufferedWriter(Path.of("src/File/fileWriter3.csv"))) {
            fw.write(header);
            fw.newLine();
            for (Student student: list) {
                fw.write(student.toString());
                fw.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /**
         * BufferedWriter -> tiene buffer, caracteres, new line para la separacion, se utiliza para escribir grandes cantidades de texto
         * FileWriter -> tiene un pequeño buffer, caracteres, no tiene separacion, cantidades de texto mas pequeñas
         * PrintWriter --> no buffer, caracteres, println para separacion,
         */







    }

}
