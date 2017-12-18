package trainings.HomeworkExceptions;

import java.util.LinkedList;
import java.util.List;

class Database {

    static List<String> getAllGoodSites() {


        List<String> goodSites = new LinkedList<>();

        String site0 = "https://mail.google.com";
        String site1 = "https://google.com.ua";
        String site2 = "https://dropbox.com";
        String site3 = "https://facebook.com";
        String site4 = "https://my.best.net.ua";
        String site5 = "https://eu.battle.net";
        String site6 = "https://translate.google.com.ua";
        String site7 = "https://privat24.ua";

        goodSites.add(site0);
        goodSites.add(site1);
        goodSites.add(site2);
        goodSites.add(site3);
        goodSites.add(site4);
        goodSites.add(site5);
        goodSites.add(site6);
        goodSites.add(site7);

        return goodSites;
    }

    static List<String> getAllBadSites() {

        List<String> badSites = new LinkedList<>();

        String site0 = "https://online.pumb.ua";
        String site1 = "https://fishki.net";
        String site2 = "http://kinozal.tv";
        String site3 = "http://megogo.net";
        String site4 = "http://divan.tv";
        String site5 = "https://miracle-it-experience.slack.com";
        String site6 = "https://irista.com";
        String site7 = "https://blablacar.com.ua/";

        badSites.add(site0);
        badSites.add(site1);
        badSites.add(site2);
        badSites.add(site3);
        badSites.add(site4);
        badSites.add(site5);
        badSites.add(site6);
        badSites.add(site7);

        return badSites;
    }
}
