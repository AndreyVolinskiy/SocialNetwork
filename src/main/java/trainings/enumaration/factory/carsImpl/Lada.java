package trainings.enumaration.factory.carsImpl;

import trainings.enumaration.factory.transportInterfaces.Car;

public class Lada implements Car {
    @Override
    public void drive() {
        System.out.println("Lada");
    }

    @Override
    public void sell() {
        System.out.println("Costs 1000 USD");

    }
}
