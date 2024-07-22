package com.example.exercises;

import com.example.exercises.exercises.Exercise;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


@SpringBootApplication
@ComponentScan(basePackages = { "com.example.exercises.exercises" })
public class ExerciseApplication implements CommandLineRunner {

    @Autowired
    private Environment env; // Inyecta el entorno para acceder a las propiedades

    private Map<Integer, String> exercises = new HashMap<>();

    public static void main(String[] args) {
        SpringApplication.run(ExerciseApplication.class, args);
    }

    @Override
    public void run(String... args) {
        loadExercises();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Select an option:");
                System.out.println("0 - Run an exercise");
                System.out.println("1 - Add a new exercise");
                System.out.println("2 - Exit");

                int option = scanner.nextInt();
                scanner.nextLine();  // Limpiar el buffer de entrada

                switch (option) {
                    case 0:
                        runExerciseMenu(scanner);
                        break;
                    case 1:
                        addNewExercise();
                        break;
                    case 2:
                        System.out.println("Exiting...");
                        return; // Salir del método run, lo que terminará la aplicación
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
    private void runExerciseMenu(Scanner scanner) {
        System.out.println("Select exercise number to run:");
        System.out.println("Current exercises: " + exercises); // Verifica el contenido
        for (Integer number : exercises.keySet()) {
            System.out.println(number + " - " + exercises.get(number));
        }
        int exerciseNumber = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer de entrada
        String className = exercises.get(exerciseNumber);
        if (className != null) {
            try {
                Class<?> clazz = Class.forName(className);
                Constructor<?> constructor = clazz.getConstructor();
                Exercise exercise = (Exercise) constructor.newInstance();
                exercise.runExercise();
            } catch (Exception e) {
                System.err.println("Error running exercise: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            System.out.println("Invalid exercise number.");
        }
    }

private void addNewExercise() {
    // Determine the next exercise number
    int nextExerciseNumber = exercises.size() + 1;
    String newClassName = "com.example.exercises.exercises.Exercise" + nextExerciseNumber;

    // Define the file path for the new .java file
    String filePath = "src/main/java/com/example/exercises/exercises/Exercise" + nextExerciseNumber + ".java";

    // Define the content for the new .java file
    String classContent = "package com.example.exercises.exercises;\n\n" +
        "public class Exercise" + nextExerciseNumber + " implements Exercise {\n" +
        "    @Override\n" +
        "    public void runExercise() {\n" +
        "        // TODO: Implement the exercise logic here\n" +
        "    }\n" +
        "}\n";

    // Create the .java file and write the class content
    try {
        java.io.File file = new java.io.File(filePath);
        if (file.createNewFile()) {
            try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file))) {
                fileWriter.write(classContent);
                System.out.println("Java file created: " + filePath);
            } catch (IOException e) {
                System.err.println("Error writing to Java file: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists: " + filePath);
        }
    } catch (IOException e) {
        System.err.println("Error creating Java file: " + e.getMessage());
        e.printStackTrace();
    }

    // Add new exercise to properties file
    try (BufferedWriter propertiesWriter = new BufferedWriter(new FileWriter("src/main/resources/application.properties", true))) {
        propertiesWriter.newLine();
        propertiesWriter.write("exercises." + nextExerciseNumber + "=" + newClassName);
         // Asegura que cada entrada esté en una línea nueva
        System.out.println("New exercise added: " + newClassName);
        // Update the in-memory map
        exercises.put(nextExerciseNumber, newClassName);
    } catch (IOException e) {
        System.err.println("Error adding new exercise to properties file: " + e.getMessage());
        e.printStackTrace();
    }
}

    private void loadExercises() {
        // Carga las propiedades desde application.properties
        int index = 1;
        while (true) {
            String key = "exercises." + index;
            String className = env.getProperty(key);
            if (className == null) {
                break;
            }
            exercises.put(index, className);
            index++;
        }
        System.out.println("Loaded exercises: " + exercises); // Depuración
    }
}

