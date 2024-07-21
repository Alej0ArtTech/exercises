package com.example.exercises.exercises;
import java.util.Scanner;

public class Exercise10 implements Exercise {
    @Override
    public void runExercise() {
        /*
         * . Write a Java program to find the number of values in a given range
         * divisible by a given value.
         * For example x = 5, y=20 and p =3, find the number of integers within the
         * range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
         * Sample Output:
         * 
         * Escribe un programa en Java para encontrar la cantidad de valores en un rango dado que sean divisibles por un valor dado.
         * 
         * 
         */

    Scanner entrada = new Scanner(System.in);
    System.out.println("Escribe el primera número");
    int numero1 = entrada.nextInt();
    System.out.println("Escribe el segundo número");
    int numero2 = entrada.nextInt();
    System.out.println("Escribe el numero que puede ser dividido");
    int p = entrada.nextInt();
    


    if (numero1 > numero2) {
        int partida = numero2;
        while (partida < numero1) {
            partida++;
            if (partida % p == 0) {
                System.out.println(partida);
            }
        }
    
    } else if (numero2 > numero1) {
        int partida = numero1;
        while (partida < numero2) {
            partida++;
            if (partida % p == 0) {
                System.out.println(partida);
            }
        }

    }

    }
        

    
    }

