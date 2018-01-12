package trainings.threads;

public class JoinExample {

    public static void main(String[] args) throws InterruptedException {

        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }

        Thread first = new Thread(new First());
        Thread second = new Thread(new Second());
        first.start();
        first.join();
        System.out.println("");
        second.start();
    }

    public static class First implements Runnable {
        @Override
        public void run() {
            int[] ints = new int[10];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = i;
            }
            for (int i = 0; i < ints.length; i++) {
                System.out.print(ints[i] + " ");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Second implements Runnable {
        @Override
        public void run() {
            int[] ints = new int[10];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = i + 10;
            }
            for (int i = 0; i < ints.length; i++) {
                System.out.print(ints[i] + " ");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
