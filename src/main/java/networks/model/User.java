package networks.model;

import networks.util.Status;

import java.time.LocalDate;

public class User {

    private String name;
    private String email;
    private String password;
    private Status status;
    private int age;
    private LocalDate birthday;

    public LocalDate getBirthday() {
        return birthday;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';

    }
}
