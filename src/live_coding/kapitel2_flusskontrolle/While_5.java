package live_coding.kapitel2_flusskontrolle;

public class While_5 {

    public static void main(String[] args) {

        // 1. while loop

        // Syntax: grammatik
        int tag = 1;

        while (tag <= 7) { // solange , as long as
            System.out.println(tag);
            tag++;  // inkrementieren
        }

        System.out.println("Bye");

        System.out.println("-------");

        tag = 1;
        while (true){
            if (tag <= 7){
                System.out.println(tag);
                tag++;  // inkrementieren
            }
            else {
                break;
            }
        }
        System.out.println("Good Bye!");

        // int mohammad = 1000

        // mohammad = mohammad + 1
        // mohammad += 1
        // mohmmad++





    }
}
