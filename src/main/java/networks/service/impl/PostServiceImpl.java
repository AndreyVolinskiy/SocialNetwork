package networks.service.impl;

import networks.dao.PostDao;
import networks.dao.impl.PostDaoImpl;
import networks.model.Post;
import networks.service.PostService;

import java.util.List;

public class PostServiceImpl implements PostService {
    @Override
    public List<Post> getAll() {
        PostDao postDao = new PostDaoImpl();
        return postDao.getAll();
    }

    @Override
    public List<Post> getByTitle(String name) {
        PostDao postDao = new PostDaoImpl();
        return postDao.getByTitle(name);
    }
}
