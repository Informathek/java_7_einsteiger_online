package live_coding.kapitel3_weiterfuehrendeThemen;

public class Arrays_5_wiederholung {
    public static void main(String[] args) {


        // 1. deklarieren
        int[] intArr;

        // 2. speicherplatz allozieren
        intArr = new int[3];

        // 3. initalisieren: einen wert zuweisen.
        intArr[0] = 17;
        intArr[1] = 5;
        intArr[2] = 4;

        // 4. print
        System.out.println(intArr[0]);
        System.out.println(intArr[1]);
        System.out.println(intArr[2]);

        //        -------------- Abkuerzung 1
        // 1. deklarieren und speicherplatz allozieren
        int[] intArr1 = new int[3];

        // 2. initialisieren
        intArr1[0] = 17;
        intArr1[1] = 5;
        intArr1[2] = 4;

        // 3. print
        System.out.println(intArr1[0]);
        System.out.println(intArr1[1]);
        System.out.println(intArr1[2]);

        //        -------------- Abkuerzung 2
        int[] intArr2 = {17, 5, 4};
        System.out.println(intArr2[0]);
        System.out.println(intArr2[1]);
        System.out.println(intArr2[2]);

        // aendere den ersten Wert von jedem array
        // zugreifen
        // zuweisen
        // ueberschreiben
        intArr[0] = 10;
        System.out.println(intArr[0]); // 10
        System.out.println(intArr[1]); // 5
        System.out.println(intArr[2]); // 4

        // methode


        // =========
        int[] myArr = {4,5,6,5,345,453,6,45,7,5647,658,7,68,576,9,879,6789,68790,8,656,785,678,5768576};
        // task: printe alle elmente (den inhalt) des array: myArr
        System.out.println(myArr.length);
        System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[2]);
        System.out.println(myArr[3]);

        System.out.println("---");

        for (int i = 0; i<=myArr.length-1; i++){
            System.out.println(myArr[i]);
        }




    }
}
