package h3;

public class h3_main {
    public static void main(String[] args) {

        int max = 610; //   Sitzplätze von Hörsaal B 
        int fix = 500;
        int wartend = 200;

        boolean istVoll = false; 
        
        if (max <= fix) { 
            istVoll = true;
        }

        int frei = max - fix;
        System.out.println(frei);
    }
}
// Test commit weil alles aufgeschrieben wird als commit also auf h1 2 unr 3 anstatt nur auf h3 
