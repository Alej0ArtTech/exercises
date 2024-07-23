package com.example.exercises.exercises;

public class Exercise22 implements Exercise {
    @Override
    public void runExercise() {

        /*
         * 76. Write a Java program to test if the first and last element of two integer
         * arrays are the same. The array length must be greater than or equal to 2.
         * 
         * 
         * 
         * Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
         * array2 = 45, 20, 10, 20, 30, 50, 11
         * Sample Output:
         * 
         * false
         */

        Integer[] lista1 = {50, -20, 0, 30, 40, 60, 12};

        Integer[] lista2 = {50, 20, 10, 20, 30, 50, 12};


    String resultado = lista1[0] == lista2[0] ? "El primer numero es igual" : "El primero número no es el mismo";
    
    System.out.println(resultado);


    
    String resultado2 = lista1[lista1.length -1] == lista2[lista2.length -1] ? "El último numero es igual" : "El último número no es el mismo";

    System.out.println(resultado2);

        String carita = ":)";
    

    }
}
