import java.util.Scanner;

public class SternQuadrat {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int eingabe;

        System.out.println("Geben Sie Seitenlange eines Quadrats ein: ");
        eingabe = s.nextInt();

        for(int zeile = 1; zeile <= eingabe; zeile++){
            for(int spalte = 1; spalte <= eingabe; spalte++){
                if (zeile == 1 || zeile == eingabe || spalte == 1 || spalte == eingabe) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        s.close();
    }
}

