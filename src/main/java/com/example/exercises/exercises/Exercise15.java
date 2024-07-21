package com.example.exercises.exercises;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise15 implements Exercise {
    @Override
    public void runExercise() {
/* 
        58. Write a Java program to capitalize the first letter of each word in a sentence.
Sample Output:

Input a Sentence: the quick brown fox jumps over the lazy dog.         
The Quick Brown Fox Jumps Over The Lazy Dog. */
        // TODO: Implement the exercise logic here


        

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba una oración:");
        String oracion = entrada.nextLine();

        String[] palabras = oracion.split(" ");
        ArrayList<String> lista = new ArrayList<>(Arrays.asList(palabras));

        for (int i = 0; i < lista.size(); i++) {

            String palabra_capturada = lista.get(i);
            palabra_capturada = palabra_capturada.substring(0, 1).toUpperCase() + palabra_capturada.substring(1).toLowerCase();
            lista.set(i, palabra_capturada);
        }

        for (String palabra_capturada : lista) {
            System.out.print(palabra_capturada + " ");

        }

        


        





        
    }
}
