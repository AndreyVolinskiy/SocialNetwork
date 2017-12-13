package networks.controller;

import networks.model.User;
import networks.service.UserService;

import java.util.List;

public class UserController {

    public static void main(String[] args) {

        UserService userService = new UserService();
        List<User> users = userService.getAll();
        for (User elem : users) {
            System.out.println(elem);
        }

        System.out.println(userService.getFirst());

    }

}
