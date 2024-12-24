package live_coding.kapitel2_flusskontrolle;

public class If_motivation_to_switch_1 {

    public static void main(String[] args) {

            // if else <=> switch
            // Aufgabe: Schreib ein Program, das die Wochentage ausgibt, gegeben die Tagsnummer.
            int tag = 5; // bekannt. Koennen wir aendern
            // auszugeben ist: System.out.println("Dienstag");

            if (tag == 1){
                System.out.println("Heute ist Montag");
            }

            if (tag == 2){
                System.out.println("Heute ist Dienstag");
            }

            if (tag == 3){
                System.out.println("Heute ist Mittwoch");
            }

            if (tag == 4){
                System.out.println("Heute ist Donnerstag");
            }

            if (tag == 5){
                System.out.println("Heute ist Freitag");
            }

            if (tag == 6){
                System.out.println("Heute ist Samstag");
            }

            if (tag == 7){
                System.out.println("Heute ist Sonntag");
            }

            // if (tag != 1 && tag != 2 && tag != 3 && tag != 4 && tag != 5 && tag != 6 && tag !=7) {
            //     System.out.println("Ungueltiger Tag");
            // }

            if (1 > tag || tag > 7) {
                System.out.println("Ungueltiger Tag");
            }




    }
}
