package live_coding.kapitel2_flusskontrolle;

public class Switch_2 {
    public static void main(String[] args) {




        int size = 32; // 30 (S), 32 (M), L (34), XL (36)
        // robust

        /*

         if (size == 30){
             System.out.println("Die groess ist (S)");
        }


        if (size == 32){
            System.out.println("Die groess ist (M)");
        }


        if (size == 34){
             System.out.println("Die groess ist (L)");
        }

        if (size == 36){
          System.out.println("Die groess ist (XL)");
        }

        else {
            System.out.println("Die groess gibt es bei uns nicht");
        }

        */


        // -------- switch ------- break

        size = 100; // 30 (S), 32 (M), L (34), XL (36)

        switch (size){
            case 30: // if (size == 30)
                System.out.println("Die groess ist (S)");
                break;

            case 32:
                System.out.println("Die groess ist (M)");
                break;

            case 34:
                System.out.println("Die groess ist (L)");
                break;

            case 36:
                System.out.println("Die groess ist (XL)");
                break;

            default:
                System.out.println("Die groess ist unbekannt");
        }


        if (size <= 100){
            System.out.println("Die groess ist (XXXXS)");
        }
        else {
            System.out.println("Die groess ist (XXXXXL)");
        }

//
//        switch(size){
//            case 1:
//                // print
//
//            case 2:
//                // print
//
//                // ...
//            case 99:
//                // print
//
//            case 100:
//                //print
//
//            default: // wenn groesser als 100
//                // print
//        }

        System.out.println("ENDE ...");


    }
}
