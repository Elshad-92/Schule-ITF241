
public class Main {

    public static void main(String[] args) {
        Fahrzeug vwKaefer = new Fahrzeug();

        vwKaefer.setRegistrationPlateNumber("AC RN 10");
        vwKaefer.setMaxSpeed(200);
        vwKaefer.setTankSize(40);
        vwKaefer.setCurrentFuelVolume(5);

        System.out.println(vwKaefer.masterDataToString()+vwKaefer.asStatusString());
        vwKaefer.accelerate(40);
        System.out.println(vwKaefer.asStatusString());
        vwKaefer.drive(10, 70);
        System.out.println(vwKaefer.asStatusString());
        vwKaefer.drive(300, 70);
        System.out.println(vwKaefer.asStatusString());
        vwKaefer.refuel(30);
        System.out.println(vwKaefer.asStatusString());
        vwKaefer.drive(200, 70);
        System.out.println(vwKaefer.asStatusString());
        vwKaefer.decelerate(17);
        System.out.println(vwKaefer.asStatusString());

    }

}
