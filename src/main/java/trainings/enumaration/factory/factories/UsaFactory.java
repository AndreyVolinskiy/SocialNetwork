package trainings.enumaration.factory.factories;

import trainings.enumaration.factory.TypesOfTransport.CarType;
import trainings.enumaration.factory.TypesOfTransport.FlightType;
import trainings.enumaration.factory.transportInterfaces.Car;
import trainings.enumaration.factory.transportInterfaces.Flights;

public class UsaFactory implements TransportFactory {
    @Override
    public Car createCar() {
        CarFactory carFactory = new CarFactory();
        return carFactory.selectCars(CarType.JEEP);
    }

    @Override
    public Flights createFlight() {
        FlightFactory flightFactory = new FlightFactory();
        return flightFactory.selectFlight(FlightType.F16);
    }
}
