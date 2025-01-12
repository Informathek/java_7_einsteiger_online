package live_coding.kapitel3_weiterfuehrendeThemen;

public class Arrays_4_beispiele {
    public static void main(String[] args) {
        int[] zahlenArr1 = new int[10];  //Deklarieren und Spricherplatz allozieren/reservieren
        zahlenArr1[0] = 13;      // initialiseren / einen Wert zuweisen
        zahlenArr1[1] = 12;
        zahlenArr1[2] = 5;
        zahlenArr1[3] = 3;
        zahlenArr1[4] = 23;
        zahlenArr1[5] = 14;
        zahlenArr1[6] = 33;
        zahlenArr1[7] = 11;
        zahlenArr1[8] = 133;
        zahlenArr1[9] = 15;

        System.out.println(zahlenArr1[0]);
        System.out.println(zahlenArr1[1]);
        System.out.println(zahlenArr1[2]);
        System.out.println(zahlenArr1[3]);
        System.out.println(zahlenArr1[4]);
        System.out.println(zahlenArr1[5]);
        System.out.println(zahlenArr1[6]);
        System.out.println(zahlenArr1[7]);
        System.out.println(zahlenArr1[8]);
        System.out.println(zahlenArr1[9]);

        System.out.println("-------------");

        // bessere schreibweise
        int[] zahlenArr2 = {14, 33, 11, 133, 34, 34, 34};  //Deklarieren und intialiseren

        for(int i = 0; i < zahlenArr2.length; i++){
            // System.out.println(i); // 0, 1 , 2, ..., 6
            System.out.println(zahlenArr2[i]);
        }
    }
}
