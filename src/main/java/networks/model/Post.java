package networks.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Post {

    private String title;
    private String description;
    private int countOfLikes;

    public Post(String title, String description, int countOfLikes) {
        this.title = title;
        this.description = description;
        this.countOfLikes = countOfLikes;
    }

}
