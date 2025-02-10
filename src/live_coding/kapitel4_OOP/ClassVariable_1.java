package live_coding.kapitel4_OOP;
// OOP: Objekt-orientierte Programmierung

public class ClassVariable_1 {
    public static int gewicht = 10; // class variable

    // definition der Methode
    public static void printSomething(){
        System.out.println("-----------------");
        // System.out.println(x); // Error
        String name = "ahmad";
        System.out.println(name);
        System.out.println(gewicht); // 10
        gewicht = 5; // uebeschreibe den Inhalt von Gewicht mit einem neuen Wert, naemlich 5.
        System.out.println(gewicht); // 5
    }

    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println(gewicht);
        printSomething(); // Aufruf der Methode
        int x = 23;
        System.out.println(x);
        // System.out.println(name); // Error
        System.out.println(gewicht); // 5
    }
}
