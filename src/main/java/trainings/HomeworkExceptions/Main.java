package trainings.HomeworkExceptions;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter URL protocol, please:");
        String protocol = scanner.nextLine();
        System.out.println("Enter domain name, please:");
        String site = scanner.nextLine();
        Url url = new Url(protocol, site);

        System.out.println(url);

        check(url);

        scanner.close();
    }

    private static void check(Url url) {

        List<Url> goodSites = Database.getAllGoodSites();
        List<Url> badSites = Database.getAllBadSites();

        if (url == null) {
            try {
                throw new Exceptions.NoUrlException();
            } catch (Exceptions.NoUrlException e) {
                System.out.println("There is no URL entered!");
            }
        } else

        if (!url.getProtocol().equals("https://")) {
            try {
                throw new Exceptions.NoProtocolException();
            } catch (Exceptions.NoProtocolException e) {
                System.out.println("Entered not https:// url.");
            }
        } else

        for (Url site : badSites) {
            if (site.equals(url)) {
                try {
                    throw new Exceptions.BadSitesException();
                } catch (Exceptions.BadSitesException e) {
                    System.out.println("This site is very, very bad...");
                }
            } else {
                goodSites.add(url);
            }
        }
        System.out.println("List of good sites:");
        System.out.println(goodSites);

    }
}




