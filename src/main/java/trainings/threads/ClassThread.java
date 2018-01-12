package trainings.threads;

public class ClassThread extends Thread {

    @Override
    public void run() {
        System.out.println("Extends Thread");
    }

    public static void main(String[] args) {
        new ClassThread().start();
        System.out.println(Thread.currentThread().getName());
    }
}
