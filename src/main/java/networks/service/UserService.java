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
        return userDao.getFirst();
    }

    public User getLast() {
        UserDao userDao = new UserDao();
        return userDao.getLast();
    }

    public List<User> getByName(String name) {
        UserDao userDao = new UserDao();
        return userDao.getByName(name);
    }

    public List<User> getByAge(int age) {
        UserDao userDao = new UserDao();
        return userDao.getByAge(age);
    }
}
