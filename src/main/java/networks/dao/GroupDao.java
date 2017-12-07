package networks.dao;

import networks.data.Database;
import networks.model.Group;

public class GroupDao {

    public Group[] getAll() {
        return Database.getAllGroups();
    }
}
