package co.edu.uniquindio.Collections.nueve;

import java.util.TreeSet;


// 12. En una universidad, los nombres de los estudiantes deben mantenerse ordenados alfabéticamente para facilitar su búsqueda. Para ello, se utilizará un TreeSet, que automáticamente organizará los nombres de los estudiantes a medida que se agregan y permitirá obtener fácilmente el primer y el último nombre de la lista.

public class Main {
    public static void main(String[] args) {
        nombresEstudiantesTreeSet();
    }

    /**
     * Almacena el nombre de los estudiantes de una universidad en un TreeSet, que me permite guardarlos en orden natural de forma automática
     * Después muestra la lista ordenada, el primer elemento de la lista y el último elemento.
     */
    public static void nombresEstudiantesTreeSet(){
        TreeSet<String> estudiantes = new TreeSet<>();

        //Añado nombres a la lista
        estudiantes.add("Sara Ocampo");
        estudiantes.add("Sara Hernández");
        estudiantes.add("Geraldin Solorzano");
        estudiantes.add("Andres Pinzón");

        // Imprimo todos los elementos de la lista
        System.out.println(estudiantes);
        // Imprimo el primer elemento de la lista con first()
        System.out.println(estudiantes.first());
        // Imprimo el último elemento de la lista con last()
        System.out.println(estudiantes.last());
    }
}
