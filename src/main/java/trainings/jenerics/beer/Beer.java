package trainings.jenerics.beer;

import trainings.jenerics.beer.model.Obolon;

public class Beer<T> {

    private T type;

    public T getType() {
        return type;
    }

    public void setType(Obolon type) {
        this.type = (T) type;
    }
}
