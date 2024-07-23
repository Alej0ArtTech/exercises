package com.example.exercises.exercises;

public class Exercise24 implements Exercise {
    @Override
    public void runExercise() {

        /*
         * 78
         * Write a Java program to test that a given array of integers of length 2
         * contains a 4 or a 7.
         * Sample Output:
         * 
         * Original Array: [5, 7]
         * true
         */

        Integer[] lista = { 5, 7 };

        boolean resultado = lista[0] == 4 ? true : false;
        boolean resultado1 = lista[0] == 7 ? true : false;
        boolean resultado2 = lista[1] == 4 ? true : false;
        boolean resultado3 = lista[1] == 7 ? true : false;

        boolean resultadofinal = resultado || resultado1 || resultado2 || resultado3 ? true : false;

        System.out.println(resultadofinal);
    }

}
