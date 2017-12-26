package trainings.enumaration.factory.carsImpl;

import trainings.enumaration.factory.transportInterfaces.Car;

public class Jeep implements Car {
    @Override
    public void drive() {
        System.out.println("Jeep");
    }

    @Override
    public void sell() {
        System.out.println("Costs 20000 USD");

    }
}
