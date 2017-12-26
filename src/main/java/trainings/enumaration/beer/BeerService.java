package trainings.enumaration.beer;

public class BeerService {

    public static void main(String[] args) {

        Beer beer = check(BeerType.KRONENBOURG);
        assert beer != null;
        beer.drink();
    }

    private static Beer check(BeerType beerType) {

        switch (beerType) {
            case OBOLON:
                return new Obolon();
            case KRONENBOURG:
                return new Kronenberg();
        }
        return null;
    }
}
