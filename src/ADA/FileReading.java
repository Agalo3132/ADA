package ADA;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    //tipos de ficheros: bytes, caracteres
    //bytes: InputStream, InputStreamReader
    //caracteres: FileReader, BufferedReader

    public static void main(String[] args) {
        try (BufferedReader fr = new BufferedReader(new FileReader("src/File/File.txt"))){
            //char[] blockData = new char[100];
            //int data;
            String line;

            while ((line = fr.readLine()) != null) {
               // String content = new String(blockData, 0, data);
                System.out.println(line);
            }

            fr.lines().forEach(System.out::println);




        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
