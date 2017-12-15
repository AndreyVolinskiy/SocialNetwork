package networks.model;

import java.util.Objects;

public class Post {

    private String title;
    private String description;
    private int countOfLikes;

    public Post(String title, String description, int countOfLikes) {
        this.title = title;
        this.description = description;
        this.countOfLikes = countOfLikes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCountOfLikes() {
        return countOfLikes;
    }

    public void setCountOfLikes(int countOfLikes) {
        this.countOfLikes = countOfLikes;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", countOfLikes=" + countOfLikes +
                '}';
    }

}
