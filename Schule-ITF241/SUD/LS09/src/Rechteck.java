public class Rechteck {

    double seiteA;
    double seiteB;

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