import java.util.Locale;
import java.util.Scanner;

public class HelloWorld {

public static void main(String[] args) {
        System.out.println("Hello World!");
        double d = 1.3;

        Scanner tool = new Scanner(System.in);
        System.out.println("Eingabe: ");
        d = tool.nextDouble();
        System.out.println(d);
        System.out.println(Locale.getDefault());
    }
}
