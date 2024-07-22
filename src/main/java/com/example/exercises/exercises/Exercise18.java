package com.example.exercises.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise18 implements Exercise {
    @Override
    public void runExercise() {
        /*
         * 71. Write a Java program to create the concatenation of the two strings
         * except removing the first character of each string. The length of the strings
         * must be 1 and above.
         * Test Data: Str1 = Python
         * Str2 = Tutorial
         * Sample Output:
         * 
         * ythonutorial
         */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba la primera palabra");
        String palabra1 = entrada.nextLine();
        System.out.println("Escriba la segunda palabra");
        String palabra2 = entrada.nextLine();

        String[] lista1 = palabra1.split("");
        ArrayList<String> listafinal1 = new ArrayList<>(Arrays.asList(lista1));
        String[] lista2 = palabra2.split("");
        ArrayList<String> listafinal2 = new ArrayList<>(Arrays.asList(lista2));

        listafinal1.remove(0);
        listafinal2.remove(0);

        for (String palabra : listafinal1) {
            System.out.print(palabra);
        }

        for (String palabra : listafinal2) {
            System.out.print(palabra);
        }

    }
}
