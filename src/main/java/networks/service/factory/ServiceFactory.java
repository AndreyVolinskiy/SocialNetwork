package networks.service.factory;

import networks.service.GroupService;
import networks.service.PostService;
import networks.service.UserService;
import networks.service.impl.GroupServiceImpl;
import networks.service.impl.PostServiceImpl;
import networks.service.impl.UserServiceImpl;

public class ServiceFactory {

    public static UserService getUserService() {
        return new UserServiceImpl();
    }

    public static PostService getPostService() {
        return new PostServiceImpl();
    }

    public static GroupService getGroupService() {
        return new GroupServiceImpl();
    }
}
