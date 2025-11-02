package h3;

public class h3_main {
    public static void main(String[] args) {

        int max = 610; //   Sitzplätze von Hörsaal B 
        int fix = 200;
        int wartend = 200;

        boolean istVoll = false; 
        
        //  als erstes nennen wir dem Nutzer die Kennzahlen
        
        System.out.println("Es gibt " + max + " Plätze.");
        System.out.println("Davon sind " + fix + " als Fixplatz vergeben");
        System.out.println("Es stehen " + wartend + " Leute auf der Warteliste");

        //  wurden zu viele Fixplätze zugewisen dann gehen die ueberschuessigen auf die Warteliste

        if (fix > max) {
            int ueberschuss = fix - max;
            wartend += ueberschuss;
            fix = max;
            System.out.println("Da zu viele Leute einen Fixplatz bekommen habe werden " + ueberschuss + " Leute auf die Warteliste hinzugefügt. ");
        }

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
        
        if (fix == max); {
            istVoll = true;
            System.out.println("Der Saal ist nun voll");
        }

        System.out.println("Es stehen noch " + wartend + " Leute auf der Warteliste");
    }
}

//  PROBLEM: Wenn man ausversehen mehr fixplätze vergeben hat also es Plätze im Saal gibt ergibt die Ausgabe nicht so viel sind mit 
//  "Es gibt 610 Plätze" und "Davon sind 700... vergeben"
//  Das Problem wurde in line 25-29 gefixt