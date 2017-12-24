package networks.service;

import networks.model.User;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public interface UserService {

    List<User> getAll();

    User getFirst();

    User getLast();

    List<User> getByName(String name);

    List<User> getByAge(int age);

    void changePassword(User user, String newPassword);

    void happyBirthday(User user, LocalDate localDate);

    void create(User user) throws IOException;

    String encrypt(String strirg);

    String decrypt(String strirg);
}
