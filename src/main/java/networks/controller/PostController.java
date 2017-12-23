package networks.controller;

import networks.model.Post;
import networks.service.PostService;
import networks.service.factory.ServiceFactory;
import networks.service.impl.PostServiceImpl;

import java.util.List;

public class PostController {


    public static void main(String[] args) {

        PostService postService = ServiceFactory.getPostService();
        List<Post> users = postService.getAll();
        for (Post elem : users) {
            System.out.println(elem);
        }
        System.out.println("");

        List<Post> postByName = postService.getByTitle("Music");
        for (Post elem : postByName) {
            System.out.println(elem);
        }

    }
}