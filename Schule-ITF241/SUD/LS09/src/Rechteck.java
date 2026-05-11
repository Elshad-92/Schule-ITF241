public class Rechteck {

    double seiteA;
    double seiteB;

    public double berechneUmfang() {
        return 2 * (seiteA + seiteB);
    }

    public double berechneFlaeche() {
        return seiteA * seiteB;
    }
}