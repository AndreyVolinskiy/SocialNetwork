package trainings.threads;

public class ThreeThreads  {

    public static class ThreadTwo implements Runnable {

        public static void main(String[] args) {

            Thread threadOne = new Thread(new ThreadOne());
            Thread threadTwo = new Thread(new ThreadTwo());
            Thread threadThree = new Thread(new ThreadThree());
            threadOne.start();
            threadTwo.start();
            threadThree.start();

        }

        public static class ThreadOne implements Runnable {

            public static void main(String[] args) {

                Thread threadOne = new Thread(new ThreadOne());
                Thread threadTwo = new Thread(new ThreadTwo());
                Thread threadThree = new Thread(new ThreadThree());
                threadOne.start();
                threadTwo.start();
                threadThree.start();

            }

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + 10);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class ThreadThree implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + 20);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}



