package PSP;

public class MainEJer {
    public static void main(String[] args) {
        Thread hilazo = new Hilazo();
        hilazo.start();


        Runnable r = () -> System.out.println("Suma realizada con exito");
        Thread lr = new Thread(r);
        try {
            lr.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
