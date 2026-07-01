public class Kreis {

    private double radius;

    /**
     * Erstellt einen neuen Kreis mit dem angegebenen Radius.
     *
     * @param radius Der Radius des Kreises (muss größer als 0 sein)
     * @throws IllegalArgumentException wenn radius <= 0
     */
    public Kreis(double radius){
        if (radius <= 0) {
            throw new IllegalArgumentException("Ungültiger Radius! Muss > 0 sein.");
        }
        this.radius = radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Ungültiger Radius! Muss > 0 sein.");
        }
    }

    public double getRadius() {
        return radius;
    }

    public double berechneUmfang() {
        return 2 * Math.PI * radius;
    }

    public double berechneFlaeche() {
        return Math.PI * radius * radius;
    }
}