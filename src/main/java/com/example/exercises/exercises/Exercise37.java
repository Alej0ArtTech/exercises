package com.example.exercises.exercises;

public class Exercise37 implements Exercise {
    @Override
    public void runExercise() {
        
        /*         Hacer un programa no menor a 40 líneas de código funcional,
donde se empleen los temas vistos hasta el momento (Variables, Constantes y Operadores).
No incluir ningún tema extra.    } ¿Quien es mayor? ¿Por cuantos años?*/ 

final String JAVIER = "javier";
final String MARIA = "Maria";
final String JAIME = "Jaime";
int edadJavier = 18;
int edadMaria = 36;
int edadJaime = 40;

int comparacion1 = edadJavier >= edadMaria ? edadJavier : edadMaria;
int comparacion2 = edadJaime >= comparacion1 ? edadJaime : comparacion1;
String nMayoredad2 = comparacion1 == edadJavier ? JAVIER : MARIA;
String nMayorEdad = comparacion2 == edadJaime ? JAIME : nMayoredad2;

System.out.println("La edad más grande es de: " + nMayorEdad);

//Por cuantos años es mayor
int masGrandePor = comparacion2 - comparacion1;

System.out.println(nMayorEdad + " es más grande que" + nMayorEdad + " por " + masGrandePor + "años");


//Ver quien es el más joven
int edadMenor1 = edadJavier <= edadMaria ? edadJavier : edadMaria;
int edadMenor = edadJaime <= edadMenor1 ? edadJaime : edadMenor1;
String nombreMenor1 = edadMenor1 == edadJavier ? JAVIER : MARIA;
String nombreMenor = edadMenor == edadJaime ? JAIME : nombreMenor1;

int masJovenPor = edadMenor - edadMenor1;

System.out.println(nombreMenor + " es más joven que" + nombreMenor1 + " por " + masJovenPor);
final String MONSTE = "Montse";
final String CARLOS = "Carlos";
final String ROSA = "Rosa";
final String DAVID = "David";
final String LAURA = "Laura";
int edadMontse = 29;
int edadCarlos = 38;
int edadRosa = 31;
int edadDavid = 27;
int edadLaura = 40;

//La edad es par?
String JaimePar = edadJavier%2 == 0 ? "La edad de" + JAIME+ "es par" : "La edad de Jaime no es par";
String MontsePar = edadMontse % 2 == 0 ? "La edad de" + MONSTE + "es par" : "La edad de Montse no es par";
String CarlosPar = edadCarlos % 2 == 0 ? "La edad de" + CARLOS + " es par" : "La edad de Carlos no es par";
String RosaPar = edadRosa % 2 == 0 ? "La edad de " + ROSA + " es par" : "La edad de Rosa no es par";
String DavidPar = edadDavid % 2 == 0 ? "La edad de David es par" : "La edad de David no es par";
String LauraPar = edadLaura % 2 == 0 ? "La edad de Laura es par" : "La edad de Laura no es par";

System.out.println(JaimePar);
System.out.println(CarlosPar);
System.out.println(MontsePar);
System.out.println(RosaPar);
System.out.println(DavidPar);
System.out.println(LauraPar);

    }
}
