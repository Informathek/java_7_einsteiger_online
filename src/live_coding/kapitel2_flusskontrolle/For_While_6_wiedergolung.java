package live_coding.kapitel2_flusskontrolle;

public class For_While_6_wiedergolung {
    public static void main(String[] args) {

        // if VS. switch --> condition, moeglichkeiten waehlen
        // while: --> Wiederholung, Schleife
//        int x = 6;
//        int y = 5;
//        int z = 3;
//        int summe = x + y + z;
//        int durchschnitt = summe / 3;
//        System.out.println(durchschnitt);

        // print die zahlen von 0 bis 100
        int x = 0;
        while(x <= 100){
            System.out.println(x); // 0, ..., 100
            x++;
        }

        System.out.println("-------");
        System.out.println(x);
        System.out.println("-------");

        // print die zahlen von 0 bis 100
        x = 0;
        while(true){
            System.out.println(x); // 0, ..., 99, 100
            x++;
            if(x > 100){
                break;
            }
        }




        // for --> Wiederholung, Schleife
        // schreibe nur "x = 0" anstelle von "int x = 0", weil x ist schon oben deklariert.
        for(x = 0; x <= 100; x++){
            System.out.println(x); // 0, 1, 98, 99, 100
        }

        System.out.println("*************");
        // for schleife: print zahlen rueckwaerts von 100 bis 0
        for (int y = 100; y >= 0; y--){
            System.out.println(y);
        }

        // z = 0
        // z = z + 1 // -> z = 1
        // z += 1    // -> z = 2
        // z++      //  -> z = 3
        // ---
        // x = 0
        // x = x + 2 // -> x = 2
        // x += 2    // -> x = 4
        // x++       // -> x = 5

        System.out.println("££££££££");
        // for: print gerade zahlen (0, 2, 4, 100) aufsteigend
        for (int z=0;    z<=100;     z+=2){
            System.out.println(z);
        }


        System.out.println("%%%%%%%%");
        // for: print UNGERADE zahlen (1, 3, 5, 99) aufsteigend
        for (int c=1;    c<=100;     c+=2){
            System.out.println(c);
        }
    }
}













