// BMI-Klasse: nur BMI berechnen + Kategorie ausgeben
public class BMI {

    public static void calculateBMI(double gewicht, double groesse) {
        double bmi = gewicht / (groesse * groesse);

        if(bmi >= 40) {
            System.out.println("BMI = " + bmi + " besteht extremes Übergewicht. Kalorienvorgabe: 700\n");
        }
        else if(bmi >= 30 && bmi < 40){
            System.out.println("BMI = " + bmi + " besteht starkes Übergewicht. Kalorienvorgabe: 1200\n");
        }
        else if(bmi >= 25 && bmi < 30){
            System.out.println("BMI = " + bmi + " besteht leichtes Übergewicht. Kalorienvorgabe: 1800\n");
        }
        else if(bmi >= 18.5 && bmi < 25){
            System.out.println("BMI = " + bmi + " besteht Normalgewicht. Kalorienvorgabe: 2000\n");
        }
        else if(bmi < 18.5){
            System.out.println("BMI = " + bmi + " herrscht Untergewicht. Kalorienvorgabe: 3000\n");
        }
    }
}

