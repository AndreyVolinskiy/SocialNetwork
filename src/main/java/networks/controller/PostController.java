package networks.controller;

import networks.model.Post;
import networks.service.PostService;
import networks.service.factory.ServiceFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class PostController {


    public static void main(String[] args) throws IOException {

        PostService postService = ServiceFactory.getPostService();
        List<Post> posts = postService.getAll();
        for (Post elem : posts) {
            postService.create(elem);
        }


        String filePath = "src\\main\\resources\\posts.txt";
        File file = new File(filePath);
        postService.getAllFromFile(file);

    }

}
