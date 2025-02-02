package live_coding.kapitel3_weiterfuehrendeThemen;

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

    // Mit Parameter(s) & Mit Rueckgabewert

    public static void main(String[] args) {
        // Aufrufen der Methoden
        System.out.println("Hallo");
//        printLinien();
        begrusseBenutzer("Joudi", 22);
//        printLinien();
        begrusseBenutzer("Zekra", 23);
        begrusseBenutzer("Zekra", 23);
        begrusseBenutzer("Zekra", 23);
        begrusseBenutzer("Zekra", 23);
        begrusseBenutzer("Zekra", 23);
        begrusseBenutzer("Zekra", 23);

        System.out.println("Good Bye..");
    }
}
