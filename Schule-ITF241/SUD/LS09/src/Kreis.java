public class Kreis {

    double radius;

    public double berechneUmfang() {
        return 2 * Math.PI * radius;
    }

    public double berechneFlaeche() {
        return Math.PI * radius * radius;
    }

    public void berechnungAuswahl(int auswahl) {

        if (auswahl == 1) {
            System.out.println("Umfang: " + berechneUmfang());
        } else if (auswahl == 2) {
            System.out.println("Fläche: " + berechneFlaeche());
        }
    }
}