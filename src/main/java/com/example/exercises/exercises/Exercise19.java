package com.example.exercises.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise19 implements Exercise {
    @Override
    public void runExercise() {

        /*
         * 72. Write a Java program to create a string taking the first three characters
         * from a given string. ****** If the string length is less than 3 use "#" as
         * substitute characters.
         * Test Data: Str1 = " "
         * Sample Output:
         * 
         * ###
         */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una palabra");
        String text = entrada.nextLine();

        String[] lista = text.split("");
        ArrayList<String> listaT = new ArrayList<>(Arrays.asList(lista));
        


        if (listaT.size() < 3) {

            listaT.set(0, "#");
            listaT.set(1, "#");
            listaT.add(2,"");
            listaT.set(2, "#");
        }


        for (String n : listaT) {
            System.out.println(n);
        }
        
    }
}
