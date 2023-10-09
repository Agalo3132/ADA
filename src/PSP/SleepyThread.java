package PSP;

import static PSP.ThreadColors.*;

class unHIlo extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + currentThread().getName());
        try {
            Thread.sleep(5000, 500);

        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "El hil oha sido interrumpido");
        }
        System.out.println(ANSI_BLUE + "ha pasado el tiempo");
    }
}

public class SleepyThread {



    public static void main(String[] args) {

        Thread thread = new unHIlo();
        thread.setName("UN HILO SECUNDARIO");
        thread.start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hilo de clase anonima");
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        //thread.interrupt();





        System.out.println(ANSI_RESET + "Hilo principal");

    }
}
