package networks.service.email;

import networks.model.User;

public class Main {

    public static void main(String[] args) {

        User user = new User();
        user.setName("Alex");
        MessageBuilder messageBuilder = new RecoverPasswordBuilder();
        System.out.println(messageBuilder.build(user));

    }
}
