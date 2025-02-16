package live_coding.kapitel4_OOP;


class Auto{
    String marke;
    char farbe;
    double preis;
    static String stadt = "berlin";

}



class Laptop{
    String marke;
    char farbe;
    double preis;
    static String stadt = "Hama";
}



public class Klassen_3 {

    static String stadt = "Damascus";

    public static void printSomething(){
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        System.out.println(Auto.stadt); // berlin
        System.out.println(Laptop.stadt); // Hama
        System.out.println(Klassen_3.stadt); // Damscus

        Auto.stadt = "Aleppo";
        System.out.println(Auto.stadt); // Aleppo
//        System.out.println(auto1.stadt); // Aleppo -- Error, weil das objekt auto1 ist noch nicht erstellt (deklariert).
//        System.out.println(auto2.stadt); // Aleppo
        System.out.println(Laptop.stadt); // Hama
        System.out.println(Klassen_3.stadt); // Damscus


        Klassen_3.printSomething();

        System.out.println(Klassen_3.stadt); // damscus
        Klassen_3.stadt = "Aleppo";
        System.out.println(Klassen_3.stadt); // aleppo

        Auto auto1 = new Auto();
        auto1.farbe = 'B';
        auto1.marke = "bmw";
        auto1.preis = 5000.5;

        Auto auto2 = new Auto();
        auto2.farbe = 'W';
        auto2.marke = "audi";
        auto2.preis = 3000.3;

        auto1.stadt = "Homs";
        System.out.println(Auto.stadt); // Homs
        System.out.println(auto1.stadt); // Homs
        System.out.println(auto2.stadt); // Homs

        System.out.println(Laptop.stadt); // Hama
        System.out.println(Klassen_3.stadt); // Damscus


        int x = 6;
        System.out.println(x);
        System.out.println(Klassen_3.stadt);
        System.out.println(stadt); // Klassen_3.stadt

        Klassen_3.printSomething();



    }
}
