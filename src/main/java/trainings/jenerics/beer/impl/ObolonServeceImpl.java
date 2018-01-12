package trainings.jenerics.beer.impl;

import trainings.jenerics.beer.Beer;
import trainings.jenerics.beer.ObolonService;
import trainings.jenerics.beer.model.Obolon;

import java.util.List;

public class ObolonServeceImpl implements ObolonService {

    Beer<String> beer = new Beer<>();

    @Override
    public void save(Obolon type) {
//        beer.setType(type);
    }

    @Override
    public void update(Obolon entity) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Obolon> findAll() {
        return null;
    }
}
