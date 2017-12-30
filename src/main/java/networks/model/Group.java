package networks.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Group {

    private String nameOfGroup;
    private String admin;
    private String description;
    private int numberOfFollowers;

    public Group(String nameOfGroup, String admin, String description, int numberOfFollowers) {
        this.nameOfGroup = nameOfGroup;
        this.admin = admin;
        this.description = description;
        this.numberOfFollowers = numberOfFollowers;
    }

}
