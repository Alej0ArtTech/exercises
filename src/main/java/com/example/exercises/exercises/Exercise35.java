package com.example.exercises.exercises;
import java.util.*;

public class Exercise35 implements Exercise {
    @Override
    public void runExercise() {
        /// cada paquede

        // No se escoge el mismo paquete dos veces
        // Se debe escoger simepre le paquete más grande

        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        System.out.println("Ingresa el tamaño de unidades del camión");
        int tamanioCamion = entrada.nextInt();
        System.out.println("Ingresa los paquete separados por espacios");
        String paquetes = entrada2.nextLine();

        String[] lista1 = paquetes.split(" ");

        ArrayList<Integer> lista3 = new ArrayList<>();

        for (String n : lista1) {
            int n2 = Integer.parseInt(n);
            lista3.add(n2);
        }

        // ordenarlos, luego, vamos a seleccionar los dos más grande
        // si el paquete excede el tamño entonces ir al siguiente paquete
        lista3.sort(null);
        Collections.reverse(lista3);

        ArrayList<Integer> resultado = new ArrayList<>();

        for (int i = 0; i < lista3.size() - 1; i++) {
            if (lista3.get(i) + lista3.get(i + 1) < tamanioCamion - 30) {
                resultado.add(lista3.get(i));
                resultado.add(lista3.get(i + 1));
                break;
            }
        }

        System.out.println(resultado.toString());
    }
}
