package live_coding.kapitel1_introduction;

public class Syntax_Variablen_Literale_Datentypen_1 {

    public static void main(String[] args) {

        // Die naechsten Zeilen printen etwas..
        // System.out.println("Ich");
        // System.out.println("liebe");
        // System.out.println("Java");

        // System.out.println("5 + 6");
        // System.out.println(5 + 6);

        // int a = 3;

        // System.out.println(3 + 2);
        // System.out.println(3 + 3);
        // System.out.println(3 + 4);
        // System.out.println(3 + 19);

        // System.out.println(a + 2);
        // System.out.println(a + 3);
        // System.out.println(a + 4);
        // System.out.println(a + 19);

        int meineSpezieleLangeVariable = 3;
        int c = 4;
        int b = 4;
        int ergebnis = b - c;

        System.out.println(ergebnis);

        String LieblingsSatz = "Jiyan    Mag Java";
        System.out.println("LieblingsSatz");
        System.out.println(LieblingsSatz);

        System.out.println("----------------");

        char ersterBuchstabe = 'W';
        System.out.println("ersterBuchstabe");
        System.out.println(ersterBuchstabe);

        // Alter in Jahren
        short alter = 24;

        // Gewicht von Menschen in kg
        float gewicht1 = 62.42F;
        double gewicht2 = 63.42;

        System.out.println(gewicht1 + ", " +alter);

        System.out.println("----------------");
        float zahl1 = 1f;
        float zahl2 = 3f;

        float erg1 = zahl1 / zahl2;
        System.out.println(erg1);

        double erg2 = zahl1 / zahl2;
        System.out.println(erg2);

    }
}
