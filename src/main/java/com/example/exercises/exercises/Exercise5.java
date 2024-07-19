package com.example.exercises.exercises;

public class Exercise5 implements Exercise {
    @Override
    public void runExercise() {

        /*
         * Write a Java program to compute the specified expressions and print the
         * output.
         * Test Data:
         * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
         * Expected Output
         * 2.138888888888889
         */
        
        

        double operacion1 = (25.5 * 3.5 - 3.5 * 3.5);
        double operacion2 = 40.5 - 4.5;
        double operacion3 = operacion1 / operacion2;

        System.out.println(operacion3);



    }
}
