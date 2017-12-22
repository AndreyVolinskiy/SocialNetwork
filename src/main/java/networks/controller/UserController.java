package networks.controller;

import networks.model.User;
import networks.service.UserService;
import networks.service.impl.UserServiceImpl;

import java.time.LocalDate;

public class UserController {

    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        User first = userService.getFirst();

//        String newPassword = "sjdhbvkj";
//        userService.changePassword(first, newPassword);


        LocalDate birthday = LocalDate.of(1981, 12, 22);
        first.setBirthday(birthday);
        LocalDate now = LocalDate.now();

        userService.happyBirthday(first, now);


    }

}
