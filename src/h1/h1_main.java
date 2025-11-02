package h1;

public class h1_main {
    public static void main(String[] args) {
        double guthaben = -100;
        double monEingang = 1000;
        int rating = 0 ;

        boolean warnhinweis;
        boolean negativ = false;

        //  will man schauen ob eine Variable genau einem Wert entspricht, also 0 benutzt man == anstatt =, bei boolean variblen

        if (guthaben < 0) {             //  guthaben unter 0 würde quasi für noch offene Schulden stehen
            negativ = true;
        } else if (guthaben > 0) {      //  guthaben über 0 würde bedeuten, dass es ein Eigenkapital gibt (Rücklagen)
            rating = rating + 3;
        } else if (guthaben == 0) {     //  Es gibt zwar keien Rücklagen, dafür aber auch keine Schulden
            rating = rating +2;
        } 
        
        // Da wir den absoluten Betrag wissen wollen, also ohne Vorzeichen etc. benutzt man Math.abs um diese wegzukürzen 

        else if (guthaben < 0) {
            if (Math.abs(monEingang) >= Math.abs(guthaben))
                rating = rating + 1;
        }   else {
            rating = rating -1;
        }
        
        if (guthaben < 0 && Math.abs(monEingang) < Math.abs(guthaben) && rating < 0) {
            warnhinweis = true;
        } else {
            warnhinweis = false;
        }

        System.out.println("Guthaben: " + guthaben);
        System.out.println("Monatlicher Eingang: " + monEingang);
        System.out.println("Rating: " + rating);
        System.out.println("Negativ: " + negativ);
        System.out.println("Warnhinweis: " + warnhinweis);

    }
}
