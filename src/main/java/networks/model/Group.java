package networks.model;

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

    public String getByNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(int numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    @Override
    public String toString() {
        return "Group{" +
                "nameOfGroup='" + nameOfGroup + '\'' +
                ", admin='" + admin + '\'' +
                ", description='" + description + '\'' +
                ", numberOfFollowers=" + numberOfFollowers +
                '}';
    }
}
