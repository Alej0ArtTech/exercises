package com.example.exercises.exercises;

import java.util.ArrayList;

public class Exercise13 implements Exercise {
    @Override
    public void runExercise() {
        /*
         * Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and
         * both.
         * Sample Output:
         * 
         * Divided by 3:
         * 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
         * , 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,
         * 
         * Divided by 5:
         * 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90,
         * 95,
         * 
         * Divided by 3 & 5:
         * 15, 30, 45, 60, 75, 90,
         */
        // TODO: Implement the exercise logic here

        ArrayList<Integer> div3 = new ArrayList<>();
        ArrayList<Integer> div5 = new ArrayList<>();
        for (int i = 0; i < 100 ; i++){

            // condicion a evaluar si se puede dividir por 3
            if ((i % 3) == 0 ) {
                div3.add(i);
            }
            if ((i % 5) == 0 ) {
                div5.add(i);
            }
       
        }
        System.out.println(div3);
        System.out.println(div5);





    }
}
