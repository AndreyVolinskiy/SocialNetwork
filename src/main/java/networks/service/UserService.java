package networks.service;

import networks.dao.UserDao;
import networks.model.User;

public class UserService {

    public User[] getAll() {
        UserDao userDao = new UserDao();
        return userDao.getAll();

    }
}
