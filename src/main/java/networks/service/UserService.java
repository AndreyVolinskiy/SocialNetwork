package networks.service;

import networks.dao.UserDao;
import networks.model.User;

import java.util.List;

public class UserService {

    public List<User> getAll() {
        UserDao userDao = new UserDao();
        return userDao.getAll();
    }

    public User getFirst() {
        UserDao userDao = new UserDao();
        return userDao.getAll().get(0);
    }
}
