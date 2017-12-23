package networks.service.impl;

import networks.dao.GroupDao;
import networks.dao.factory.DaoFactory;
import networks.dao.impl.GroupDaoImpl;
import networks.model.Group;
import networks.service.GroupService;

import java.util.List;

public class GroupServiceImpl implements GroupService {
    @Override
    public List<Group> getAll() {
        GroupDao groupDao = DaoFactory.getGroupDao();
        return groupDao.getAll();
    }

    @Override
    public List<Group> getByNameOfGroup(String name) {
        GroupDao groupDao = DaoFactory.getGroupDao();
        return groupDao.getByNameOfGroup(name);
    }
}
