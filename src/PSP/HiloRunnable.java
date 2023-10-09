package PSP;

public class HiloRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ThreadColors.ANSI_RED + "Soy un hilo runnable");
    }
}
