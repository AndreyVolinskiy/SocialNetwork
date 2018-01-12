package networks.service;

import networks.model.Post;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface PostService extends CrudService<Post>{

    List<Post> getAll();

    List<Post> getByTitle(String name);

    void create(Post post) throws IOException;

    void getAllFromFile(File file) throws IOException;

    }

