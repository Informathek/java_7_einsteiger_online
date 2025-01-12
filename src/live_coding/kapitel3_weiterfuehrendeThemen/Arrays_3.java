package live_coding.kapitel3_weiterfuehrendeThemen;

public class Arrays_3 {
    public static void main(String[] args) {
        // Umgehen mit Variablen
        // 1. deklarieren: variable mit datentyp (einmal pro variable)
        int x;

        // 2. initialiseren: (ZUM ERSTEN MAL) einen Wert zuweisen (zu einer Variable)
        x = 10;

        // ueberschreiben: (NICHT ZUM ERSTEN MAL) einen ANDEREN Wert zuweisen (zu einer Variable)
        // x = 11;

        // print (auf die Konsole ausgeben)
        System.out.println(x);

        // Abkuerzung: Schritt 1 & 2 konnen wir in einer Zeile machen:
        // -> deklarieren und initialisiere auf ein mal
        int y = 2;


        // -----------------
        // Arrays: sammlung von elmenten vom selben Datentyp (int, String, char, float, bool, etc)

        System.out.println("--------- Beispiel 1: int array");

        // Beispiel: ungehen mit integer array: Sammlung von integer Elementen

        // 1. deklarieren.
        int[] meinLieblings_IntArr;

        // 2. Speicherplatz (size, groesse, anzahl elemente) allozieren
        meinLieblings_IntArr = new int[3];

        // 3. initialisieren: ZUM ERSTEN MAL einen Wert zuweisen (ausfuellen)
        // Werte:       3, 7, 5
        // ihre Index: 0, 1, 2
        meinLieblings_IntArr[0] = 3;
//        meinLieblings_IntArr[1] = 7;
//        meinLieblings_IntArr[2] = 5;
        // meinLieblings_IntArr[3] = 10; // gibt eine Fehlermeldung (error) aus.

        // ueberschreiben: (NICHT ZUM ERSTEN MAL) einen ANDEREN Wert zuweisen
        // meinLieblings_IntArr[0] = 4;
        // meinLieblings_IntArr[1] = 8;
        // meinLieblings_IntArr[2] = 6;

        // print
        System.out.println("-----------");
        System.out.println(meinLieblings_IntArr[0]);
        System.out.println(meinLieblings_IntArr[1]);
        System.out.println(meinLieblings_IntArr[2]);

        System.out.println(meinLieblings_IntArr.length);




        System.out.println("--------- Beispiel 2: String, char, boolean arrays");

        String[] meinLieblings_StringArr; // 1. deklarieren
        meinLieblings_StringArr = new String[4]; // 2. speicherplatz allozieren (reservieren)
        meinLieblings_StringArr[0] = "ich liebe java!"; // 3. initialisieren (ausfuellen)
        meinLieblings_StringArr[1] = "ich liebe Mathe!"; // 3. initialisieren (ausfuellen)
        meinLieblings_StringArr[2] = "ich liebe Informatik!"; // 3. initialisieren (ausfuellen)

        System.out.println(meinLieblings_StringArr[0]);
        System.out.println(meinLieblings_StringArr[1]);
        System.out.println(meinLieblings_StringArr[2]);
        System.out.println(meinLieblings_StringArr[3]); // auf english: null, also uebersetzt auf Deutsch bedeutet: nichts

        System.out.println("------ Abkuerzung schritt 1 (deklarieren) und schritt 2 (speicherplatz allozieren) in einer Zeile ---------");
        System.out.println("Beispiel 1: char");
        int z = 5;
        // int z = 5;

        char[] meinLieblings_char_arr = new char[2]; // schritt 1 (deklarieren) und schritt 2 (speicherplatz allozieren) in einer Zeile ");
        meinLieblings_char_arr[0] = 'A'; // initialisieren
//        meinLieblings_char_arr[1] = 'B'; // initialisieren

        System.out.println(meinLieblings_char_arr[0]); // A
        System.out.println(meinLieblings_char_arr[1]); // B




        System.out.println("----- Abkuerzung beispiel 2: boolean");

        boolean[] meinLieblings_booleanArr = new boolean[2]; // deklarieren und speicherplatz allozieren in einer zeile
        meinLieblings_booleanArr[0] = true;
//        meinLieblings_booleanArr[1] = true;
        System.out.println(meinLieblings_booleanArr[0]); // true
        System.out.println(meinLieblings_booleanArr[1]); // true
        System.out.println(meinLieblings_booleanArr.length); // 2


        System.out.println("------ Abkuerzung schritt 1 (deklarieren) und schritt 2 (speicherplatz allozieren -> diese brauchen wir nicht zu schreiben, weil es automatisch gemacht wird) und schritt 3 (initialisiern) in einer Zeile ---------");
        int[] meinLieblings_intArr_abkuerzung = {0, 5, 42}; // Geschweifte Klammer (Schweifklammer)
        System.out.println(meinLieblings_intArr_abkuerzung[0]); // 0
        System.out.println(meinLieblings_intArr_abkuerzung[1]); // 5
        System.out.println(meinLieblings_intArr_abkuerzung[2]); // 42





    }
}
