package PSP;
import static PSP.ThreadColors.ANSI_RED;
import static PSP.ThreadColors.ANSI_RESET;

public class MainHIlos {

    public static void main(String[] args) {
        Thread hilito = new Hilito();
        hilito.setName("SECUNDARIO");
        hilito.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "runnable hilo");

                try {
                    hilito.join(2000);
                    System.out.println(ANSI_RED + "hilito ha terminado y me ejecuto");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "interrumpido");
                }
            }
        }).start();



        //deja de dormir
        //hilito.interrupt();



        System.out.println(ANSI_RESET + "hilo principal");

    }
}
