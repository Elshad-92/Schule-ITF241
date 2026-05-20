import java.util.Scanner;
public class KFZ {
    private String kennzeichen;
    private double tankgroesse;
    private double tankinhalt;
    private double maxGeschwindigkeit;
    private double aktuelleGeschwindigkeit;
    private boolean motorAn;

    Scanner scanner = new Scanner(System.in);

    public KFZ(String kennzeichen, double tankgroesse, double tankinhalt, double maxGeschwindigkeit, double aktuelleGeschwindigkeit, boolean motorAn) {
        setKennzeichen(kennzeichen);  // Validierung durchführen
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
        tankinhalt = Math.min(tankinhalt + liter, tankgroesse);
        return tankinhalt;
    }

    public double beschleunigen(){
        System.out.println("Geben Sie KMH für Beschleunigen an: ");
        double kmh = scanner.nextDouble();
        return beschleunigen(kmh);
    }

    public double beschleunigen(double kmh){
        aktuelleGeschwindigkeit = Math.min(kmh + aktuelleGeschwindigkeit, maxGeschwindigkeit);
        return aktuelleGeschwindigkeit;
    }

    public double bremsen(){
        System.out.println("Geben Sie KMH für Bremsen an: ");
        double kmh = scanner.nextDouble();
        return bremsen(kmh);
    }

    public double bremsen(double kmh){
        aktuelleGeschwindigkeit = Math.max(aktuelleGeschwindigkeit - kmh, 0);
        return aktuelleGeschwindigkeit;
    }

    public double fahren (){
        // Motor anschalten, falls nötig
        if (!motorAn) {
            System.out.println("Motor wird gestartet...");
            motorAn = true;
        }

        // Gewünschte Geschwindigkeit eingeben
        System.out.println("Geben Sie gewünschte Geschwindigkeit (KMH) an: ");
        double gewuenschteGeschwindigkeit = scanner.nextDouble();

        // Beschleunigen/Bremsen auf gewünschte Geschwindigkeit
        if (gewuenschteGeschwindigkeit > aktuelleGeschwindigkeit) {
            double differenz = gewuenschteGeschwindigkeit - aktuelleGeschwindigkeit;
            beschleunigen(differenz);
            System.out.println("Beschleunige auf " + aktuelleGeschwindigkeit + " KMH");
        } else if (gewuenschteGeschwindigkeit < aktuelleGeschwindigkeit) {
            double differenz = aktuelleGeschwindigkeit - gewuenschteGeschwindigkeit;
            bremsen(differenz);
            System.out.println("Bremse auf " + aktuelleGeschwindigkeit + " KMH");
        }

        // Entfernung eingeben
        System.out.println("Geben Sie Entfernung (KM) an: ");
        double entfernung = scanner.nextDouble();

        // Benzinverbrauch: 5,5 Liter pro 100 km
        double benziVerbrauch = (entfernung / 100.0) * 5.5;

        // Prüfen, ob genug Benzin vorhanden ist
        if (benziVerbrauch > tankinhalt) {
            System.out.println("Fehler: Nicht genug Benzin! Verbrauch: " + benziVerbrauch + "L, verfügbar: " + tankinhalt + "L" + "\n"
             + "Sie können nicht dahin fahren. Bitte zuerst tanken.");
            return tankinhalt;
        }

        // Benzin verbrauchen
        tankinhalt -= benziVerbrauch;
        System.out.println("Fahre " + entfernung + " km. Benzinverbrauch: " + benziVerbrauch + "L. Verbleibend: " + tankinhalt + "L");

        return tankinhalt;
    }
}
