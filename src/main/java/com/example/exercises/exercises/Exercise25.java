package com.example.exercises.exercises;

import java.util.ArrayList;

public class Exercise25 implements Exercise {
    @Override
    public void runExercise() {

        /*79
         * Write a Java program to rotate an array (length 3) of integers in the left
         * direction.
         * Sample Output:
         * 
         * Original Array: [20, 30, 40]
         * Rotated Array: [30, 40, 20]
         */
        // TODO: Implement the exercise logic here

        Integer[] lista1 = {20, 30, 40};

        // pasar 3pos to 1pos, 2 to 3, 1 to 2

        // replace

        ArrayList<Integer> lista2 = new ArrayList<>();
        
        lista2.add(lista1[1]);
        lista2.add(lista1[2]);
        lista2.add(lista1[0]);
        



        for (Integer n : lista2) {
            System.out.print(n + " ");
        }










    }
}
