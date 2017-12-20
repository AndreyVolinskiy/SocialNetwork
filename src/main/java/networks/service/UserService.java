package networks.service;

import networks.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User getFirst();

    User getLast();

    List<User> getByName(String name);

    List<User> getByAge(int age);

    void changePassword(User user, String newPassword);

    void happyBirthday(User user);
}
