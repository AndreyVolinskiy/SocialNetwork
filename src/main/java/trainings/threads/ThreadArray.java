package trainings.threads;

import java.util.Random;

public class ThreadArray {


    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();
        int[] ints = new int[100];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = random.nextInt(100);
        }
//
//        for (int i = 0; i < ints.length; i++) {
//            System.out.print(ints[i] + " ");
//            Thread.sleep(100);
//        }

        System.out.println("");

        Thread fromStart = new Thread(new FromStart());
        Thread fromEnd = new Thread(new FromEnd());
        fromStart.start();
        fromStart.join();
        fromEnd.start();
    }

    public static class FromStart implements Runnable {
        @Override
        public void run() {
            Random random = new Random();
            int[] ints = new int[100];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = random.nextInt(100);
            }
            for (int i = 0; i < ints.length / 2; i++) {
                System.out.print(ints[i] + " ");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static class FromEnd implements Runnable {
        @Override
        public void run() {
            Random random = new Random();
            int[] ints = new int[100];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = random.nextInt(100);
            }
            for (int i = 0; i < ints.length / 2; i++) {
                System.out.print(ints[ints.length - 1 - i] + " ");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
