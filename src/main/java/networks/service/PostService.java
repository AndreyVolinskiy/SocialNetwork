package networks.service;

import networks.dao.PostDao;
import networks.model.Post;

import java.util.List;

public class PostService {

    public List<Post> getAll() {
        PostDao postDao = new PostDao();
        return postDao.getAll();

    }

    public List<Post> getByTitle(String name) {
        PostDao postDao = new PostDao();
        return postDao.getByTitle(name);
    }

    }

