package com.example.exercises.exercises;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise31 implements Exercise {
    private static final int ArrayList = 0;

    @Override
    public void runExercise() {

        /*
         * Fibonacci:
         * Escribe un método en Java que reciba un número n y devuelva el n-ésimo número
         * de Fibonacci. La secuencia de Fibonacci es una serie de números donde cada
         * número es la suma de los dos anteriores, empezando con 0 y 1.
         * 
         * Ejemplo:
         * 
         * Entrada: 5
         * 
         * Salida: 5 (la secuencia es 0, 1, 1, 2, 3, 5, ...)
         * 
         * Entrada: 7
         * 
         * Salida: 13 (la secuencia es 0, 1, 1, 2, 3, 5, 8, 13, ...)
         */

        // Objetivo_ Realizar la secuencia a el numero ingresado

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la longitud del numero fibonacci");
        int numero = entrada.nextInt();
        for (Integer n : lista(numero)) {
            System.out.println(n + " ");

        }
    }

    public static ArrayList<Integer> lista(int numero) {
        int nbase1 = 0;
        int nbase2 = 1;
        int n = 0;
        ArrayList<Integer> listafinal = new ArrayList<>();
        listafinal.add(nbase1);
        listafinal.add(nbase2);
        for (int i = 2; i < numero; i++) {
            if (i > 2) {
                nbase1 = nbase2;
                nbase2 = n;
            }

            n = nbase1 + nbase2;
            listafinal.add(n);
            // 3 0 1 = 1
            // 4_ 1 + 1 = 2
            // 5_ 1 + 3 = 3

            //
            // agregar los numeros decalrados al listaa listafinal y crear la logica
        }

        return listafinal;
    }

}
