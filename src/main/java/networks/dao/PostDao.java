package networks.dao;

import networks.data.Database;
import networks.model.Post;

import java.util.List;

public class PostDao {

    public List<Post> getAll(){
        return Database.getAllPosts();
    }

}
