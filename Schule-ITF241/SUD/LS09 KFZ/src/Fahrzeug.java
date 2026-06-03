
public class Fahrzeug {

    private String registrationPlateNumber;
    private double tankSize = 50;
    private double currentFuelVolume = 0;
    private boolean motorRunning = false;
    private double speed = 0;
    private double maxSpeed = 160;

    public void setRegistrationPlateNumber(String kennzeichen){
        if (kennzeichen == null) {
            System.out.println("Kennzeichen darf nicht null sein.");
        }
        // Zerlegung in 3 Teile
        String[] teile = kennzeichen.split(" ");

        // 1. Prüfung: Besteht das Kennzeichen aus genau 3 Teilen?
        if (teile.length != 3) {
            System.out.println("Format muss sein: [Ort] [Buchstaben] [Zahlen]");
        }

        String ort = teile[0];
        String buchstaben = teile[1];
        String zahlen = teile[2];

        // 2. Validierung: Ortskürzel (1-3 Buchstaben)
        if (ort.length() < 1 || ort.length() > 3 || !hasOnlyLetters(ort)) {
            System.out.println("Ungültiges Ortskürzel.");
        }

        // 3. Validierung: Erkennungs-Buchstaben (1-2 Buchstaben)
        if (buchstaben.length() < 1 || buchstaben.length() > 2 || !hasOnlyLetters(buchstaben)) {
            System.out.println("Ungültige Erkennungs-Buchstaben.");
        }

        // 4. Validierung: Zahlen (1-4 Ziffern, keine führende Null)
        if (zahlen.length() < 1 || zahlen.length() > 4 || !isNumber(zahlen)) {
            System.out.println("Ungültige Zahlenfolge.");
        }
        if (zahlen.startsWith("0")) {
            System.out.println("Zahlen dürfen nicht mit 0 beginnen.");
        }
        // Wenn alle Prüfungen bestanden sind:
        this.registrationPlateNumber = kennzeichen;
    }

    // Hilfsmethode: Prüft, ob ein String nur aus Buchstaben besteht
    private boolean hasOnlyLetters(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isLetter(c))
                return false;
        }
        return true;
    }

    // Hilfsmethode: Prüft, ob ein String nur aus Ziffern besteht
    private boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed){
        if (maxSpeed >= 25)
            this.maxSpeed = maxSpeed;
        else
            System.out.println("Mindestens 25kmh muss das MotorVehicle fahren koennen.");
    }

    public double getTankSize() {
        return tankSize;
    }

    public void setTankSize(double tankSize){
        if (tankSize >= 5)
            this.tankSize = tankSize;
        else
            System.out.println("Mindestens 5 Liter muss der Tank haben.");
    }

    public double getCurrentFuelVolume() {
        return currentFuelVolume;
    }

    public void setCurrentFuelVolume(double liter) {
        if (liter >= 0)
            this.currentFuelVolume = liter;
        else
            this.currentFuelVolume = 0;
    }

    public void drive(double km, double atSpeed) {
        if (!this.motorRunning) {
            this.motorRunning = true;
            if (this.currentFuelVolume > 0) {
                this.setSpeed(atSpeed);
                System.out.println("Zuendschluessel gedreht - brumm. ");
                System.out.println("Faehrt mit " + this.speed + " kmh.");
            } else
                System.out.println("Tank ist leer.");
        }
        double literVerbrauch = km * 5.5 / 100;
        double reichtFuerKM = 100 * this.currentFuelVolume / 5.5;
        if (km <= reichtFuerKM) {
            setCurrentFuelVolume(this.currentFuelVolume - literVerbrauch);
            System.out.println("Faehrt " + km + " km und verbraucht dabei " + literVerbrauch + " Liter.");
        } else {
            setCurrentFuelVolume(0);
            System.out.println("Faehrt nur " + reichtFuerKM + " dann ist der Tank leer.");
        }
    }

    public double refuel(double liter) {

        double ueberlauf = 0; // wegen der Lesbarkeit

        if (liter > 0) {
            if (currentFuelVolume + liter <= this.tankSize) {
                this.currentFuelVolume = currentFuelVolume + liter;
            } else {
                System.out.println("Beim Ueberlaufen abgebrochen. Tank ist maximal gefuellt");
                this.currentFuelVolume = this.tankSize;
                ueberlauf = this.currentFuelVolume + liter - this.tankSize;
            }
        } else {
            System.out.println("Negative Liter?!?!");
        }
        return ueberlauf;
    }

    public boolean isMotorRunning() {
        return this.motorRunning;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed){
        if (speed > 0 && speed <= this.maxSpeed)
            this.speed = speed;
        else
            System.out.println("Speed not within permissible parameters.");
    }

    public void decelerate(double kmh) {
        if (kmh > 0 && speed - kmh >= 0)
            this.setSpeed(this.speed -= kmh);
        else
            speed = 0;
    }

    public void accelerate(double kmh) {
        if (kmh > 0)
            try {
                this.setSpeed(this.speed += kmh);
            }catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
                this.setSpeed(this.maxSpeed);
            }
    }

    // Stammdaten = engl master data
    public String masterDataToString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stammdaten von ").append(this.registrationPlateNumber).append("\n");
        sb.append("Tankgroesse: ").append(this.tankSize).append("\n");
        sb.append("Maximale Geschwindigkeit: ").append(this.maxSpeed).append("\n");
        return sb.toString();
    }

    public String asStatusString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Der Motor ist ");
        if (this.motorRunning)
            sb.append("an ");
        else
            sb.append("aus ");
        sb.append("und rollt aktuell mit ").append(this.speed).append(" kmh.\n");
        sb.append("Der Tank enhält akutell ").append(this.currentFuelVolume).append(" Liter.\n");
        return sb.toString();
    }
}
