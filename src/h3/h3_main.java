package h3;

public class h3_main {
    public static void main(String[] args) {

        int max = 610; //   Sitzplätze von Hörsaal B 
        int fix = 500;
        int wartend = 200;

        boolean istVoll = false; 

        //  zuerst ermitteln wird ob es überhaupt noch frei Plätze gibt 

        if (max <= fix) { 
            istVoll = true;
            System.out.println("Es gibt keine freien Plätze mehr");
        } else istVoll = false;

        //  gibt es freie Plätze dann sagen wir das dem Benutzer und sagen ihm wie viele es gibt 
        
        int freieplätze = max - fix;
        if (freieplätze >0) {
            System.out.println("Es gibt " + freieplätze + " freie Plätze");
        }

    }
}