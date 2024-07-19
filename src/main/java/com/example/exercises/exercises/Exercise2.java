package com.example.exercises.exercises;

import java.util.Scanner;

public class Exercise2 implements Exercise {
    @Override
    public void runExercise() {

        /*
         * Write a Java program to print the sum (addition), multiply, subtract, divide
         * and remainder of two numbers.
         * Test Data:
         * Input first number: 125
         * Input second number: 24
         * Expected Output :
         * 125 + 24 = 149
         * 125 - 24 = 101
         * 125 x 24 = 3000
         * 125 / 24 = 5
         * 125 mod 24 = 5
         */
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese el primer número");
    int primerNumero = entrada.nextInt();
    System.out.println("Ingrese el segundo número");
    int segundoNumero = entrada.nextInt();

    int suma = primerNumero + segundoNumero;
    int resta = primerNumero - segundoNumero;
    int multiplicacion = primerNumero * segundoNumero;
    double division = (double) primerNumero / segundoNumero;
    double modulo = primerNumero % segundoNumero;

    System.out.println(suma +"\n" + resta + "\n" + multiplicacion + "\n" + division + "\n" + modulo);
    entrada.close();

    }
}
