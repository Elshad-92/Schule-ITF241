import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char eingabe1;
        int eingabe2;

        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie ein Char ein:");
        eingabe1 = s.next().charAt(0);
        System.out.println("Geben Sie ein Zahl ein:");
        eingabe2 = s.nextInt();

        System.out.println("Eingegebene Zeichen ist: " + eingabe1 + "\n" +  "Eingegebene Zahl ist: " + eingabe2 );

    }
}