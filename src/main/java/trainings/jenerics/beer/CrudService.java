package trainings.jenerics.beer;

import trainings.jenerics.beer.model.AbstractBeer;
import trainings.jenerics.beer.model.Obolon;

import java.util.List;

public interface CrudService <T extends AbstractBeer, BEER_ID>{

    void save(T entity);

    void update(T entity);

    void delete(Long id);

    List<T> findAll();
}
