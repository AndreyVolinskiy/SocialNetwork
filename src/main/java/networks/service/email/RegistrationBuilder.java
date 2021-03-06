package networks.service.email;

import networks.model.User;

public class RegistrationBuilder implements MessageBuilder {
    @Override
    public String build(User user) {
        return " Dear "
                + user.getName()
                + " You are registered. We are glad to see you with us!";

    }
}
