package com.example.exercises.exercises;

import java.util.*;

/* Prueba 1: Gestión de Inventario
Descripción: Estás desarrollando un sistema simple para gestionar un inventario de productos. Cada producto tiene un nombre y una cantidad en stock. Debes implementar una clase Producto y una clase Inventario que permita realizar las siguientes operaciones:

Agregar un Producto: Permite agregar un nuevo producto al inventario.
Eliminar un Producto: Permite eliminar un producto del inventario basado en el nombre del producto.
Mostrar Inventario: Muestra todos los productos y sus cantidades en el inventario.
Requisitos:

Crea una clase Producto con los atributos nombre y cantidad, y los métodos getters y setters.
Crea una clase Inventario que contenga una lista de productos (ArrayList<Producto>). Incluye métodos para agregar, eliminar y mostrar productos.
En el método main, prueba las funcionalidades agregando, eliminando y mostrando productos. */

public class Exercise34 implements Exercise {
    @Override
    public void runExercise() {

        Inventario inventario = new Inventario();

        // Agregar productos
        Producto prod1 = new Producto("Manzana", 10);
        Producto prod2 = new Producto("Plátano", 5);
        inventario.agregarProducto(prod1);
        inventario.agregarProducto(prod2);

        // Mostrar inventario
        System.out.println("Inventario antes de eliminar:");
        inventario.mostrarInventario();

        // Eliminar un producto
        inventario.eliminarProducto("Manzana");

        // Mostrar inventario después de eliminar
        System.out.println("Inventario después de eliminar:");
        inventario.mostrarInventario();


    }
}


class Producto {
    private String nombre;
    private int cantidad;

    

    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + "]";
    }

    

    // Constructor, getters y setters
}

class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Constructor y métodos para agregar, eliminar y mostrar productos

    public Inventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public void eliminarProducto(String nombre) {

        productos.removeIf(p -> p.getNombre().equals(nombre));

        // Implementa
    }

    public void mostrarInventario() {
        for (Producto n : productos){
            System.out.println(n);
        }
        // Implementa
    }
}
