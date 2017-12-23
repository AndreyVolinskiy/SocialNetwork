package networks.service.impl;

import networks.dao.UserDao;
import networks.dao.factory.DaoFactory;
import networks.dao.impl.UserDaoImpl;
import networks.model.User;
import networks.service.MessageService;
import networks.service.UserService;
import networks.service.email.HappyBirthdayBuilder;
import networks.service.email.MessageBuilder;
import networks.service.email.RecoverPasswordBuilder;
import networks.service.email.RegistrationBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

public class UserServiceImpl implements UserService{
    @Override
    public List<User> getAll() {
        UserDao userDao = DaoFactory.getUserDao();
        return userDao.getAll();
    }

    @Override
    public User getFirst() {
        UserDao userDao = DaoFactory.getUserDao();
        return userDao.getFirst();
    }

    @Override
    public User getLast() {
        UserDao userDao = DaoFactory.getUserDao();
        return userDao.getLast();
    }

    @Override
    public List<User> getByName(String name) {
        UserDao userDao = DaoFactory.getUserDao();
        return userDao.getByName(name);
    }

    @Override
    public List<User> getByAge(int age) {
        UserDao userDao = DaoFactory.getUserDao();
        return userDao.getByAge(age);
    }

    @Override
    public void changePassword(User user, String newPassword) {
        user.setPassword(newPassword);
        MessageBuilder builder = new RecoverPasswordBuilder();
        String message = builder.build(user);
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage(message, user.getEmail());
        }

    @Override
    public void happyBirthday(User user, LocalDate localDate) {
        if (user.getBirthday().equals(LocalDate.now())) {
            MessageBuilder builder = new HappyBirthdayBuilder();
            String message = builder.build(user);
            MessageService messageService = new MessageServiceImpl();
            messageService.sendMessage(message, user.getEmail());
        }
//        else {

        }


    @Override
    public void create(User user) {
        String usersPath = "src\\main\\resources\\users.txt";
        File file = new File(usersPath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter writer = new FileWriter(file, true);
        } catch (IOException e) {
            e.printStackTrace();
        }



//    public void create(User user) {
//        MessageBuilder builder = new RegistrationBuilder();
//        String message = builder.build(user);
//        MessageService messageService = new MessageServiceImpl();
//        messageService.sendMessage(message, user.getEmail());
    }}




