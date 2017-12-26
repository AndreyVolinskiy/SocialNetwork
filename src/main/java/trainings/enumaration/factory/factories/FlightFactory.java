package trainings.enumaration.factory.factories;

import trainings.enumaration.factory.transportInterfaces.Flights;
import trainings.enumaration.factory.TypesOfTransport.FlightType;
import trainings.enumaration.factory.flightsImpl.F16;
import trainings.enumaration.factory.flightsImpl.Mig29;

public class FlightFactory {

    public Flights selectFlight(FlightType flightType) {
        switch (flightType) {
            case F16:
                return new F16();
            case MIG29:
                return new Mig29();
        }
        return null;
    }

}
