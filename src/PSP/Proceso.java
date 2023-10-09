package PSP;

import java.io.IOException;

public class Proceso {
    public static void main(String[] args) {

        //1



        String[] s = new String[]{"cmd","/c", "ping -n 3 google.com" };

        try {
            Process pr = Runtime.getRuntime().exec(s);

            //espera hasta que el proceso acabe, si es 0 va bien
            int code = pr.waitFor();

            if (code == 0) {
                System.out.println("Ha ido bien");
            } else {
                System.out.println("Fue mal");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //2

        ProcessBuilder pb = new ProcessBuilder("cmd","/c", "ping -n 3 google.com");
        try {
            Process po = pb.start();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
