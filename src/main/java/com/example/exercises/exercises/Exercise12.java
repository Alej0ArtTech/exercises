package com.example.exercises.exercises;

import java.util.Scanner;

public class Exercise12 implements Exercise {
    @Override
    public void runExercise() {
/*         Write a Java program to print odd numbers from 1 to 99. Prints one number per line.
        Sample Output:
        
        1                                                                      
        3                                                                      
        5                                                                      
        7                                                                      
        9                                                                      
        11                                                                     
        ....                                                                     
                                                                            
        91                                                                     
        93                                                                     
        95                                                                     
        97                                                                     
        99 
    } */


    for (int i = 0; i < 100 ; i++){

        if (i % 2 != 0) {
            System.err.println(i);
        }

    }




}
}