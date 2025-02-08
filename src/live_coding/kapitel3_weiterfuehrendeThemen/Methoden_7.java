package live_coding.kapitel3_weiterfuehrendeThemen;

class Auto{


    public static void printLinien(){
        System.out.println("111111111111111");
    }


}









public class Methoden_7 {

    // Ohne Parameter(s) & Ohne Rueckgabewert
    // Definition: Schreibe eine Methode (printLinien), die Linien auf der Konsole ausgibt.
    public static void printLinien(){
        // Inhalt der Methode
        System.out.println("------------------------------------------------");
        System.out.println("************************************************");
        System.out.println("================================================");
        System.out.println("////////////////////////////////////////////////");
    }

    // Mit Parameter(s) & Ohne Rueckgabewert
    // Definition: Schreibe eine Methode (begruesseBenutzer), die einen Nutzer begruesst.
    // Die Methode nimmt als Parameters den Namen und das Alter des Nutzers and gibt eine Begruessug Nachricht aus.

    public static void begrusseBenutzer(String name, int age){
        System.out.println("Herzlich Willkommen " + name + ", " + age + " jahre alt");
    }

    // Ohne Parameter(s) & Mit Rueckgabewert
    // Definition: Schreine eine Methode (erstellteText), die keine Paramters nimmt, aber einen Text zuereckgibt. Diese Methode soll hier nichts ausprinten (printen).
    public static String erstelleText(){
        String myText1 = "Ich habe heute Programmierung Kurs";
        String myText2 = "Gestern hatte ich eine Prüfung!";
        int x = 20;
        return myText2;
    }

    // Mit Parameter(s) & Mit Rueckgabewert
    // Definition: Schreibe eine Methode (berechneUmfang), die den Umfang eines Rechtecks berechnet und zuereuckgibt. Gegeben sind die laenge und Breite.
    public static double berechneUmfang(int laenge ,  double breite){
        double umfang = 2*laenge+2*breite;
        return umfang;
    }

    public static double pow(int basis, int potenz){ // 5 ^ 3
        double ergebnis = basis * basis * potenz / 2 + 4; // z.B.
        return ergebnis;
    }

    public static void main(String[] args) {
        // Aufrufen der Methoden
        System.out.println("Hallo");
        printLinien();
        begrusseBenutzer("Joudi", 323);
        printLinien();
        begrusseBenutzer("Ranim", 20);
        begrusseBenutzer("Joudi", 23);
        begrusseBenutzer("Zekra", 23);
        begrusseBenutzer("Mohammad", 23);
        begrusseBenutzer("Zekra", 43);
        begrusseBenutzer("Zekra", 23);

        printLinien();
        System.out.println("...........");
//        erstelleText();  -->  myText1  -->  "Ich habe heute Programmierung Kurs";
        String y = erstelleText();
        System.out.println(y);

        printLinien();
        double ergebnis1 = berechneUmfang(47, 23.374);
        double ergebnis2 = berechneUmfang(12, 4.2);

        System.out.println(ergebnis1);
        System.out.println(ergebnis2);
        System.out.println("Good Bye..");

        double x = Methoden_7.pow(5, 3);
        double x2 = Math.pow(5, 3); // Built-in methods

        System.out.println(x);
        System.out.println(x2);

        System.out.println("00000000000000000000000");
        Methoden_7.printLinien();
        Auto.printLinien();
        printLinien();

    }
}
