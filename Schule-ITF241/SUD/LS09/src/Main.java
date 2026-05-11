import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 = Kreis");
        System.out.println("2 = Rechteck");
        int form = scanner.nextInt();

        if (form == 1) {

            Kreis k = new Kreis();

            System.out.print("Radius: ");
            k.setRadius(scanner.nextDouble());

            System.out.println("1 Umfang, 2 Fläche");
            int auswahl = scanner.nextInt();

            if (auswahl == 1) {
                System.out.println("Umfang: " + k.berechneUmfang());
            } else if (auswahl == 2) {
                System.out.println("Fläche: " + k.berechneFlaeche());
            }
        }

        else if (form == 2) {

            Rechteck r = new Rechteck();

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
        }

        else {
            System.out.println("Ungültige Auswahl");
        }
    }
}