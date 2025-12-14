import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int menge;
        double stueckPreis = 2.50;
        String kategorie;
        String griffbezeichnung;
        double endpreis;
        double finalpreis;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie Bestellmenge ein: ");
        menge = scanner.nextInt();
        System.out.println("Waehlen Sie Kategorie aus: (weich, mittel, hart) ");
        kategorie = scanner.next();
        System.out.println("Waehlen Sie Griffbezeichnung aus: (gross, normal, kinder) ");
        griffbezeichnung = scanner.next();

        if (menge < 500) {
            finalpreis = menge * stueckPreis;
        }
        else if (menge >= 20000) {
            endpreis = menge * stueckPreis;
            finalpreis = endpreis - (endpreis * 0.10);
        } else {
            endpreis = menge * stueckPreis;
            finalpreis = endpreis - (endpreis * 0.05);
        }
            if (kategorie.equals("weich") && griffbezeichnung.equals("kinder")) {
                finalpreis = finalpreis - (finalpreis * 0.05);
            } else if (griffbezeichnung.equals("kinder")) {
                finalpreis = finalpreis - (finalpreis * 0.02);
            } else if (kategorie.equals("weich") && griffbezeichnung.equals("normal") || kategorie.equals("weich") && griffbezeichnung.equals("gross")) {
                finalpreis = finalpreis - (finalpreis * 0.01);
            }
            if (kategorie.equals("hart")) {
                if (griffbezeichnung.equals("normal")) {
                    finalpreis = finalpreis + (finalpreis * 0.025);
                } else if (griffbezeichnung.equals("gross")) {
                    finalpreis = finalpreis + (finalpreis * 0.05);
                }
            }
            System.out.println("Die Menge: " + menge + "\n");
            System.out.println("Die Kategorie: " + kategorie + "\n");
            System.out.println("Die Griffbezeichnung: " + griffbezeichnung + "\n");
            System.out.println("Der Preis: " + finalpreis + "\n");
    }
}