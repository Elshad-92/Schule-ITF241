import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    double preis;
    double normalPreis = 0.28;
    double extraPreis = 0.25;
    double langeFahrtPreis = 0.20;
    int km;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Geben Sie die KM ein: ");
    km = scanner.nextInt();
    if (km <= 19){
        preis = km * normalPreis;
    }
    else if (km >= 20 && km < 50){
        preis = ((km - 20) * extraPreis) + (20 * normalPreis);
    }
    else {
        preis = (20 * normalPreis) + (30 * extraPreis) + ((km - 50) * langeFahrtPreis);
    }
        System.out.printf("Es wird %d KM gefahren. Preis: %.2f€%n", km, preis);

    }
}