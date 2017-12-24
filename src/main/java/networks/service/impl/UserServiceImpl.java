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

import java.io.BufferedWriter;
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
    public void create(User user) throws IOException {
        String filePath = "src\\main\\resources\\users.txt";
        File file = new File(filePath);
//        file.delete();
//        file.createNewFile();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

        writer.write("1. Name: " + user.getName() + "\n");
        writer.write("2. Email: " + user.getEmail() + "\n");
        writer.write("3. Password: " + encrypt(user.getPassword()) + "\n");
        writer.write("4. Age: " + user.getAge() + "\n");
        writer.write("5. Status: " + user.getStatus() + "\n");
        writer.write("6. Birthday: " + user.getBirthday() + "\n");
        writer.write("\n\n");

        writer.flush();
        writer.close();

        }

    @Override
    public String encrypt (String text) {
        final int keyOfEncription = 3;
        byte[] textBytes = text.getBytes();
        for (int i = 0; i < textBytes.length; i++) {
            textBytes[i] = (byte) (textBytes[i] + keyOfEncription);
        }
        return new String(textBytes);
    }

    @Override
    public String decrypt(String text) {
        final int keyOfDecription = 3;
        byte[] textBytes = text.getBytes();
        for (int i = 0; i < textBytes.length; i++) {
            textBytes[i] = (byte) (textBytes[i] - keyOfDecription);
        }
        return new String(textBytes);
    }


//    public void create(User user) {
//        MessageBuilder builder = new RegistrationBuilder();
////        String message = builder.build(user);
////        MessageService messageService = new MessageServiceImpl();
////        messageService.sendMessage(message, user.getEmail());
    }





