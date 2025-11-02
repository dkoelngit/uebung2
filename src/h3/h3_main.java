package h3;

public class h3_main {
    public static void main(String[] args) {

        int max = 610; //   Sitzplätze von Hörsaal B 
        int fix = 700;
        int wartend = 200;

        boolean istVoll = false; 
        
        //  als erstes nennen wir dem Nutzer die Kennzahlen
        
        System.out.println("Es gibt " + max + " Plätze.");
        System.out.println("Davon sind " + fix + " als Fixplatz vergeben");
        System.out.println("Es stehen " + wartend + " Leute auf der Warteliste");

        //  dann ermitteln wird ob es überhaupt noch frei Plätze gibt 

        if (max <= fix) { 
            istVoll = true;
            System.out.println("Es gibt keine freien Plätze mehr");
        } else istVoll = false;

        //  gibt es freie Plätze dann sagen wir das dem Benutzer und sagen ihm wie viele es gibt 
        
        int freieplätze = max - fix;
        if (freieplätze >0) {
            System.out.println("Es gibt " + freieplätze + " freie Plätze");
        }

        // nun wissen wir wie viele Plätze noch frei sind und weisen die Leute von der Warteliste diesen freien Plätzen zu
        // bis entweder max erreicht ist oder die Warteliste leer ist

        if (freieplätze > 0 && wartend > 0) {
            System.out.println("Da es noch frei Plätze gibt werden die Leute von der Warteliste nachgerückt");
            int zuweisen = Math.min(freieplätze, wartend);  //  hiermit ermitteln wir wie viele Leute noch von der Warteliste in den Saal passen
            fix += zuweisen;
            wartend -= zuweisen;
        }
        
        istVoll = (fix == max); {
            System.out.println("Der Saal ist nun voll");
        }

        System.out.println("Es stehen " + wartend + " Leute auf der Warteliste");
    }
}