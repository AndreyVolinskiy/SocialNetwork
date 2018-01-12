package networks.dao;

import networks.model.Post;

import java.util.List;

public interface PostDao extends CrudDao<Post>{

    List<Post> getAll();

    List<Post> getByTitle(String name);
}
