package networks.controller;

import networks.Exception.NoPostFoundException;
import networks.model.Post;
import networks.service.PostService;
import networks.service.UserService;

import java.util.List;

public class PostController {


    public static void main(String[] args) {

        PostService postService = new PostService();
//        List<Post> users = postService.getAll();
//        for (Post elem : users) {
//            System.out.println(elem);
//        }

        List<Post> postByName = postService.getByTitle("Music");
        for (Post elem : postByName) {
            System.out.println(elem);
        }

    }
}