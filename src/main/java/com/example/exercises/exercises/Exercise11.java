package com.example.exercises.exercises;

import java.util.Scanner;

public class Exercise11 implements Exercise {
    /*
     * 69. Write a Java program to extract the first half of a even string.
     * Test Data: Python
     * Sample Output:
     * Pyt
     */

@Override
public void runExercise() {

Scanner entrada = new Scanner(System.in);
System.out.println("Escribe una palabra");
String  texto = entrada.nextLine();

String[] lista= texto.split("");


for (int i =0; i<(lista.length / 2); i++){
    System.out.print(lista[i]);
}

System.out.println("\n");

}
}