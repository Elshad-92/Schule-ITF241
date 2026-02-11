package Aufgabe5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double zahl1;
        double zahl2;
        double ergebnis;

        System.out.println("Berechnung (Multiplikation): ");
        System.out.print("Geben Sie erste Zahl ein: ");
        zahl1 = scanner.nextDouble();

        System.out.print("Geben Sie zweite Zahl ein: ");
        zahl2 = scanner.nextDouble();

        ergebnis = zahl1 * zahl2;
        ergebnis = Math.round(ergebnis * 100.0) / 100.0;

        System.out.println("Ergebnis: " + ergebnis);
    }
}