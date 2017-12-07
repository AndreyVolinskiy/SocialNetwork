package trainings;

public class Code {

    public String name = "Fil";
    protected int count;
    boolean indicator = true;
    private char simbol = 50;


    public void print() {
        System.out.println("Printing...");
    }
    protected int number() {
        return 2;
    }

    double sqrt(int number) {
        return Math.sqrt(number);
    }

    private void doSomethingPrivate() {
        System.out.println("doSomethingPrivate");
    }
}
