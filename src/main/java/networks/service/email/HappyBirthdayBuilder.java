package networks.service.email;

import networks.model.User;

public class HappyBirthdayBuilder implements MessageBuilder
{
    @Override
    public String build(User user) {
        return " Dear "
                + user.getName()
                + " congrats you with your birthday, Health, Wealth and Happyness!";
    }
}
