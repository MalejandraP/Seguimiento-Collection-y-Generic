package co.edu.uniquindio.Generics.siete;

import java.util.TreeSet;

// 9. Interfaz genérica Almacenable<T extends Comparable<T>>
// Definir una interfaz con métodos guardar(T item) y maximo().
// Implementar en una clase que calcule el mayor elemento almacenado.
public class Main {
    public static void main(String[] args) {
        elementoMayor();
    }

    /**
     * Demuestro el uso de clase genérica Almacenaje con dos tipos distintos:
     * Elemento: imprimiendo el mayor según el órden alfabético.
     * Entero: Imprimiendo el número mayor.
     */
    public static void elementoMayor(){
        Almacenaje<Elemento> a = new Almacenaje<>();

        Elemento e1 = new Elemento("Libro", "Cosa con hojas y palabras para leer");
        Elemento e2 = new Elemento("Carpeta", "Cosa que guarda hojas para escribir");
        Elemento e3 = new Elemento("Lapicero", "Cosa para escribir en las hojas de la carpeta");

        a.guardar(e1);
        a.guardar(e2);
        a.guardar(e3);

        System.out.println(a.maximo());

        Almacenaje<Integer> numeros = new Almacenaje<>();

        numeros.guardar(5);
        numeros.guardar(10);
        System.out.println(numeros.maximo());


    }
}
