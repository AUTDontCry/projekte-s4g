package at.wifi.swdev.praxisteilwissensueberpruefungsaschabrodschneider.data;

public class Dreieck {

    
    
//      Dreieck gleichseitigesDreieck = new Dreieck();
//            
//            if (gleichseitigesDreieck.seiteA <= 0)
//                System.out.println("SeiteA wurde noch nicht bezeichnet");
//            else 
//                System.out.println("Die SeiteA = " + gleichseitigesDreieck.seiteA);
//    
    
    
    public double seiteA = 10;


    public double flaeche() {
        return Math.sqrt(3) / 4 * (seiteA * seiteA);
    }

    public double hoehe() {
        return Math.sqrt(3) / 2 * seiteA;
    }

    public double umkreisradius() {
        return seiteA / Math.sqrt(3);
    }

    public double innkreisradius() {
        return seiteA / (2 * Math.sqrt(3));
    }

    public double berechneUmfang() {
        return seiteA * 3;
    }

}
