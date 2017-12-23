package networks.dao.factory;

import networks.dao.GroupDao;
import networks.dao.PostDao;
import networks.dao.UserDao;
import networks.dao.impl.GroupDaoImpl;
import networks.dao.impl.PostDaoImpl;
import networks.dao.impl.UserDaoImpl;

import java.security.PublicKey;

public class DaoFactory {

    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }

    public static PostDao getPostDao() {
        return new PostDaoImpl();
    }

    public static GroupDao getGroupDao() {
        return new GroupDaoImpl();
    }

}
