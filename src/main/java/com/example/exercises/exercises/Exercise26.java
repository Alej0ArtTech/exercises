package com.example.exercises.exercises;

public class Exercise26 implements Exercise {
    @Override
    public void runExercise() {

        /*
         * 80. Write a Java program to get the largest value between the first and last
         * elements of an array (length 3) of integers.
         * Sample Output:
         * 
         * Original Array: [20, 30, 40]
         * Larger value between first and last element: 40
         */

        Integer[] lista1 = { 20, 60, 40 };

        // Objetivo: encontrar el valor más alto de un integer
        // Solución: comparar los valores entre sí, 3 casos de comparaciób. Metodología.
        // Hacer dos comparaciones > comparar las dos variables resultares.

        Integer variable1 = lista1[0] > lista1[1] ? lista1[0] : lista1[1];
        Integer variable2 = lista1[1] > lista1[2] ? lista1[1] : lista1[2];
        Integer resultado = variable1 > variable2 ? variable1 : variable2;

        System.out.println(resultado);
    }
}
