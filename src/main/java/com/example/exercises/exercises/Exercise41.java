package com.example.exercises.exercises;

public class Exercise41 implements Exercise {
    @Override
    public void runExercise() {
        //area lateral


        //area total

        //volumen
        int radio = 5;
        int height = 20;
        final float PI = 3.1416f;
        float latArea = 2 * PI * radio * height;
        float totArea = latArea+ ( 2 * PI * (radio*radio));
        float Vol = PI * (radio*radio) *height;

        System.out.println("The lateral area is: "+ latArea );
        System.out.println("The total area is" + totArea);
        System.out.println("The volume of the cilinder is: " + Vol);


    }
}
