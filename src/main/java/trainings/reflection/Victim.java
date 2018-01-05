package trainings.reflection;


public class Victim extends Mac {

    private String name = "Bob";
    private int age = 23;

    private void some() {
    }
    private   void something() {
    }

    public Victim(String name) {
        this.name = name;
    }

    public Victim(int age) {
        this.age = age;
    }

    public Victim(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Victim() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String exampleMethod() {
        return "String";
    }


}
