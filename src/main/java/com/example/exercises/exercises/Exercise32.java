package com.example.exercises.exercises;

import java.util.Scanner;

public class Exercise32 implements Exercise {
    @Override
    public void runExercise() {

        /*
         * 73. Write a Java program to create a string taking the first and last
         * characters from two given strings. If the length of each string is 0 use "#"
         * for missing characters.
         * Test Data: str1 = "Python"
         * str2 = " "
         * Sample Output:
         * 
         * P#
         * Click me to see t
         */
        // TODO: Implement the exercise logic here

        // Objetivo: tomar el ultimo del segundo y primero del primero. Obj2 concatecar
        // char. Obj. Si cadenara es " " > # || "" > //#
        // Metodología: spli, arreglo, valicaciones

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe la primer palabra");
        String palabra1 = entrada.nextLine();
        System.out.println("Escribe la segunda palabra");
        String palabra2 = entrada.nextLine();

        String[] lista1 = palabra1.split("");
        String[] lista2 = palabra2.split("");

        String val1 = lista1[0].isEmpty() || lista1[0].equals(" ") ? "#" : lista1[0];
        String val2 = lista2[0].isEmpty() || lista2[0].equals(" ") ? "#" : lista2[lista2.length - 1];

        System.out.println(val1 + val2);

    }
}
