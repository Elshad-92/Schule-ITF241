public class TenGreenBottles {

    public static void main(String[] args) {

        for (int zahl = 10; zahl > 0; zahl--) {

            String wort = zahlAlsWort(zahl);

            String strophe =
                    wort + " green bottles hanging on the wall\n" +
                            wort + " green bottles hanging on the wall\n" +
                            "And if one green bottle should accidentally fall,\n" +
                            "There'll be " + zahlAlsWort(zahl - 1) +
                            " green bottles hanging on the wall.\n";

            System.out.println(strophe);
        }
    }

    public static String zahlAlsWort(int zahl) {
        switch (zahl) {
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            case 10: return "Ten";
            default: return String.valueOf(zahl);
        }
    }
}
