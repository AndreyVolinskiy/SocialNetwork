package trainings.enumaration.car;

public class Enum {

    public static void main(String[] args) {

        Car car = select(CarType.ZAZ);
        car.drive();


    }

    private static Car select(CarType carType) {

        switch (carType) {
            case HONDA:
                return new Honda();
            case MAZDA:
                return new Mazda();
            case ZAZ:
                return new Zaz();
            case HYUNDAY:
                return new Hyundai();
            case RENAULT:
                return new Renault();
        }
        return null;
    }


}

