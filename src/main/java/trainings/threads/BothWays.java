package trainings.threads;

public class BothWays {

    public static void main(String[] args) {

        Thread thread = new Thread(new Awesome(),"Awesome thread");
        thread.start();
        System.out.println("Hello main");
        System.out.println(Thread.currentThread().getName());

        MyAwesome myAwesome = new MyAwesome();
        myAwesome.start();
    }

    private static class Awesome implements Runnable {

        @Override
        public void run() {
            System.out.println("Hello Runnable");
            System.out.println(Thread.currentThread().getName());
        }
    }

    private static class MyAwesome extends Thread {

        {
            setName("MyAwesome thread");
        }

        @Override
        public void run() {
            System.out.println("Hello Thread");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
