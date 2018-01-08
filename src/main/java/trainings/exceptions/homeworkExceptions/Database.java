package trainings.exceptions.homeworkExceptions;

import java.util.LinkedList;
import java.util.List;

class Database {

    static List<Url> getAllGoodSites() {


        List<Url> goodSites = new LinkedList<>();

        Url site0 = new Url("https://", "mail.google.com");
        Url site1 = new Url("https://", "google.com.ua");
        Url site2 = new Url("https://", "facebook.com");
        Url site3 = new Url("https://", "my.best.net.ua");
        Url site4 = new Url("https://", "eu.battle.net");
        Url site5 = new Url("https://", "translate.google.com.ua");
        Url site6 = new Url("https://", "translate.google.com.ua");
        Url site7 = new Url("https://", "privat24.ua");

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

    static List<Url> getAllBadSites() {

        List<Url> badSites = new LinkedList<>();

        Url site0 = new Url("https://", "online.pumb.ua");
        Url site1 = new Url("https://", "fishki.net");
        Url site2 = new Url("https://", "http://kinozal.tv");
        Url site3 = new Url("https://", "megogo.net");
        Url site4 = new Url("https://", "divan.tv");
        Url site5 = new Url("https://", "miracle-it-experience.slack.com");
        Url site6 = new Url("https://", "irista.com");
        Url site7 = new Url("https://", "blablacar.com.ua");

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
