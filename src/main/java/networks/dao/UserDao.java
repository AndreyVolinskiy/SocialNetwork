package networks.dao;

import networks.Exception.NoFoundUserException;
import networks.data.Database;
import networks.model.User;

import java.util.LinkedList;
import java.util.List;

public class UserDao {

    public List<User> getAll() {
        return Database.getAllUsers();
    }

    public User getFirst() {
        System.out.println("The first user is:");
        return Database.getAllUsers().get(0);
    }

    public User getLast() {
        int size = Database.getAllUsers().size() - 1;
        System.out.println("The last user is:");
        return Database.getAllUsers().get(size);
    }

    public List<User> getByName(String name) {
        List<User> tempUserList = new LinkedList<User>() {};
        List<User> userList = Database.getAllUsers();
        for (User user : userList) {
            if (name.equals(user.getName())) {
                tempUserList.add(user);
            }
        }
        if (tempUserList.size() == 0) {
            throw new NoFoundUserException();
        }
        return tempUserList;
    }

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
}

