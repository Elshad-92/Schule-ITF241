import java.util.Scanner;
import static java.text.ChoiceFormat.nextDouble;

public class KFZ {
    private String kennzeichen;
    private double tankgroesse = 55;
    private double tankinhalt = 10;
    private double maxGeschwindigkeit;
    private double aktuelleGeschwindigkeit = 60;
    private boolean motorAn = false;

    Scanner scanner = new Scanner(System.in);

    public KFZ(String kennzeichen, double tankgroesse, double tankinhalt, double maxGeschwindigkeit, double aktuelleGeschwindigkeit, boolean motorAn) {
        this.kennzeichen = kennzeichen;
        this.tankgroesse = tankgroesse;
        this.tankinhalt = tankinhalt;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.aktuelleGeschwindigkeit = aktuelleGeschwindigkeit;
        this.motorAn = motorAn;
    }
    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {

        String regex = "^[A-ZÄÖÜ]{1,3}\\s[A-Z]{1,2}\\s\\d{1,4}$";

        if (kennzeichen.matches(regex)) {
            this.kennzeichen = kennzeichen;
        } else {
            throw new IllegalArgumentException(
                    "Ungültiges Kennzeichenformat!"
            );
        }
    }
    public double tanken(){
        System.out.println("Geben Sie Liter an: ");
        double liter = scanner.nextDouble();
        double tankZustand = liter - tankinhalt;
        return tankZustand;
    }

    public double beschleunigen(){
        System.out.println("Geben Sie KMH für Beschleunigen an: ");
        double kmh = scanner.nextDouble();
        double neueGeschwindigkeit = kmh + aktuelleGeschwindigkeit;
        return neueGeschwindigkeit;
    }

    public double bremsen(){
        System.out.println("Geben Sie KMH für Bremsen an: ");
        double kmh = scanner.nextDouble();
        double afterBremsen = kmh - aktuelleGeschwindigkeit;
        return afterBremsen;
    }

    public double fahren (){
        //Beim Fahren für eine, in Kilometern anzugebende, Entfernung und eine durchschnittliche Geschwindigkeit, wird
        //gegebenenfalls erst der Motor angestellt und auf die angegebene Geschwindigkeit beschleunigt. Der Verbrauch von
        //Benzin ist 5,5 Liter pro 100 km.
        System.out.println("Geben Sie KMH für Fahren an: ");
        double kmh = scanner.nextDouble();



        return

    }
}
