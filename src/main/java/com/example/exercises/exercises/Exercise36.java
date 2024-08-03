package com.example.exercises.exercises;

import java.util.*;

public class Exercise36 implements Exercise {
    @Override
    public void runExercise() {

        /*
         * Write a Java program that then reads an integer and calculates the sum of its
         * digits
         * and writes the number of each digit of the sum in English
         */

        int num = 5;

        for (int i = 1; i < num; i++) {
            for (int j = 1; j < num; j++) {
                if (j + i == num) {
                    ArrayList<String> n1 = converInt(j);
                    ArrayList<String> n2 = converInt(i);
                    ArrayList<String> resul = converInt(num);
                    for (String string : n1) {
                        System.out.print(string + " ");
                    }
                    System.out.print(" + ");

                    for (String string : n2) {
                        System.out.print(string + " ");

                    }
                    System.out.print(" = ");
                    for (String string : resul) {
                        System.out.print(string + " ");

                    }
                    System.out.print("\n");

                }
            }
        }
    }

    public static ArrayList<String> converInt(int numero) {
        String texto = String.valueOf(numero);
        String[] lista = texto.split("");
        ArrayList<String> newlist = new ArrayList<>(Arrays.asList(lista));
        for (int i = 0; i < lista.length; i++) {
            switch (newlist.get(i)) {
                case "1":
                    newlist.set(i, "one");
                    break;
                case "2":
                    newlist.set(i, "two");
                    break;
                case "3":
                    newlist.set(i, "three");
                    break;
                case "4":
                    newlist.set(i, "four");
                    break;
                case "5":
                    newlist.set(i, "five");
                    break;
                case "6":
                    newlist.set(i, "six");
                    break;
                case "7":
                    newlist.set(i, "seven");
                    break;
                case "8":
                    newlist.set(i, "eight");
                    break;
                case "9":
                    newlist.set(i, "nine");
                    break;
                case "0":
                    newlist.set(i, "zero");
                    break;
                default:
                    newlist.set(i, "unknown");
                    break;
            }
        }
        return newlist;

    }

}