package com.example.exercises.exercises;
import java.util.ArrayList;
public class Exercise33 implements Exercise {
    @Override
    public void runExercise() {

        /*
         * 83. Write a Java program to multiply the corresponding elements of two
         * integer arrays.
         * Sample Output:
         * 
         * Array1: [1, 3, -5, 4]
         * 
         * Array2: [1, 4, -5, -2]
         * 
         * Result: 1 12 25 -8
         */
    
    Integer[] lista1 = {1, 3, -5, 4};
    Integer[] lista2 = {1, 4, -5, -2};

    ArrayList<Integer> lista3 = new ArrayList<>();

    for (int i = 0; i < lista1.length; i++ ){
            lista3.add(lista1[i] * lista2[i]);
    }
    for (Integer n : lista3) {
        System.out.print(n + " ");
    }

    }
}
