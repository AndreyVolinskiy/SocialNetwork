package networks.dao;

import networks.model.User;

import java.util.List;

public interface UserDao extends CrudDao<User>{

     List<User> getAll();

     User getFirst();

     User getLast();

     List<User> getByName(String name);

     List<User> getByAge(int age);
}

