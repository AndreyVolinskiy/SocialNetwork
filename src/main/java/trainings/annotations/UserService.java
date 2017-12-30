package trainings.annotations;

public class UserService {

    public static void main(String[] args) {

        User user = new User(12346, "Alex", "scientist");
        user.setId(321654);

        System.out.println(user.getId());
        System.out.println(user.getSkills());
        System.out.println(user);
    }
}
