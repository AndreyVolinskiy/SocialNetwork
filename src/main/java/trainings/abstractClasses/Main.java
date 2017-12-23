package trainings.abstractClasses;

public class Main {

    private static int number = 6456;
    private int count = 32165468;

    public static void print() {
        System.out.println("Static");
    }

    private void print2() {
        System.out.println("Non static");
    }


    public static void main(String[] args) {

//        Institute boy = new Army();
//        boy.serve();
//        boy.study();
//
//        Institute girl = new Home();
//        girl.study();
//        girl.serve();

        Main main = new Main();
        System.out.println(number);
        System.out.println(main.count);
        print();
        main.print2();

    }
}
