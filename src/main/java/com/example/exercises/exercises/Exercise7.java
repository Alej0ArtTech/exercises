package com.example.exercises.exercises;

import java.util.Scanner;
public class Exercise7 implements Exercise {
    @Override
    public void runExercise() {

        /*
         * Write a Java program to convert a binary number to a hexadecimal number.
         * Input Data:
         * Input a Binary Number: 1101
         * Expected Output
         * 
         * HexaDecimal value: D
         * 
         */

    Scanner entrada2 = new Scanner(System.in);
    String numeroBinario = entrada2.nextLine();
    Integer decimal = Integer.parseInt(numeroBinario, 2);
    String conversion = Integer.toHexString(decimal).toUpperCase();


    System.out.println(conversion);

    }
}
