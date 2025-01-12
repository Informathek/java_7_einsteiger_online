package live_coding.kapitel3_weiterfuehrendeThemen;
// english <-> Deutsch
// zero    <-> Null
// null    <-> Nichts
public class Arrays_2 {
    public static void main(String[] args) {
        // arrays: sammlung von Elementen
        int zahl1 = 5;
        int zahl2 = 35;
        int zahl3 = 2;
        int zahl4 = 8;
        int x = 6;

        // 1. deklarieren
        int y; // 1 element speichern
        int[] arr; // mehrere elemente

        // 2. speichern allozieren
        arr = new int[5];

        // 3. initialiseren
        y = 10;
        arr[0] = 5;
        arr[1] = 35;
        arr[2] = 2;
        arr[3] = 8;
        arr[4] = 6;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // deklarieren und intitalisieren auf einmal
        int z = 10;




//        int[] arr_int = {5, 35, 3, 8, 6};
//        double[] arr_double = {5.7, 353.2, 3.6, 8.2, 6};
//        String[] arr_string = {"hello", "World"};
    }
}
