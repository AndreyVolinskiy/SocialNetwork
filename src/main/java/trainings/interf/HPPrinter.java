package trainings.interf;

public class HPPrinter implements printer{
    @Override
    public void print(String text) {
        System.out.println("It's HP printer!  " + text);
    }
}
