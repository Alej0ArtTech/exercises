package com.example.exercises.exercises;

import java.util.Scanner;

public class Exercise30 implements Exercise {
    @Override
    public void runExercise() {
        /*
         * Buscar en una lista:
         * Escribe un método en Java que reciba una lista de números enteros y un
         * número, y devuelva true si el número está en la lista y false en caso
         * contrario.
         * 
         * Ejemplo:
         * 
         * Entrada: lista [5, 3, 8, 1, 2], número 3
         * 
         * Salida: true
         * 
         * Entrada: lista [5, 3, 8, 1, 2], número 7
         * 
         * Salida: false
         */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = entrada.nextInt();

        Integer[] lista = { 5, 3, 8, 1, 2 };

        boolean estaContenido = false;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == numero) {
                estaContenido= true;
                break;
            }

        }

        System.out.println(estaContenido);

        /*
         * for (int i = 0; i < lista.length; i++) {
         * estaContenido = lista[i] == numero ? true : false;
         * 
         * }
         */

    }
}
