package networks.dao.impl;

import networks.exception.NoGroupFoundException;
import networks.dao.GroupDao;
import networks.data.Database;
import networks.model.Group;

import java.util.LinkedList;
import java.util.List;

public class GroupDaoImpl implements GroupDao {
    @Override
    public List<Group> getAll() {
        return Database.getAllGroups();
    }

    @Override
    public List<Group> getByNameOfGroup(String name) {
        List<Group> tempGroup = new LinkedList<>();
        List<Group> groupList = Database.getAllGroups();
        for (Group group : groupList) {
            if (group.getByNameOfGroup().equals(name)) {
                tempGroup.add(group);
            }
        }
        if (tempGroup.size() == 0) {
            throw new NoGroupFoundException();
        }
        return tempGroup;
    }
}
