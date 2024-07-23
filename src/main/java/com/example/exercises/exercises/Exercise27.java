package com.example.exercises.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise27 implements Exercise {
    @Override
    public void runExercise() {/* Invertir una cadena:
        Escribe un método en Java que reciba una cadena como entrada y devuelva la cadena invertida.
        
        Ejemplo:
        
        Entrada: "hola"
        Salida: "aloh" */


        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una palabra");
        String texto = entrada.nextLine();

        String[] letras = texto.split("");
        System.out.println(letras);

        ArrayList<String> list = new ArrayList<>(Arrays.asList(letras));


        Collections.reverse(list);

        System.out.println(list.toString());

        for (String n : list){
            System.out.print(n);
        }

    }
}
