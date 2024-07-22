package com.example.exercises.exercises;

public class Exercise21 implements Exercise {
    @Override
    public void runExercise() {

        /*
         * 75. Write a Java program to test if the first and last elements of an array
         * of integers are the same. The array length must be broader than or equal to
         * 2.
         * Test Data: array = 50, -20, 0, 30, 40, 60, 10
         * Sample Output:
         * 
         * false
         */
        


        Integer[] numeros = {50, -20, 0, 30, 40, 60, 50};


        boolean resultado = numeros[0] == numeros[numeros.length - 1] ? true: false;

        System.out.println(resultado);
/* 
        `;-.          ___,
  `.`\_...._/`.-"`
    \        /      ,
    /()   () \    .' `-._
   |)  .    ()\  /   _.'
   \  -'-     ,; '. <
    ;.__     ,;|   > \
   / ,    / ,  |.-'.-'
  (_/    (_/ ,;|.<`
    \    ,     ;-`
     >   \    /
    (_,-'`> .'
jgs      (_,' */

    }
}
