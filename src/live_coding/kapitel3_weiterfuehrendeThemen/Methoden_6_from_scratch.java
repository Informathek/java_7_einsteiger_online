package live_coding.kapitel3_weiterfuehrendeThemen;

public class Methoden_6_from_scratch {
    // definition der Methode
    public static int berechne_flaeche(int laenge, int breite){
        int flaeche = laenge * breite;
        return flaeche;
    }

    public static void main(String[] args) {
        System.out.println("Ab hier sind wir innerhalb der main Methode");
//           l
//       ---------
//       |       |  b
//       ---------
//        f = l * b

//        int l1 = 5;
//        int b1 = 3;
//
//        int f1 = l1 * b1;
//        System.out.println(f1);
//
//
////        --------------
////        |            |
////        --------------
//        int laenge = 8;
//        int breite = 5;
//        int flaeche = laenge * breite;
//        System.out.println(flaeche);

        // Aufrufen/Verwenden der Methode
//        double potenz = Math.pow(3.0, 4.0);
        int ergebnis_flaeche1 = Methoden_6_from_scratch.berechne_flaeche(5, 3);
        int ergebnis_flaeche2 = Methoden_6_from_scratch.berechne_flaeche(8, 5);
        int ergebnis_flaeche3 = Methoden_6_from_scratch.berechne_flaeche(15, 2);
        int ergebnis_flaeche4 = Methoden_6_from_scratch.berechne_flaeche(25, 23);
        int ergebnis_flaeche5 = Methoden_6_from_scratch.berechne_flaeche(52, 8);
        int ergebnis_flaeche6 = Methoden_6_from_scratch.berechne_flaeche(23, 6);
        int ergebnis_flaeche7 = Methoden_6_from_scratch.berechne_flaeche(234, 23);
    }

}
