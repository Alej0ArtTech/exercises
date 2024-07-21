package com.example.exercises.exercises;

import java.util.Scanner;
public class Exercise9 implements Exercise {
    @Override
    public void runExercise() {
        /*
         * Write a Java program to convert seconds to hours, minutes and seconds.
         * Sample Output:
         * 
         * Input seconds: 86399
         * 23:59:59
         * 
         * 
         */

    Scanner entrada = new Scanner(System.in);
    System.out.println("Bienvenido al conversos de segundos\nEscibre los segundos a convertir:\n");
    int segundos = entrada.nextInt();

    int segundoshora = 60 * 60;
    int horas = segundos / segundoshora;
    segundos = segundos - (horas*segundoshora);

    int segundosminuto = 60;
    int minutos = segundos / segundosminuto;
    segundos = segundos - (minutos*segundosminuto);

    System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}
