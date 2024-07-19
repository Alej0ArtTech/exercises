package com.example.exercises.exercises;

public class Exercise4 implements Exercise {
    @Override
    public void runExercise() {

     /*    Write a Java program to display the following pattern.
Sample Pattern :

   J    a   v     v  a                                                  
   J   a a   v   v  a a                                                 
J  J  aaaaa   V V  aaaaa                                                
 JJ  a     a   V  a     a
  */
  

        String[] java = {
            "   J    A   V     V  A   \n",
            "   J   A A   V   V  A A  \n",
            "J  J  AAAAA   V V  AAAAA \n",
            " JJ  A     A   V  A     A\n",
        };

        System.out.println(java[0]);
        System.out.println(java[1]);
        System.out.println(java[2]);
        System.out.println(java[3]);




    }
}
