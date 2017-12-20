package networks.service.email;

import networks.model.User;

public class RecoverPasswordBuilder implements MessageBuilder {
    @Override
    public String build(User user) {
        return "Dear sir "
                + user.getName()
                + " Your password is on your mail, please check it"
                + user.getPassword();
    }
}
