package networks.data;

import networks.model.Group;
import networks.model.Post;
import networks.model.User;

public class Database {

    public static User[] getAllUsers() {
        User users[] = new User[3];

        User user1 = new User("Andrey", "123456", 34);
        User user2 = new User("Alex", "654321", 25);
        User user3 = new User("Olga", "555555", 55);

        users[0] = user1;
        users[1] = user2;
        users[2] = user3;

        return users;
    }

    public static Post[] getAllPosts() {
        Post posts[] = new Post[4];

        Post post1 = new Post("Football", "About football", 256);
        Post post2 = new Post("Love", "About love", 333);
        Post post3 = new Post("Disease", "About disease", 11);
        Post post4 = new Post("Music", "About Music", 256);

        posts[0]=post1;
        posts[1]=post2;
        posts[2]=post3;
        posts[3]=post4;

        return posts;
    }

    public static Group[] getAllGroups() {
        Group[] groups = new Group[5];

        Group group1 = new Group("I'm hairdresser", "Nataly", "Coloristics", 45);
        Group group2 = new Group("DragonMania Legends", "NeoSoft", "Game", 1289);
        Group group3 = new Group("BOS", "Grigoreva", "Scouting", 23);
        Group group4 = new Group("AC/DC", "Angus Young", "Music ", 30000000);
        Group group5 = new Group("Miracle IT", "Igor Hnes", "Development", 5);

        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;
        groups[3] = group4;
        groups[4] = group5;

        return groups;
    }
}
