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
        System.out.println("");


        User userFirst = userService.getFirst();
        System.out.println(userFirst);
        System.out.println("");

        User userLast = userService.getLast();
        System.out.println(userLast);
        System.out.println("");


        User userByName = userService.getByName("Andrey");
        System.out.println(userByName);
        System.out.println("");

        User userByAge = userService.getByAge(25);
        System.out.println(userByAge);
        System.out.println("");
    }

}
