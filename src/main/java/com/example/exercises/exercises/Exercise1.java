package com.example.exercises.exercises;

import java.util.Scanner;

public class Exercise1 implements Exercise {
    @Override
    public void runExercise() {

        /*
         * Write a Java program that takes two numbers as input and displays the product
         * of two numbers.
         * Test Data:
         * Input first number: 25
         * Input second number: 5
         * Expected Output :
         * 25 x 5 = 125
         */

        System.out.println("Running Exercise1... pribano probando");
        // Código del ejercicio 1
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe el primer numero:");
        int primerNumero = entrada.nextInt();
        System.out.println("Escribe el segundo numero:");
        int segundoNumero = entrada.nextInt();

        int resultado = primerNumero * segundoNumero;
        System.out.println("La respuesta es: " +  resultado);

        entrada.close();

    



    }
}