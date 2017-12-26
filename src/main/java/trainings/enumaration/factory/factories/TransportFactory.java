package trainings.enumaration.factory.factories;

import trainings.enumaration.factory.transportInterfaces.Car;
import trainings.enumaration.factory.transportInterfaces.Flights;

public interface TransportFactory {

    Car createCar();

    Flights createFlight();
}
