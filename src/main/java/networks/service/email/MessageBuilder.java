package networks.service.email;

import networks.model.User;

public interface MessageBuilder {

    String build(User user);
}
