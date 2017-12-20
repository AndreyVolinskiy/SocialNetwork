package networks.dao;

import networks.model.Post;

import java.util.List;

public interface PostDao {

    List<Post> getAll();

    List<Post> getByTitle(String name);
}
