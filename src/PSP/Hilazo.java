package PSP;

import java.util.Scanner;

import static PSP.ThreadColors.ANSI_BLUE;

public class Hilazo extends Thread{
    Scanner sc = new Scanner(System.in);


    @Override
    public void run() {
        System.out.println("Inserta un número: ");
        int str = sc.nextInt();
        int n = 0;
        for (int i = 0; i <= str; i++) {
            n = n + i;

            System.out.println(n);
        }


    }

}
