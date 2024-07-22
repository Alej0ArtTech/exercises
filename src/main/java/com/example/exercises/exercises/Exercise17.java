package com.example.exercises.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Exercise17 implements Exercise {
    @Override
    public void runExercise() {

        /*
         * 68. Write a Java program to create another string of 4 copies of the last 3
         * characters of the original string. The original string length must be 3 and
         * above.
         * Sample Output:
         * 
         * 3.03.03.03.0
         * 
         * avaavaavaava
         */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor inserte el numero o la palabra");
        String palabraR = entrada.nextLine();

        String[] letras = palabraR.split("");

        ArrayList<String> letrasList = new ArrayList<>(Arrays.asList(letras));

        Collections.reverse(letrasList);

        for (int i = 0; i < 3; i++) {
            System.out.print(letrasList.get(2).toString());
            System.out.print(letrasList.get(1).toString());
            System.out.print(letrasList.get(0).toString());
        }

    }
}
