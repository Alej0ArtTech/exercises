package com.example.exercises.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise14 implements Exercise {
    @Override
    public void runExercise() {

        /*
         * 57. Write a Java program to accept an integer and count the factors of the
         * number.
         * Sample Output:
         * 
         * Input an integer: 25
         * 3
         */
        // TODO: Implement the exercise logic here
    

    Scanner entrada = new Scanner(System.in);
    System.out.println("Escriba el numero");
    int numero = entrada.nextInt();

    ArrayList<Integer> lista = new ArrayList<>();

    for (int i = 1; i <= numero; i++){
        if (numero % i == 0) {
            lista.add(i);
        }
    }
    System.out.println("*********************\n" + "El número que buscas es:");
    System.out.println(lista.size());
    System.out.println("\n*********************\n");

}

}
