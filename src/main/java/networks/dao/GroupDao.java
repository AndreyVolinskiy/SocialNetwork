package networks.dao;

import networks.model.Group;

import java.util.List;

public interface GroupDao {

    List<Group> getAll();

    List<Group> getByNameOfGroup(String name);
}
