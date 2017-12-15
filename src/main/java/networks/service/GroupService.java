package networks.service;

import networks.dao.GroupDao;
import networks.dao.PostDao;
import networks.model.Group;
import networks.model.Post;

import java.util.LinkedList;
import java.util.List;

public class GroupService {

    public List<Group> getAll() {
        GroupDao groupDao = new GroupDao();
        return groupDao.getAll();

    }

    public List<Group> getByNameOfGroup(String name) {
        List<GroupDao> groupDao = new LinkedList<>();
        return groupDao.getByNameOfGroup(name);
    }
}
