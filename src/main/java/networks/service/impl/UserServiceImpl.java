package networks.service.impl;

import networks.dao.UserDao;
import networks.dao.impl.UserDaoImpl;
import networks.model.User;
import networks.service.MessageService;
import networks.service.UserService;
import networks.service.email.HappyBirthdayBuilder;
import networks.service.email.MessageBuilder;
import networks.service.email.RecoverPasswordBuilder;

import java.time.LocalDate;
import java.util.List;

public class UserServiceImpl implements UserService{
    @Override
    public List<User> getAll() {
        UserDao userDao = new UserDaoImpl();
        return userDao.getAll();
    }

    @Override
    public User getFirst() {
        UserDao userDao = new UserDaoImpl();
        return userDao.getFirst();
    }

    @Override
    public User getLast() {
        UserDao userDao = new UserDaoImpl();
        return userDao.getLast();
    }

    @Override
    public List<User> getByName(String name) {
        UserDao userDao = new UserDaoImpl();
        return userDao.getByName(name);
    }

    @Override
    public List<User> getByAge(int age) {
        UserDao userDao = new UserDaoImpl();
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
    public void happyBirthday(User user) {
        if (user.getBirthday().equals(LocalDate.now())) {
            MessageBuilder builder = new HappyBirthdayBuilder();
            String message = builder.build(user);
            MessageService messageService = new MessageServiceImpl();
            messageService.sendMessage(message, user.getEmail());
        } else

    }


}

