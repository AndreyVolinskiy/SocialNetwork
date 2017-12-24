package networks.service;

import networks.model.Post;

import java.io.IOException;
import java.util.List;

public interface PostService {

    List<Post> getAll();

    List<Post> getByTitle(String name);

    void create(Post post) throws IOException;

    }

