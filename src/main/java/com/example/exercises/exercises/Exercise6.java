package com.example.exercises.exercises;

public class Exercise6 implements Exercise {
    @Override
    public void runExercise() {
        /*
         * Write a Java program to convert a binary number to a decimal number.
         * Input Data:
         * Input a binary number: 100
         * Expected Output
         * 
         */

        String binario = "100";
        int conversion = Integer.parseInt(binario, 2);

        System.out.println(conversion);


        
        

    }
}
