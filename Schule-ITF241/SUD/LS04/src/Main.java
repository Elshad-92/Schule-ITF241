import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String eingabe1;
        double eingabe2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie ein Zeichen ein: ");
        eingabe1 = scanner.next();

        System.out.println("Geben Sie ein Dezimalzahl ein: ");
        eingabe2 = scanner.nextDouble();

        System.out.println("Zeichen: " + eingabe1 + "\n" + "Dezimalzahl: " + eingabe2);

        scanner.close();
    }
}

