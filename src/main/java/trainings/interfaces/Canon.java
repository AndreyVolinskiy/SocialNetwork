package trainings.interfaces;

public class Canon implements printer {
    @Override
    public void print(String text) {
        System.out.println("It.s a Canon Printer!)) " + text);
    }
}
