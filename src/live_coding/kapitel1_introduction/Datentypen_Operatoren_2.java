package live_coding.kapitel1_introduction;

public class Datentypen_Operatoren_2 {

    public static void main(String[] args) {

        // 1. Syntax: Grammatik

        // 2. Symantik: Bedeutung, Logik (Kein Fehlermeldung)

        // 3. Konvention: Abgemacht zwischen Programmierer  (bekomme kein Fehlermeldung)

        int a = 10;
        double b = 2.568;
        short gewicht = 50;
        char groesse = 's';
        String satz = "hello world";
        int alter = 18;

        // -----------------------
        // 1. Dekleration: definieren
        int x;

        // 2. Initialisieren: Ich weise einer Variable einen Wert zu.
        x = 16;
        // System.out.println(x);

        x = 7;
        // System.out.println(x);
        // 3. Beide zusammen (Deklarieren und initialisieren gleichzeitig)
        int y = 6;
        System.out.println(y); // 6

        y = 8; // ueberschreibe den Wert von y mit 8
        System.out.println(y); // 8

        x = 9;
        System.out.println(x); // 9
        System.out.println(x); // 9

        // System.out.println(x + ", " + x);

        System.out.println(3 + 4); // 7: int + int
        System.out.println("3" + "4"); //34 String + String
        System.out.println(3 + "4"); // 34: int + String
        System.out.println("3" + 4); // 34: String + int

        // int + String + int
        System.out.println(5 + 1 + "3" + 4 + 1); // 6341

        System.out.println(5 + 1 + "3" + 4 + 1 + 1); // 63411
        // ---------------

        int zahl = 0;
        zahl = 3 + 1 * 2 - 4;
        System.out.println(zahl); // 1

        x = 2; // x = 2
        zahl = x; // zahl = 2
        x = 7; // x = 7
        x = zahl; // x = 2
        System.out.println(x); // 2
        System.out.println(zahl); // 2

        System.out.println("==================");
        x = 5;
        zahl = x + 1; // zahl = 6, x = 5
        System.out.println(zahl); // 6
        System.out.println(x + 1); // 6
        System.out.println(x); // 5

        System.out.println("==================");
        //zahl ist 6
        zahl = zahl + 5; // zahl = 11

        // zahl ist 11
        zahl += 5; // zahl = 16

        System.out.println(zahl+=5); // zahl = zahl+5 = 21
        System.out.println(zahl); // 21

        // zahl ist 21, x ist 5
        zahl += x; // zahl = zahl + x // 21 + 5 = 26
        System.out.println(zahl); // 26

        // zahl ist 26
        zahl = zahl + 1; // 27
        zahl += 1; // 28
        zahl++; // 29
        System.out.println(zahl); // 29

        int ranim = 100;
        ranim *= 2; // ranim = ranim * 2
        System.out.println(ranim);

        System.out.println("***************");
        System.out.println(1 < 1); // False
        System.out.println(1 > 1); // False
        System.out.println(1 <= 1); // True
        System.out.println(1 >= 1); // True

        System.out.println(1 == 1); // True
        System.out.println(1 == 2); // False
        System.out.println(1 != 1); // False
        System.out.println(1 != 2); // True


        System.out.println(3 > 1); // true
        System.out.println("//////////");



        boolean vergleichNummer;
        vergleichNummer = 3 > 1; // true
        System.out.println(vergleichNummer);


        boolean schalter = true; // oder false
        System.out.println(schalter); // true
        System.out.println(false); // true
        System.out.println(42); // true

        // Boolosche Variablen:
        // - true: 1 oder alle zahlen ausser 0
        // - false: 0

        // UND verhaelt sich wie mult: *
        // false = false && false; // 0 = 0 * 0
        // false = false && true; // 0 = 0 * 1
        // false = true && false; // 0 = 1 * 0
        // true = true && true; // 1 = 1 * 1


        // ODER verhaelt sich wie sum: +
        // false = false || false; // 0 = 0 + 0
        // true = false || true; // 1 = 0 + 1
        // true = true || false; // 0 = 1 + 0
        // true = true || true; // 2 = 1 + 1

        boolean g = (true || true) || true && false;
        // true || true && false
        // true || false
        // true
        System.out.println(g);


        // -------

        // nummerisch < nummerisch
        // 1 < 3 = true

        // boolisch && boolisch
        // true && false
        // (1 < 3) && (5 <= 2)

        // -------
        // darf rein wenn aelter als 18 und junger als 30
        int age = 30;
        boolean darfRein = (age > 18) && (age < 30);
        System.out.println("Darf die Person rein?: " + darfRein);

    }
}
