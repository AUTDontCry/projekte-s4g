package at.wifi.swdev.praxisteilwissensueberpruefungsaschabrodschneider;

import at.wifi.swdev.praxisteilwissensueberpruefungsaschabrodschneider.data.Dreieck;

public class FormenTest {

    public static void main(String[] args) {

        /**
         * Abfrage ob Dreieck schon einen Wert < gleich 0 bekommen hat.
         */
        Dreieck gleichseitigesDreieck = new Dreieck();

        if (gleichseitigesDreieck.seiteA <= 0) {
            System.out.println("SeiteA wurde noch nicht bezeichnet");
        } else {
            System.out.println("Die SeiteA = " + gleichseitigesDreieck.seiteA);
        }

        /**
         * Da nichts genaueres angegeben wurde Ausgabe der Werte mit 15
         * Dezimalstellen!
         */
        System.out.printf("Umfang:%.15f%n", gleichseitigesDreieck.berechneUmfang());
        System.out.printf("Fläche:%.15f%n", gleichseitigesDreieck.flaeche());
        System.out.printf("Höhe:%.15f%n", gleichseitigesDreieck.hoehe());
        System.out.printf("Innkreisradius:%.15f%n", gleichseitigesDreieck.innkreisradius());
        System.out.printf("Umkreisradius:%.15f%n", gleichseitigesDreieck.umkreisradius());
    }
}
