package live_coding.kapitel2_flusskontrolle;

public class Switch_4_wiederholung {

    public static void main(String[] args) {

            // if else <=> switch
            // Aufgabe: Schreib ein Program, das die Wochentage ausgibt, gegeben die Tagsnummer.
            int tag = 15; // bekannt. Koennen wir aendern
            // auszugeben ist: System.out.println("Dienstag");

            switch(tag){
                case 1: // (case == KannAllesSein)
                    System.out.println("Heute ist Montag");
                    break;

                case 2:
                    System.out.println("Heute ist Dienstag");
                    break;

                case 3:
                    System.out.println("Heute ist Mittwoch");
                    break;

                case 4:
                    System.out.println("Heute ist Donnerstag");
                    break;

                case 5:
                    System.out.println("Heute ist Freitag");
                    break;

                case 6:
                    System.out.println("Heute ist Samstag");
                    break;

                case 7:
                    System.out.println("Heute ist Sonntag");
                    break;

                default:
                    System.out.println("Ungueltiger Tag");
            }


    }
}
