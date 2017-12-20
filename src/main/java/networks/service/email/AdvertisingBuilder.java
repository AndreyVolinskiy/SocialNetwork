package networks.service.email;

import networks.model.User;

public class AdvertisingBuilder implements MessageBuilder {
    @Override
    public String build(User user) {
        return "Dear "
                + user.getName()
                + " we propose you to byu monthly access to all services! Only $50";
    }
}
