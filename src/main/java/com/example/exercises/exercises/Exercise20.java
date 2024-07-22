package com.example.exercises.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise20 implements Exercise {
    @Override
    public void runExercise() {

        /*
         * 74. Write a Java program to test if 10 appears as the first or last element
         * of an array of integers. The array length must be broader than or equal to 2.
         * Sample Output:
         * Test Data: array = 10, -20, 0, 30, 40, 60, 10
         * 
         * true
         */ 

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa una lista de numeros separados por espacios\nEjemplo: '15 47 85 96 14 25 36'");

        String numeros = entrada.nextLine();

        String[] lista = numeros.split(" ");
        

        ArrayList<Integer> listaNumeros = new ArrayList<>();

        for (String n : lista){
            listaNumeros.add(Integer.parseInt(n));
        }

        String resultado = listaNumeros.get(0) == 10 || listaNumeros.get(listaNumeros.size()-1) == 10 ? "El primer o ultimo número es 10 :D" : "Ni el primer o ultimo número es el numero 10 :D";

        System.out.println(resultado);
    }
}
