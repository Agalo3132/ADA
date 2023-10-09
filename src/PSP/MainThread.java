package PSP;

public class MainThread {

    //main thread
    public static void main(String[] args) {

        //hay 3 formas de crear hilos

        //1forma: heredo de thread, anulo o sobreescribo metodo run
        Thread hilo = new SecondThread();
        hilo.setName("*HILO SECUNDARIO*");
        hilo.start();

        //2forma
        Thread hiloAnonimo = new Thread() {
            @Override
            public void run() {
                System.out.println(ThreadColors.ANSI_GREEN + "hilo de clase anonima");
            }
        };
        hiloAnonimo.start();

        //2.5
        new Thread() {
            @Override
            public void run() {
                System.out.println(ThreadColors.ANSI_GREEN + "hilo de clase anonima");
            }
        }.start();




        System.out.println(ThreadColors.ANSI_BLACK + "Soy el hilo principal");


        //3 forma utilizando Runnable

        Thread runHilo = new Thread(new HiloRunnable());
        runHilo.start();

        //Con lambda
        Runnable r = () -> System.out.println(ThreadColors.ANSI_RED +  "hilo con lambda");
        Thread lambdaR = new Thread(r);
        lambdaR.start();


        Thread rAn = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println();
            }
        });
        rAn.start();



    }
}
