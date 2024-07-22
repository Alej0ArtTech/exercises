package com.example.exercises.exercises;
import java.util.Scanner;

public class Exercise16 implements Exercise {
    @Override
    public void runExercise() {
        // TODO: Implement the exercise logic here
   
    /*
     * Write a Java program to insert a word in the middle of another string.
     * Insert "Tutorial" in the middle of "Python 3.0", so the result will be Python
     * Tutorial 3.0.
     * Sample Output:
     * 
     * Python Tutorial 3.0
     */
    

    Scanner entrada = new Scanner(System.in);

    System.out.println("Escribe una palabra, para colocar enmedio de la frase: 'Python 3.0'");

    String palabra = entrada.nextLine();

    String frase = "Python 3.0";

    String[] cadena = frase.split(" ");
    System.out.println(cadena[0] + " " + palabra + " " + cadena[1]);

    // Realizado en 7 minutos
    }
}
