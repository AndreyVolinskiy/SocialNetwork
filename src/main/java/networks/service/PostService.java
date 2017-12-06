package networks.service;

import networks.dao.PostDao;
import networks.dao.UserDao;
import networks.model.Post;
import networks.model.User;

public class PostService {

    public Post[] getAll() {
        PostDao postDao = new PostDao();
        return postDao.getAll();

    }


    }

