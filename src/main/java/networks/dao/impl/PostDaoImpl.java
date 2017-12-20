package networks.dao.impl;

import networks.Exception.NoPostFoundException;
import networks.dao.PostDao;
import networks.data.Database;
import networks.model.Post;

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
    }

