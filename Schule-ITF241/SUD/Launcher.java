import java.util.Scanner;

/**
 * Zentraler Launcher für alle Lernsituationen (LS01-LS30)
 *
 * Dieser Launcher ermöglicht es dir, zwischen verschiedenen Aufgaben zu wechseln,
 * ohne den Classloader zu wechseln. Führe einfach diesen Launcher aus und wähle
 * die gewünschte Lernsituation aus.
 *
 * Hinweis: Da jede LS in einem separaten Projekt ist, musst du zuerst die
 * gewünschte LS öffnen und deren Main.java ausführen, ODER diesen Launcher
 * als Koordinationspunkt nutzen.
 */
public class Launcher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            printMenu();
            System.out.print("\n> Wähle eine Lernsituation (1-30) oder 0 zum Beenden: ");

            try {
                int choice = scanner.nextInt();

                if (choice == 0) {
                    System.out.println("Auf Wiedersehen!");
                    running = false;
                } else if (choice >= 1 && choice <= 30) {
                    executeLearningUnit(choice);
                } else {
                    System.out.println("❌ Ungültige Eingabe! Bitte 0-30 eingeben.");
                }
            } catch (Exception e) {
                System.out.println("❌ Fehler bei der Eingabe. Bitte eine Zahl eingeben.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("   SCHULE ITF241 - LAUNCHER");
        System.out.println("   Lernsituationen Übersicht");
        System.out.println("=".repeat(50));
        System.out.println();

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println(String.format(" LS%02d", i));
            } else {
                System.out.print(String.format(" LS%02d |", i));
            }
        }

        System.out.println("\n" + "=".repeat(50));
    }

    private static void executeLearningUnit(int unit) {
        System.out.println("\n" + "-".repeat(50));
        System.out.println(String.format("✅ Starte LS%02d", unit));
        System.out.println("-".repeat(50));
        System.out.println("\n📌 Hinweis: Da LS%02d als separates Projekt strukturiert ist,", unit);
        System.out.println("öffne bitte folgende Datei in IntelliJ:");
        System.out.println(String.format("   SUD/LS%02d/src/Main.java", unit));
        System.out.println("\nFühre diese Datei dann direkt aus (Shift+F10).\n");
    }
}

