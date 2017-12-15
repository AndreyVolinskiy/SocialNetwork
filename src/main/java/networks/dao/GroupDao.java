package networks.dao;

import networks.Exception.NoGroupFoundException;
import networks.Exception.NoPostFoundException;
import networks.data.Database;
import networks.model.Group;
import networks.model.Post;

import java.util.LinkedList;
import java.util.List;

public class GroupDao {

    public List<Group> getAll() {
        return Database.getAllGroups();
    }

    public List<Group> getByNameOfGroup(String name) {
        List<Group> tempGroup = new LinkedList<>();
        List<Group> groupList = Database.getAllGroups();
        for (Group group : groupList) {
            if (group.getByNameOfGroup().equals(name)) {
                System.out.println("User by name:");
                tempGroup.add(group);
                if (tempGroup.size() == 0) {
                    throw new NoGroupFoundException();
                }
                return tempGroup;
            }
        }
        return null;
    }
}
