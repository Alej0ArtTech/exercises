package com.example.exercises.exercises;

import java.util.Scanner;

public class Exercise3 implements Exercise {
    @Override
    public void runExercise() {
        /*
         * Write a Java program that takes a number as input and prints its
         * multiplication table up to 10.
         * Test Data:
         * Input a number: 8
         * Expected Output :
         * 8 x 1 = 8
         * 8 x 2 = 16
         * 8 x 3 = 24
         * ...
         * 8 x 10 = 80
         */
        System.out.println("Por favor, escriba un valor númerico:");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();


        for (int i = 0; i <= 10; i++) {
            int operacion = numero * i;    
            System.out.println("\n" + numero + "*" + i + "=" + operacion);
        }
    }
}
