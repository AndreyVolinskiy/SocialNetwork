package trainings.enumaration.factory;

import trainings.enumaration.factory.TypesOfTransport.CarType;
import trainings.enumaration.factory.TypesOfTransport.FlightType;
import trainings.enumaration.factory.factories.CarFactory;
import trainings.enumaration.factory.factories.FlightFactory;
import trainings.enumaration.factory.factories.UsaFactory;
import trainings.enumaration.factory.factories.UssrFactory;

public class Main {

    public static void main(String[] args) {


        UssrFactory ussrFactory = new UssrFactory();
        ussrFactory.createCar().drive();

        UsaFactory usaFactory = new UsaFactory();
        usaFactory.createFlight().sell();

    }
}
