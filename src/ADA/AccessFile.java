package ADA;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * [
 * "student1": {
 *     "name": "Patri",
 *     "age": 41,
 *     "birthday": "12/02/1998"
 *     "address": [
 *     {},
 *     {}
 *     ]
 * },
 * {
 *
 * },
 * {
 *
 * }
 * ]
 */

public class AccessFile {
    public static void main(String[] args) {
        try (RandomAccessFile ra = new RandomAccessFile("src/File/enteros.txt", "rw")) {

            /**
            ra.writeUTF("hola soy un fichero de" + " acceso aleatorio");


            ra.seek(0);
            ra.writeInt(4);
            System.out.println(ra.getFilePointer());
            ra.seek(ra.length());
            ra.writeBoolean(true);
             **/


            //ra.writeInt(1);
            //ra.writeShort(4);

            ra.seek(4);
            System.out.println(ra.readShort());
            ra.seek(ra.length());
            System.out.println(ra.readLong());

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
