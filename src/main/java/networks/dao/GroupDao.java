package networks.dao;

import networks.data.Database;
import networks.model.Group;

import java.util.List;

public class GroupDao {

    public List<Group> getAll() {
        return Database.getAllGroups();
    }
}
