package networks.data;

import networks.model.Group;
import networks.model.Post;
import networks.model.User;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Database {

    public static List<User> getAllUsers() {

        List<User> userList = new LinkedList<>();

        User user1 = new User("Andrey", "mamashka2@gmail.com", "123456", 34);
        User user2 = new User("Alex","", "654321", 25);
        User user3 = new User("Olga","" ,"555555", 55);
//        User user4 = new User("Olga", "555555", 54);
//        User user5 = new User("Olga", "555555", 53);
//        User user6 = new User("Olga", "555555", 52);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
//        userList.add(user4);
//        userList.add(user5);
//        userList.add(user6);

        return userList;
    }
    public static List<Post> getAllPosts() {

        Post post1 = new Post("Football", "About football", 256);
        Post post2 = new Post("Love", "About love", 333);
        Post post3 = new Post("Disease", "About disease", 11);
        Post post4 = new Post("Music", "About Music", 256);
        Post post5 = new Post("Music", "About Music", 256);
        Post post6 = new Post("Music", "About Music", 256);
        Post post7 = new Post("Music", "About Music", 256);

        List<Post> postList = new LinkedList<>();
        postList.add(post1);
        postList.add(post2);
        postList.add(post3);
        postList.add(post4);
        postList.add(post5);
        postList.add(post6);
        postList.add(post7);

        return postList;
    }
    public static List<Group> getAllGroups() {

        Group group1 = new Group("I'm hairdresser", "Nataly", "Coloristics", 45);
        Group group2 = new Group("DragonMania Legends", "NeoSoft", "Game", 1289);
        Group group3 = new Group("BOS", "Grigoreva", "Scouting", 23);
        Group group4 = new Group("AC/DC", "Angus Young", "Music ", 30000000);
        Group group5 = new Group("Miracle IT", "Igor Hnes", "Development", 5);
        Group group6 = new Group("BOS", "Grigoreva", "Scouting", 23);
        Group group7 = new Group("BOS", "Grigoreva", "Scouting", 23);
        Group group8 = new Group("BOS", "Grigoreva", "Scouting", 23);

        List<Group> groupList = new LinkedList<>();

        groupList.add(group1);
        groupList.add(group2);
        groupList.add(group3);
        groupList.add(group4);
        groupList.add(group5);
        groupList.add(group6);
        groupList.add(group7);
        groupList.add(group8);

        return groupList;
    }
}
