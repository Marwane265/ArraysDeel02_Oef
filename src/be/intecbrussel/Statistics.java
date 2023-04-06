package be.intecbrussel;

import java.util.Arrays;

public class Statistics {


    //opdracht 4
    // Maak een klas aan Statistics die de volgende methodes bevat.
    // Deze methodes gaan het gemiddelde,maximum en minimum berekenen
    // (maximum = het hoogste cijfer, minimum is het laagste cijfer).
    // publicstaticintaverage(int... values)
    // publicstaticintmaximum(int... values)
    // publicstaticintminimum(int... values)
    // Maak een klas aan met de main methode en test de methodes uit.


    public static int average = 0;
    public static int maximum;
    public static int minimum;
    int sum = 0;


    int[] array = {5, 7, 77, 82, 2};


    //constructor


    public Statistics(int average, int maximum, int minimum) {
    }



//    //getters and setters
//    public static int getAverage() {
//        return average;
//    }
//
//    public static void setAverage(int average) {
//        Statistics.average = average;
//    }
//
//
//    public static int getMaximum() {
//        return maximum;
//    }
//
//    public static void setMaximum(int maximum) {
//        Statistics.maximum = maximum;
//    }
//
//
//    public static int getMinimum() {
//        return minimum;
//    }
//
//    public static void setMinimum(int minimum) {
//        Statistics.minimum = minimum;
//    }
//
//    public static int minimum(int[] array) {
//
//
//    }


    //Eigen methode

    public int average(int[] array) {
        for (int index = 0; index < array.length; index++) {


            sum += array[index];
            average = sum / array.length;


        }

        return average + sum;

    }

    public static int getMin(int[] value) {
        int minValue = value[0];
        for (int index = 1; index < value.length; index++) {
            if (value[index] < minValue) {
                minValue = value[index];
            }
        }
        return minValue;
    }

    public static int getMax(int[] values) {
        int maxValue = values[0];
        for (int index = 1; index < values.length; index++) {
            if (values[index] > maxValue) {
                maxValue = values[index];
            }
        }
        return maxValue;
    }


    //override


    @Override
    public String toString() {
        return "Statistics{" +
                "a=" + Arrays.toString(array) +
                '}';
    }
}
