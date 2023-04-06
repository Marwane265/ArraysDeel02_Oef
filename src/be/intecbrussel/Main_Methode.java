package be.intecbrussel;

import java.util.Arrays;

public class Main_Methode {
    public static void main(String[] args) {
        int[] array = {5, 7, 77, 82, 2};

        //opdracht 4
        // Maak een klas aan Statistics die de volgende methodes bevat.
        // Deze methodes gaan het gemiddelde,maximum en minimum berekenen
        // (maximum = het hoogste cijfer, minimum is het laagste cijfer).
        // publicstaticintaverage(int... values)
        // publicstaticintmaximum(int... values)
        // publicstaticintminimum(int... values)
        // Maak een klas aan met de main methode en test de methodes uit.




        System.out.println(Statistics.average);
        System.out.println(Statistics.maximum);
        System.out.println(Statistics.minimum(array));

    }
}
