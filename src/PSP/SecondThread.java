package PSP;

public class SecondThread extends Thread{
    @Override
    public void run() {
        System.out.println(ThreadColors.ANSI_BLUE + "Soy el " + currentThread().getName());
    }
}
