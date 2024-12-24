package live_coding.kapitel2_flusskontrolle;

public class For_6 {

    public static void main(String[] args) {
        // 2. for schleife (loop)

        // ---------- while
        // int tag = 1;
        // while (tag <= 7) { // solange , as long as
        //     System.out.println(tag);
        //     tag++;  // inkrementieren
        // }

        // ----------- for
        for (int tag = 1; tag <= 7; tag++) {

            System.out.println(tag);
            break;
        }

        System.out.println("Good Bye");
    }
}
