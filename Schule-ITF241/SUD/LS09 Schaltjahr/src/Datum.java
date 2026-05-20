public class Datum {

    private int tag;
    private int monat;
    private int jahr;

    public Datum(int tag, int monat, int jahr){
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    public void anzeigeFormat(){
        System.out.println(tag + ". " + monatToString() + " " + jahr);
    }

    public int alsTage(){

        int tage = 0;

        // Alle vergangenen Jahre addieren
        for(int j = 1; j < jahr; j++) {

            if(istSchaltjahr(j)) {
                tage += 366;
            } else {
                tage += 365;
            }
        }

        // Alle vergangenen Monate addieren
        for(int m = 1; m < monat; m++) {

            tage += tageImMonat(m, jahr);
        }

        // Aktuelle Tage addieren
        tage += tag;

        return tage;
    }

    public boolean liegtImSchaltjahr() {

        if (jahr % 400 == 0) {
            return true;
        }

        if (jahr % 100 == 0) {
            return false;
        }

        return jahr % 4 == 0;
    }

    private String monatToString(){

        switch(monat) {

            case 1:
                return "Januar";

            case 2:
                return "Februar";

            case 3:
                return "März";

            case 4:
                return "April";

            case 5:
                return "Mai";

            case 6:
                return "Juni";

            case 7:
                return "Juli";

            case 8:
                return "August";

            case 9:
                return "September";

            case 10:
                return "Oktober";

            case 11:
                return "November";

            case 12:
                return "Dezember";

            default:
                return "Ungültiger Monat";
        }
    }

    private int monatsTage(){

        switch(monat) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            case 2:
                if(liegtImSchaltjahr()) {
                    return 29;
                }
                return 28;

            default:
                return 0;
        }
    }

    // beliebiges Jahr
    private boolean istSchaltjahr(int j) {

        if (j % 400 == 0) {
            return true;
        }

        if (j % 100 == 0) {
            return false;
        }

        return j % 4 == 0;
    }

    // beliebigen Monat
    private int tageImMonat(int m, int j) {

        switch(m) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            case 2:
                if(istSchaltjahr(j)) {
                    return 29;
                }
                return 28;

            default:
                return 0;
        }
    }
}