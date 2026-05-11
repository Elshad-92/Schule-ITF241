public class Kreis {

    private double radius;

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