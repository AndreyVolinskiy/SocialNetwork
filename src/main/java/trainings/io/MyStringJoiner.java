package trainings.io;

public class MyStringJoiner {

    private String separator = "";
    private String addedString = "";
    public MyStringJoiner(String separator) {
        this.separator = separator;
    }

    public void add(String string) {
        if (addedString.equals("")) {
            addedString = string;
        } else {
            addedString += separator + string;
        }
    }

    public static void main(String[] args) {

        MyStringJoiner joiner = new MyStringJoiner("...");
        joiner.add("Hi!");
        joiner.add("I");
        joiner.add("am");
        joiner.add("cool");
        joiner.add("java");
        joiner.add("programmer");
        joiner.add(")))");
        System.out.println(joiner.addedString);

    }

}
