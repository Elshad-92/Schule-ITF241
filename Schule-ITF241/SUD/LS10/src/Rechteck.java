public class Rechteck {

    double seiteA;
    double seiteB;

    /**
     * Erstellt ein neues Rechteck mit den angegebenen Seitenlängen.
     * 
     * @param seiteA Die Länge der Seite A (muss größer als 0 sein)
     * @param seiteB Die Länge der Seite B (muss größer als 0 sein)
     * @throws IllegalArgumentException wenn seiteA <= 0 oder seiteB <= 0
     */
    public Rechteck (double seiteA, double seiteB){
        if (seiteA <= 0) {
            throw new IllegalArgumentException("Ungültige Seite A! Muss > 0 sein.");
        }
        if (seiteB <= 0) {
            throw new IllegalArgumentException("Ungültige Seite B! Muss > 0 sein.");
        }
        this.seiteA = seiteA;
        this.seiteB = seiteB;
    }

    public void setSeiteA(double seiteA) {
        if (seiteA > 0) {
            this.seiteA = seiteA;
        } else {
            System.out.println("Ungültige Seite A! Muss > 0 sein.");
        }
    }

    public void setSeiteB(double seiteB) {
        if (seiteB > 0) {
            this.seiteB = seiteB;
        } else {
            System.out.println("Ungültige Seite B! Muss > 0 sein.");
        }
    }


    public double getSeiteA(){
        return seiteA;
    }
    public double getSeiteB(){
        return seiteB;
    }


    public double berechneUmfang() {
        return 2 * (seiteA + seiteB);
    }

    public double berechneFlaeche() {
        return seiteA * seiteB;
    }
}