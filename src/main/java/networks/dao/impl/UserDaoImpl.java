package networks.dao.impl;

import networks.exception.NoUserFoundException;
import networks.dao.UserDao;
import networks.data.Database;
import networks.model.User;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<User> getAll() {
        return Database.getAllUsers();
    }

    @Override
    public User getFirst() {
        return Database.getAllUsers().get(0);
    }

    @Override
    public User getLast() {
        int size = Database.getAllUsers().size() - 1;
        return Database.getAllUsers().get(size);
    }

    @Override
    public List<User> getByName(String name) {
        List<User> tempUserList = new LinkedList<User>() {};
        List<User> userList = Database.getAllUsers();
        for (User user : userList) {
            if (name.equals(user.getName())) {
                tempUserList.add(user);
            }
        }
        if (tempUserList.size() == 0) {
            throw new NoUserFoundException();
        }
        return tempUserList;
    }

    @Override
    public List<User> getByAge(int age) {
        List<User> tempUser = new LinkedList<>();
        List<User> userList = Database.getAllUsers();
        for (User user : userList) {
            if (user.getAge() == age) {
                System.out.println("User by age:");
                tempUser.add(user);
            }
        }
        return tempUser;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void create(User user) throws IOException {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
