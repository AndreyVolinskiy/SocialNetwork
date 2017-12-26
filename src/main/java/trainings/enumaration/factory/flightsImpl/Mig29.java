package trainings.enumaration.factory.flightsImpl;

import trainings.enumaration.factory.transportInterfaces.Flights;

public class Mig29 implements Flights {
    @Override
    public void fly() {
        System.out.println("Mig");
    }

    @Override
    public void sell() {
        System.out.println("One Million dollars");

    }
}
