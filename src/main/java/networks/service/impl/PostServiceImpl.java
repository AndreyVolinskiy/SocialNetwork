package networks.service.impl;

import networks.dao.PostDao;
import networks.dao.factory.DaoFactory;
import networks.dao.impl.PostDaoImpl;
import networks.model.Post;
import networks.service.PostService;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PostServiceImpl implements PostService {
    @Override
    public List<Post> getAll() {
        PostDao postDao = DaoFactory.getPostDao();
        return postDao.getAll();
    }

    @Override
    public List<Post> getByTitle(String name) {
        PostDao postDao = DaoFactory.getPostDao();
        return postDao.getByTitle(name);
    }

    @Override
    public void create(Post post) throws IOException {
        String filePath = "src\\main\\resources\\posts.txt";
        File file = new File(filePath);
//        file.delete();
//        file.createNewFile();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

        writer.write("1. Title: " + post.getTitle() + "\n");
        writer.write("2. Description: " + post.getDescription() + "\n");
        writer.write("3. Count of likes: " + post.getCountOfLikes() + "\n");
        writer.write("\n\n");

        writer.flush();
        writer.close();

    }

}

