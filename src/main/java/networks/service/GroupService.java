package networks.service;

import networks.dao.GroupDao;
import networks.model.Group;

public class GroupService {

    public Group[] getAll() {
        GroupDao groupDao = new GroupDao();
        return groupDao.getAll();

    }
}
