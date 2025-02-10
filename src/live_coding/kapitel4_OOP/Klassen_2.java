package live_coding.kapitel4_OOP;

class Haus{
    int anzahlZimmer=4;
    int anzahlTueren;
    String farbe;
    String adresse;
    double preis;
}

public class Klassen_2 {

    public static void main(String[] args) {
        // Pseudeo-code
        // Objekte: Copy, Instance (Beispiel): haus1, haus2, haus3
//        haus1: tueren= 3, farbe= blau, aqdresse= alex 1, zimmer=3 // attribute
//        haus2: tueren= 2, farbe= rot, aqdresse= alex 2, zimmer=4 // attribute
//        haus3: tueren= 5, farbe= weiss, adresse= alex3, zimmer=5 // attribute

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
