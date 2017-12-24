package networks.controller;

import networks.model.Post;
import networks.service.PostService;
import networks.service.factory.ServiceFactory;
import networks.service.impl.PostServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import static com.sun.corba.se.spi.orbutil.proxy.DelegateInvocationHandlerImpl.create;

public class PostController {


    public static void main(String[] args) throws IOException {

        PostService postService = ServiceFactory.getPostService();
        List<Post> posts = postService.getAll();
        for (Post elem : posts) {
            postService.create(elem);
        }

    }

}
