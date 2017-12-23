package networks.controller;

import networks.dao.factory.DaoFactory;
import networks.model.User;
import networks.service.UserService;
import networks.service.factory.ServiceFactory;
import networks.service.impl.UserServiceImpl;
import networks.util.Status;

import java.time.LocalDate;

public class UserController {

    public static void main(String[] args) {

        UserService userService = ServiceFactory.getUserService();
        User first = userService.getFirst();
//        ServiceFactory.getUserService().create(first);

        System.out.println(DaoFactory.getUserDao().getAll());
//        first.setStatus(Status.SINGLE);

//        String newPassword = "sjdhbvkj";
//        userService.changePassword(first, newPassword);


//        LocalDate birthday = LocalDate.of(1981, 12, 22);
//        first.setBirthday(birthday);
//        LocalDate now = LocalDate.now();
//
//        userService.happyBirthday(first, now);


    }

}
