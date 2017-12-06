package networks.dao;

import networks.data.Database;
import networks.model.Post;

public class PostDao {

    public Post[] getAll(){
        return Database.getAllPosts();
    }

}
