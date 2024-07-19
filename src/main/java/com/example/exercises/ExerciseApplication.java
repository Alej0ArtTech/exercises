package com.example.exercises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SpringBootApplication

public class ExerciseApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ExerciseApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select exercise number to run:");
        int exerciseNumber = scanner.nextInt();

        // Mapa de ejercicios
        Map<Integer, Exercise> exercises = new HashMap<>();
        exercises.put(1, new Exercise1());  // Ejercicio 1
        exercises.put(2, new Exercise2());  // Ejercicio 2
        // Agrega más ejercicios aquí

        // Validar el número de ejercicio seleccionado
        Exercise exercise = exercises.get(exerciseNumber);
        if (exercise != null) {
            exercise.runExercise();
        } else {
            System.out.println("Invalid exercise number.");
        }
    }
}