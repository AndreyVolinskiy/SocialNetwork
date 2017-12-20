package networks.controller;

import networks.model.User;
import networks.service.UserService;
import networks.service.impl.UserServiceImpl;

import java.time.LocalDate;

public class UserController {

    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        User first = userService.getFirst();

        String newPassword = "sjdhbvkj";

//        userService.changePassword(first, newPassword);

        User user = new User();
        user.setName("Alex");
        user.setEmail("mamashka2@gmail.com");
        user.setBirthday(LocalDate.now());


        LocalDate now = LocalDate.now();
        userService.happyBirthday(user);



    }

}
