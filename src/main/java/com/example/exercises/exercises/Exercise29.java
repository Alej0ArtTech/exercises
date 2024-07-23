package com.example.exercises.exercises;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise29 implements Exercise {
    @Override
    public void runExercise() {
        /*
         * Ordenar una lista:
         * Escribe un método en Java que reciba una lista de números enteros y los
         * ordene en orden ascendente.
         * 
         * Ejemplo:
         * 
         * Entrada: [5, 3, 8, 1, 2]
         * Salida: [1, 2, 3, 5, 8]
         */

        //Objetivo: ordenar la lista
        // objetivos particulares: comparar 1 y 2, luego 3 y 4, primera comparacion con 5, y luego comparar la comparacion 2 (3 y 4) con la comparacion 3 (1 2 y 5 )

        Integer[] lista = {5, 3, 8, 1, 2};


        ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(lista));
        Collections.sort(lista2);

        System.out.println(lista2);
    }
}
