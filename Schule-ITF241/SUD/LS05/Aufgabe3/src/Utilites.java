import java.util.Scanner;

public class Utilites {

    private static Scanner scanner = new Scanner(System.in);

        public static double berechneCelsius () {
        System.out.print("Celsius Berechnung. Geben Sie Fahrenheit ein: ");
        double eingabe1 = scanner.nextDouble();
        double ergebnisCelsius = (eingabe1 - 32) / 1.8;
        System.out.println("Celsius Ergebnis: " + ergebnisCelsius);
        return ergebnisCelsius;
    }

    public static double berechneFahrenheit () {
        System.out.print("Fahrenheit Berechnung. Geben Sie Celsius ein: ");
        double eingabe1 = scanner.nextDouble();
        double ergebnisCelsius = (eingabe1 *1.8) + 32;
        System.out.println("Fahrenheit Ergebnis: " + ergebnisCelsius);
        return ergebnisCelsius;
    }

    public static double berechneKelvin () {
        System.out.print("Kelvin Berechnung. Geben Sie Celsius ein: ");
        double eingabe1 = scanner.nextDouble();
        double ergebnisCelsius = (eingabe1 + 273.15);
        System.out.println("Kelvin Ergebnis: " + ergebnisCelsius);
        return ergebnisCelsius;
    }
}