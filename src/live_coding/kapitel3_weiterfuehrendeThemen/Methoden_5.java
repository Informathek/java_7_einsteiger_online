package live_coding.kapitel3_weiterfuehrendeThemen;

import java.util.Random;

public class Methoden_5 {
    public static void main(String[] args) {
        Random Random = new Random();
        // Motivation: Built-in Methoden
        // power: potenz
        // 5 ^ 2: 5 * 5 = 25
        // 5 ^ 3: 5 * 5 * 5 = 125
        // 3 ^ 4: 3 * 3 * 3 * 3 = 81
        // 3 * 4 = 3 + 3 + 3 + 3 oder 4 + 4 + 4

        // - Name der Methoden:
        // ====================
        // pow, abs, round, nextInt, nextDouble, println


        // Parameter/Argumente:
        // ====================
        // - Value und daten Typ von Parameter/argmeunte der Methoden
        //       pow: 3 (double), 4 (double)
        //       abs: -2.2 (double)
        //       round: 12.3 (double)
        //       nextInt: Keine
        //       nextDouble: 10.2 (double), 15.5 (double)
        //       print: beliebig!!!!!!


        // Rueckgabewert (return value):
        // =============================
        // Ergebnis der Methode
        //       pow: 81.0 (double)
        //       abs: 2.2 (double)
        //       round: 13.0 (long)
        //       nextInt: -2019653451 (int)
        //       nextDobule: 13.352106630761657 (double)
        //       println: void!!!!!!

        // Ich rufe eine Methode auf
        double potenz = Math.pow(3.0, 4.0); // arguments, parameters
        double betrag = Math.abs(-2.2); // abs: steht fuer absolute: Betrag,
        long runden = Math.round(12.6);
        int beliebigInt = Random.nextInt();
        double beliebigDouble = Random.nextDouble(10.2, 15.5);

        System.out.println(3);

        System.out.println(potenz);
        System.out.println(betrag);
        System.out.println(runden);
        System.out.println(beliebigInt);
        System.out.println(beliebigDouble);


    }
}
