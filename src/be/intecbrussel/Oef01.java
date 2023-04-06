package be.intecbrussel;

import java.util.Arrays;

public class Oef01 {
    public static void main(String[] args) {


//opdracht 1


// Maak een array aan met boolean waarden en druk deze af met een for-each loop.


        int[] veelvoud = new int[20];
        boolean[] boolArray = new boolean[20];


        for (int index = 1; index < veelvoud.length; index++) {
            veelvoud[index] = index * 7;

        }

        System.out.print(Arrays.toString(veelvoud));
        System.out.println();

        for (int counter = veelvoud.length - 1; counter >= 0; counter--) {
            System.out.print(veelvoud[counter] + " ");


        }
        System.out.println();
        for (int index = 0; index < boolArray.length; index++) {
            System.out.println(boolArray[index] + " ");
        }
        System.out.println();
    }
}
