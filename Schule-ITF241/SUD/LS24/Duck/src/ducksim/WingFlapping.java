package ducksim;
public class WingFlapping implements FlyBehavior {
    private double frequency;
    private double amplitude;
    public WingFlapping(double frequency, double amplitude) {
        this.frequency = frequency; this.amplitude = amplitude;
    }
    public void fly() {
        System.out.println("Flapping wings at freq=" + frequency + "Hz and amplitude=" + amplitude);
    }
}
