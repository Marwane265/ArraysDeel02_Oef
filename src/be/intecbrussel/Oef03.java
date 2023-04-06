package be.intecbrussel;

import java.util.Arrays;

public class Oef03 {
    public static void main(String[] args) {


        //Opdracht 3
        // Je ziet hieronder 2 arrays en deze moet je met elkaar optellen en vermenigvuldigen.
        // Maak een print-out van de optelling in een matrix en een print out van de vermenigvuldigen.
        // int a[][] = {{1, 3, 4}, {3, 4, 5}};
        // int b[][] = {{1, 3, 4}, {3, 4, 5}};
        // output:
        // 2 6 8
        // 6 8 10


        int a[][] = {{1, 3, 4}, {3, 4, 5}};
        int b[][] = {{1, 3, 4}, {3, 4, 5}};
        int c[][] = new int[5][5];


        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {

                c[row][col] = a[row][col] + b[row][col];

                System.out.println(Arrays.deepToString(c));

            }

        }


    }
}
