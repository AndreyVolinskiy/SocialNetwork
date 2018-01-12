package networks.service;

import networks.model.AbstractEntity;

import java.io.IOException;
import java.util.List;

public interface CrudService <T extends AbstractEntity> {

    void update(T entity);

    void create(T entity) throws IOException;

    void delete(long id);

    List<T> findAll();



}
