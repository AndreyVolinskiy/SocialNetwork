package trainings.enumaration.factory.flightsImpl;

import trainings.enumaration.factory.transportInterfaces.Flights;

public class F16 implements Flights {
    @Override
    public void fly() {
        System.out.println("F16");
    }

    @Override
    public void sell() {
        System.out.println("2 million for F16");

    }
}
