import java.util.Scanner;

// Main-Klasse: Input + BMI aufrufen
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int zahl;
    String antwort;

    System.out.println("Geben Sie ein Zahl ein: ");
    zahl = scanner.nextInt();
    switch (zahl) {
        case 0:
            System.out.println("Null");
            break;
        case 1:
            System.out.println("Eins");
            break;
        case 2:
            System.out.println("Zwei");
            break;
        case 3:
            System.out.println("Drei");
            break;
        case 4:
            System.out.println("Vier");
            break;
        case 5:
            System.out.println("Fünf");
            break;
        case 6:
            System.out.println("Sechs");
            break;
        case 7:
            System.out.println("Sieben");
            break;
        case 8:
            System.out.println("Acht");
            break;
        case 9:
            System.out.println("Neun");
            break;
        case 10:
            System.out.println("Zehn");
            break;
        default:
            System.out.println("Es darf nur von 0 bis 10 eingegeben werden!");
        }
    }
}

