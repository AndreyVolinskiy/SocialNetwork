package networks.dao;

import networks.model.User;

import java.util.List;

public interface UserDao {

     List<User> getAll();

     User getFirst();

     User getLast();

     List<User> getByName(String name);

     List<User> getByAge(int age);
}

