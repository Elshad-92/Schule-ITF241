import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWaehlen Sie aus:");
        System.out.println("1 = Kreis");
        System.out.println("2 = Rechteck");
        int form = scanner.nextInt();

        if (form == 1) {

            try {
                Kreis k = new Kreis(4);

                System.out.print("Radius: ");
                k.setRadius(scanner.nextDouble());

                System.out.println("1 Umfang, 2 Fläche");
                int auswahl = scanner.nextInt();

                if (auswahl == 1) {
                    System.out.println("Umfang: " + k.berechneUmfang());
                } else if (auswahl == 2) {
                    System.out.println("Fläche: " + k.berechneFlaeche());
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Fehler: " + e.getMessage());
            }
        }

        else if (form == 2) {

            try {
                Rechteck r = new Rechteck(4,5);

                System.out.print("Seite A: ");
                r.setSeiteA(scanner.nextDouble());

                System.out.print("Seite B: ");
                r.setSeiteB(scanner.nextDouble());

                System.out.println("1 Umfang, 2 Fläche");
                int auswahl = scanner.nextInt();

                if (auswahl == 1) {
                    System.out.println("Umfang: " + r.berechneUmfang());
                } else if (auswahl == 2) {
                    System.out.println("Fläche: " + r.berechneFlaeche());
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Fehler: " + e.getMessage());
            }
        }

        else {
            System.out.println("Ungültige Auswahl");
        }
    }
}