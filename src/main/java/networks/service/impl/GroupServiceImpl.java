package networks.service.impl;

import networks.dao.GroupDao;
import networks.dao.impl.GroupDaoImpl;
import networks.model.Group;
import networks.service.GroupService;

import java.util.List;

public class GroupServiceImpl implements GroupService {
    @Override
    public List<Group> getAll() {
        GroupDao groupDao = new GroupDaoImpl();
        return groupDao.getAll();
    }

    @Override
    public List<Group> getByNameOfGroup(String name) {
        GroupDao groupDao = new GroupDaoImpl();
        return groupDao.getByNameOfGroup(name);
    }
}
