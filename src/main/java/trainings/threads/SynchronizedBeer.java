package trainings.threads;

public class SynchronizedBeer {

    public static void main(String[] args) throws InterruptedException {


        SynchronizedBeer beer = new SynchronizedBeer();
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> beer.drinkBeer());
            thread.start();
        }
    }

    private void drinkBeer() {

        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                Thread.currentThread().setName("Boy" + i);
                System.out.println(Thread.currentThread().getName() + " is paying money for beer");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " is drinking beer with pleasure )))");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
