package trainings.threads;

public class ClassRunnable implements Runnable{

    static boolean interrupted;
    @Override
    public void run() {
        System.out.println("Runnable");
        for (int i = 0; i < 15; i++) {
            System.out.println((Thread.currentThread().getName() + " " + i));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("enough");
            }
            if (!interrupted) {
                return;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new ClassRunnable());
        thread.start();
        thread.sleep(5000);
        thread.interrupt();
        interrupted = false;

    }
}
