package networks.dao;

import networks.data.Database;
import networks.model.User;

import java.util.List;

public class UserDao {

    public List<User> getAll() {
        return Database.getAllUsers();
    }

    public User getFirst() {
        return Database.getAllUsers().get(0);
    }
}
