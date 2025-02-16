package live_coding.kapitel4_OOP;


class Haus{
    int anzahlZimmer=4; // attribute
    int anzahlTueren; // attribute
    String farbe; // attribute
    String adresse; // attribute
    double preis; // attribute
    static String stadt; // class variable ,statische variable
}

class Schule{
    int anzahlStudenten=3;
    int anzahlLehrer;
    String adresse;
    int raeume;
}

public class Klassen_2 {

    public static void main(String[] args) {
        // Pseudeo-code
        // Objekte: Copy, Instance (Beispiel): haus1, haus2, haus3
//        haus1: tueren= 3, farbe= blau, aqdresse= alex 1, zimmer=3 // attribute
//        haus2: tueren= 2, farbe= rot, aqdresse= alex 2, zimmer=4 // attribute
//        haus3: tueren= 5, farbe= weiss, adresse= alex3, zimmer=5 // attribute



        int[] intArrMoh = new int[3];
        intArrMoh[0] = 4;
        intArrMoh[1] = 2;
        intArrMoh[2] = 4;

        int[] intJoudi = new int[3];
        intJoudi[0] = 34;
        intJoudi[1] = 12;
        intJoudi[2] = 44;

        int[] intZekra = new int[3];
        System.out.println(intZekra[0]); // 0
        System.out.println(intZekra[1]); // 0
        System.out.println(intZekra[2]); //0
        intZekra[0] = 54;
        intZekra[1] = 26;
        intZekra[2] = 42;
        System.out.println(intZekra[0]);
        System.out.println(intZekra[1]);
        System.out.println(intZekra[2]);



//        ==================================
        Haus mohHaus1 = new Haus(); // mohHaus1 ist ein objekt (Instanz oder kopie)

        System.out.println(mohHaus1.anzahlZimmer); // 4
        System.out.println(mohHaus1.farbe); // null
        System.out.println(mohHaus1.preis); // 0.0

        mohHaus1.anzahlZimmer = 6;
        mohHaus1.anzahlTueren = 7;
        mohHaus1.farbe = "weiss";
        mohHaus1.preis = 700.7;
        mohHaus1.adresse = "alex";

        System.out.println(mohHaus1.anzahlZimmer); // 6
        System.out.println(mohHaus1.farbe); // "weiss"
        System.out.println(mohHaus1.preis); // 700.7
//        ==================================

        // 1. erstelle ein objekt
        Haus zekraHaus = new Haus();
        System.out.println(zekraHaus.preis); // 0.0
        System.out.println(zekraHaus.anzahlZimmer); // 4
        zekraHaus.preis = 400.4;
        System.out.println(zekraHaus.preis); // 400.4

        System.out.println("--------------");

        System.out.println(mohHaus1.stadt); // null
        System.out.println(zekraHaus.stadt); // null

        mohHaus1.stadt = "Berlin";
        System.out.println(mohHaus1.stadt); // berlin
        System.out.println(zekraHaus.stadt); // berlin


        zekraHaus.stadt = "hamburg";
        System.out.println(zekraHaus.stadt); // hamburg
        System.out.println(zekraHaus.stadt); // hamburg

        Haus.stadt = "Muenchen";
        System.out.println(mohHaus1.stadt); // Muenchen
        System.out.println(zekraHaus.stadt); // Muenchen
        System.out.println(Haus.stadt); // Muenchen






        Haus mohHaus2 = new Haus();
        Haus mohHaus3 = new Haus();
        Haus mohHaus4 = new Haus();





        Haus joudiHaus = new Haus();



        String[] stringArr1 = new String[2];

        System.out.println(stringArr1[0]); // null
        System.out.println(stringArr1[1]); // null
        stringArr1[0] = "hello";
        stringArr1[1] = "world";
        System.out.println(stringArr1[0]); // hello
        System.out.println(stringArr1[1]); // world

        Schule mohSchule = new Schule();
        Schule zekraSchule = new Schule();

        Schule joudiSchule = new Schule();
        System.out.println(joudiSchule.anzahlStudenten); // 3
        System.out.println(joudiSchule.anzahlLehrer); // 0

        joudiSchule.anzahlStudenten = 50;
        joudiSchule.anzahlLehrer = 10;

        System.out.println(joudiSchule.anzahlStudenten); // 50
        System.out.println(joudiSchule.anzahlLehrer); // 10






        Haus haus1 = new Haus();

        System.out.println(haus1.anzahlZimmer); // 4
        System.out.println(haus1.anzahlTueren); // 0
        System.out.println(haus1.farbe); // null
        System.out.println(haus1.adresse); // null
        System.out.println(haus1.preis); // 0.0

        haus1.anzahlZimmer = 5;
        haus1.anzahlTueren = 10;
        haus1.farbe = "blau";
        haus1.adresse = "Alexanderplatz 1";
        haus1.preis = 2000.50;

        System.out.println(haus1.anzahlZimmer); // 5
        System.out.println(haus1.anzahlTueren); // 10
        System.out.println(haus1.farbe); //"blau"
        System.out.println(haus1.adresse); // "Alex"
        System.out.println(haus1.preis); // 2000.50
        System.out.println("///////////// Haus Zekra: ///////////");


        Haus hausZekra = new Haus(); // Objekterstellen

        System.out.println(hausZekra.anzahlZimmer); // 4
        System.out.println(hausZekra.adresse); // null
        System.out.println(hausZekra.farbe); // null
        System.out.println(hausZekra.anzahlTueren); // 0
        System.out.println(hausZekra.preis); // 0.0

        hausZekra.farbe= "rosa";
        hausZekra.anzahlTueren= 5;
        hausZekra.preis= 5000.200 ;
        hausZekra.adresse= "Kudamm";

        System.out.println(hausZekra.anzahlZimmer); // 4
        System.out.println(hausZekra.adresse); // Kudam
        System.out.println(hausZekra.farbe); // rosa
        System.out.println(hausZekra.anzahlTueren); // 5
        System.out.println(hausZekra.preis); // 5000.200




    }
}
