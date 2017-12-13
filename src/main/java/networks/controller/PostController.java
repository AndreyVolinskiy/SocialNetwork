package networks.controller;

import networks.model.Post;
import networks.service.PostService;

import java.util.List;

public class PostController {


    public static void main(String[] args) {

        PostService postService = new PostService();
        List<Post> users = postService.getAll();
        for (Post elem : users) {
            System.out.println(elem);
        }
    }
}