package live_coding.kapitel2_flusskontrolle;

public class for_7_primzahlen {
    public static void main(String[] args) {


//        for (int zahl = 1; zahl < 100; zahl++) {

            int zahl = 7; // zu zeberPruefende Zahl

            System.out.println(zahl);
            for (int i = 2; i <= zahl; i++) {
                System.out.println(zahl + " / " + i + ", Rest ist " + zahl % i); // 1, ..., 6
                if (zahl % i == 0) {
                    System.out.println("10 ist kein Primzahl");
                    break;
                }

                if (i == zahl) {
                    System.out.println("es ist entschieden -->" + zahl + " ist eine Primzahl");
                }
            }


        }
//    }

}