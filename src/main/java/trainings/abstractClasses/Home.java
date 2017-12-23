package trainings.abstractClasses;

public class Home extends Institute {
    @Override
    void serve() {
        System.out.println("Go to the army");
    }

    @Override
    void study() {
        System.out.println("Stay at home");
    }
}
