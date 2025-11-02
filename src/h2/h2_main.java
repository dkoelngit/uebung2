package h2;

public class h2_main {
    public static void main(String[] args) {
        int jahr = 2000;
        boolean schalt = false; 
        


        boolean durch4teilbar = false;
            if (jahr % 4 == 0) {
                durch4teilbar = true;
            } else durch4teilbar = false;

        boolean durch100teilbar = false;
            if (jahr % 100 == 0) {
                durch100teilbar = true;
            } else durch100teilbar = false; 
        
        boolean durch400teilbar = false;
            if (jahr % 400 == 0) {
                durch400teilbar = true;
            } else durch400teilbar = false;



        if (!durch4teilbar) {
            
            schalt = false;
            System.out.println("Bei dem Jahr " + jahr + " handelt es sich nicht um ein Schaltjahr");
            //  Ist das Jahr nicht durch 4 teilbar ist es kein Schaltjahr
            
        } else if (durch4teilbar && !durch100teilbar) {

            schalt = true;
            System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr");
            // Es handelt sich um ein Schaltjahr, weil das Jahr durch 4 teilbar ist und nicht durch 100

        } else if (durch4teilbar && durch100teilbar && durch400teilbar) {
            
            schalt = true;
            System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr");  
            //  Es handelt sich zwar um ein Jahr was durch 4 teilbar is, aber auch durch 100 ,das
            //  ist aber egal, weil es die Ausnahme mit durch 400 gibt und es somit doch wieder ein Schaltjahr ist
            
        }

        System.out.println(durch4teilbar);
        System.out.println(durch100teilbar);
        System.out.println(durch400teilbar);

        System.out.println(schalt);
    }
}
