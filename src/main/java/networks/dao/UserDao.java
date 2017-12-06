package networks.dao;

import networks.data.Database;
import networks.model.User;

public class UserDao {

    public User[] getAll() {
        return Database.getAllUsers();
    }
}
