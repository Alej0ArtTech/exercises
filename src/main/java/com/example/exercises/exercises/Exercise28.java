package com.example.exercises.exercises;

import java.util.Scanner;

public class Exercise28 implements Exercise {
    @Override
    public void runExercise() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe el número a avaluar\n ¿Es numero primo?");
        int numero = entrada.nextInt();
        boolean resultado = esPrimo(numero);

        System.out.println(resultado);
        entrada.close();

    }

    public static boolean esPrimo(int numero) {

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;

    }
}

        /*
         * Números primos:
         * Escribe un método en Java que determine si un número es primo. Un número
         * primo es aquel que solo es divisible por 1 y por sí mismo.
         * 
         * Ejemplo:
         * 
         * Entrada: 7
         * 
         * Salida: true (ya que 7 es primo)
         * 
         * Entrada: 10
         * 
         * Salida: false (ya que 10 no es primo)
         */
