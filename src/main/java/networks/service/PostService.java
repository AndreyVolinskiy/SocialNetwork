package networks.service;

import networks.model.Post;

import java.util.List;

public interface PostService {

    List<Post> getAll();

    List<Post> getByTitle(String name);

    }

