package trainings.HomeworkExceptions;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter an URL with https://, please:");
        Scanner scanner = new Scanner(System.in);
        String site = scanner.nextLine();
        check(site);
        scanner.close();
    }

    private static void check(String url) {

        final String URL = "https://";
        List<String> goodSites = Database.getAllGoodSites();
        List<String> badSites = Database.getAllBadSites();
        String subString;

        try {
            subString = url.substring(0, 8);
        } catch (StringIndexOutOfBoundsException | NullPointerException e) {
            subString = null;
        }

        if (url == null) {
            try {
                throw new Exceptions.NoUrlException();
            } catch (Exceptions.NoUrlException e) {
                System.out.println("There is no URL entered!");
            }
        } else

            if (!URL.equals(subString)) {
                try {
                    throw new Exceptions.NoProtocolException();
                } catch (Exceptions.NoProtocolException e) {
                    System.out.println("Entered not https:// url.");
                }
            } else

        for (String site : badSites) {
            if (site.equals(url)) {
                try {
                    throw new Exceptions.BadSitesException();
                } catch (Exceptions.BadSitesException e) {
                    System.out.println("This site is very, very bad...");
                }
            } else {
                if (!site.equals(url)) {
                    goodSites.add(url);
                    System.out.println("List of good sites:");
                    System.out.println(goodSites);
                    break;

                }
            }
        }
    }
}


