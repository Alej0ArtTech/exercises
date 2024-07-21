package com.example.exercises.exercises;
import java.util.Scanner;

public class Exercise8 implements Exercise {
    @Override
    public void runExercise() {

        System.out.println("Estás trabajando en la siguiente version de java:" + System.getProperty("java.version"));

        /*
         * Write a Java program that accepts three integers from the user. It returns
         * true 
         * 
         * 
         * if the second number is higher than the first number 
         * 
         * and the third number is larger than the second number. 
         * 
         * 
         * 
         * If "abc" is true, the second number
         * does not need to be larger than the first number.
         * Sample Output:
         * 
         * Input the first number : 5
         * Input the second number: 10
         * Input the third number : 15
         * The result is: true
         * 
         */

        Scanner entrada = new Scanner(System.in);
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int numero3 = entrada.nextInt();
        boolean verdadero = false;


        if ( numero1< numero2 && numero3 > numero2){
            verdadero = true;
            System.out.println(verdadero);
        }



    }
}
