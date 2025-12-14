import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double gewicht;
        double groesse;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie gewicht an: ");
        gewicht = scanner.nextDouble();

        System.out.println("Geben Sie groese in Meter an: ");
        groesse = scanner.nextDouble();

        // BMI-Klasse aufrufen
        BMI.calculateBMI(gewicht, groesse);

        scanner.close();
    }
}

