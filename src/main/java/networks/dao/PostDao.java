package networks.dao;

import networks.Exception.NoPostFoundException;
import networks.data.Database;
import networks.model.Post;

import java.util.LinkedList;
import java.util.List;

public class PostDao {

    public List<Post> getAll(){
        return Database.getAllPosts();
    }

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
