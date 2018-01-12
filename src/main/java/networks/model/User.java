package networks.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import networks.util.Status;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class User extends AbstractEntity{

    private String name;
    private String email;
    private String password;
    private Status status;
    private int age;
    private LocalDate birthday;

    public User(String name, String email, String password, Status status, int age, LocalDate birthday) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.status = status;
        this.age = age;
        this.birthday = birthday;
    }

    public User(String name, String email, String password, int age) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.age = age;
    }

    public User() {}

}
