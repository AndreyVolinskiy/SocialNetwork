package networks.service.email;

import networks.model.User;

public class HappyNewYearBuilder implements MessageBuilder {
    @Override
    public String build(User user) {
        return "Dear "
                + user.getName()
                + " We wish you Mary Christmas and Happy New Year!";
    }
}
