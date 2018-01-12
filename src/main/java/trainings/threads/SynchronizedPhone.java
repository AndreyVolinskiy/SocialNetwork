package trainings.threads;

public class SynchronizedPhone {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            SynchronizedPhone phone = new SynchronizedPhone();
            Thread thread = new Thread(() -> phone.call());
            thread.start();
        }

    }

    private  void call() {
        for (int i = 0; i < 10; i++) {
            Thread.currentThread().setName("Man" + i);
            System.out.println(Thread.currentThread().getName() + " Enter into phone box");
            try {
                Thread.sleep(1000);
                System.out.println("Out of box");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
