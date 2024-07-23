package com.example.exercises.exercises;

public class Exercise23 implements Exercise {
    @Override
    public void runExercise() {

        /*
         * 77. Write a Java program to create an array of length 2 from two integer
         * arrays with three elements. The newly created array will contain the first
         * and last elements from the two arrays.
         * Test Data: array1 = 50, -20, 0
         * array2 = 5, -50, 10
         * Sample Output:
         * 
         * Array1: [50, -20, 0]
         * Array2: [5, -50, 10]
         * New Array: [50, 10]
         */


        Integer[] lista1 = {50, -20, 0};
        Integer[] lista2 = {5, -50, 10};


        Integer[] lista3 = {lista1[0], lista2[lista2.length - 1]};


        for (Integer n : lista3){


            System.out.print(n + " ");
        }
        



    

    }
}
