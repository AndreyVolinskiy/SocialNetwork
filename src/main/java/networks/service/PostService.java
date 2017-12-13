package networks.service;

import networks.dao.PostDao;
import networks.dao.UserDao;
import networks.model.Post;
import networks.model.User;

import java.util.List;

public class PostService {

    public List<Post> getAll() {
        PostDao postDao = new PostDao();
        return postDao.getAll();

    }


    }

