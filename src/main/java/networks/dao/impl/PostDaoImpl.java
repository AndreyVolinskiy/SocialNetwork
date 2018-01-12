package networks.dao.impl;

import networks.exception.NoPostFoundException;
import networks.dao.PostDao;
import networks.data.Database;
import networks.model.AbstractEntity;
import networks.model.Post;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class PostDaoImpl implements PostDao {
    @Override
    public List<Post> getAll() {
        return Database.getAllPosts();
    }

    @Override
    public List<Post> getByTitle(String name) {
        List<Post> tempPost = new LinkedList<>();
        List<Post> postList = Database.getAllPosts();
        for (Post post : postList) {
            if (post.getTitle().equals(name)) {
                tempPost.add(post);
            }
        }
        if (tempPost.size() == 0) {
            throw new NoPostFoundException();
        }
        return tempPost;
    }

    @Override
    public void update(Post post) {

    }

    @Override
    public void create(Post post) throws IOException {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List findAll() {
        return null;
    }
}

