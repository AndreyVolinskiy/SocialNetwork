package networks.dao;

import networks.data.Database;
import networks.model.User;

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

    public User getByName(String name) {
        User tempUser = null;
        List<User> userList = Database.getAllUsers();
        for (User user : userList) {
            if (user.getName().equals(name)) {
                System.out.println("User by name:");
                tempUser = user;
            }
        }
        return tempUser;
    }

    public User getByAge(int age) {
        User tempUser = null;
        List<User> userList = Database.getAllUsers();
        for (User user : userList) {
            if (user.getAge() == age) {
                System.out.println("User by age:");
                tempUser = user;
            }
        }
        return tempUser;
    }
}

