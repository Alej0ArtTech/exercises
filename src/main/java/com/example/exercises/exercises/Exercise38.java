package com.example.exercises.exercises;

public class Exercise38 implements Exercise {
    @Override
    public void runExercise() {

  /*       [01:05 p. m.] Victor Manuel Vilchis Nando
Crear Variables: Declara una variable de tipo int llamada años y asigna un valor inicial de 20.
Modificar Variables: Aumenta el valor de la variable años por 5 y luego imprime su nuevo valor.
Crea Variables Wrapper: Declara una variable de tipo Integer llamada hijos y asigna un valor de 2
Uso de Variables: Declara dos variables de tipo String, nombre y apellido. Asigna tu nombre y apellido a estas variables
Imprime el siguiente mensaje utilizando System.out.println : “Hola mi nombre es: [nombre] , tengo [años] años y tengo [hijos] hijos”
 */
 

        int anios =20; 
        anios = anios + 5;
        Integer hijos = 2;
        String nombre = "Edgar";
        String apeido = "Luna";

        System.out.println("Hola, mi nombre es" + nombre + apeido+ ", tengo " + anios + "y tengo"+ hijos + "hijos");
        




        // TODO: Implement the exercise logic here
    }
}
