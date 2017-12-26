package trainings.enumaration.factory.factories;

import trainings.enumaration.factory.transportInterfaces.Car;
import trainings.enumaration.factory.TypesOfTransport.CarType;
import trainings.enumaration.factory.carsImpl.Jeep;
import trainings.enumaration.factory.carsImpl.Lada;

public class CarFactory {
    public Car selectCars(CarType carType) {
        switch (carType) {
            case LADA:
                return new Lada();
            case JEEP:
                return new Jeep();
        }
        return null;

    }
}
