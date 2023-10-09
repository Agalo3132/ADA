package PSP;
import static PSP.ThreadColors.ANSI_BLUE;

public class Hilito extends Thread{

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "soy el hilo " + currentThread().getName());


        try {
            System.out.println(ANSI_BLUE + "Durmiendo");
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "alguien me ha despertado");
            return;
        }
        System.out.println(ANSI_BLUE + "ya estoy despierto");

    }

    public static void main(String[] args) {



    }
}
