package networks.service;

import networks.dao.GroupDao;
import networks.model.Group;

import java.util.List;

public class GroupService {

    public List<Group> getAll() {
        GroupDao groupDao = new GroupDao();
        return groupDao.getAll();

    }

    public List<Group> getByNameOfGroup(String name) {
        GroupDao groupDao = new GroupDao();
        return groupDao.getByNameOfGroup(name);
    }
}
