package networks.controller;

import networks.dao.factory.DaoFactory;
import networks.model.User;
import networks.service.UserService;
import networks.service.factory.ServiceFactory;
import networks.service.impl.UserServiceImpl;
import networks.util.Status;

import java.io.IOException;
import java.time.LocalDate;

public class UserController {

    public static void main(String[] args) {

        UserService userService = ServiceFactory.getUserService();
        User first = userService.getFirst();


        first.setStatus(Status.MARRIED);
        LocalDate birthday = LocalDate.of(1981, 1, 19);
        first.setBirthday(birthday);

        try {
            for (User user : userService.getAll()) {
                ServiceFactory.getUserService().create(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }








//        String newPassword = "sjdhbvkj";
//        userService.changePassword(first, newPassword);
//        LocalDate now = LocalDate.now();
//        userService.happyBirthday(first, now);


    }

}
