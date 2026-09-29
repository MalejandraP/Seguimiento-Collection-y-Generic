package co.edu.uniquindio.Generics.tres;

/**
 * Clase genérica restringida que permite comparar dos elementos y determinar cuál es mayor.
 *
 * ¿Por qué '<T extends Comparable<T>>'?
 * No todos los objetos en Java se pueden comparar con un "mayor que" o "menor que".
 * Al colocar 'extends Comparable<T>', le exigimos a Java que solo acepte tipos que
 * hayan implementado la interfaz Comparable (como Integer, Double, String, LocalDate, Producto, etc.).
 * Esto nos garantiza que el método 'a.compareTo(b)' existirá de forma segura.
 *
 *
 */
public class Comparador<T extends Comparable<T>> {

    /**
     * Compara dos elementos de tipo T y devuelve el mayor.
     *
     *
     */
    public T mayor(T a, T b) {
        // Manejo de valores nulos
        if (a == null) return b;
        if (b == null) return a;

        /*
         * ¿Cómo funciona compareTo()?
         *  - Si a.compareTo(b) > 0  => 'a' es mayor que 'b'.
         *  - Si a.compareTo(b) == 0 => ambos son iguales.
         *  - Si a.compareTo(b) < 0  => 'b' es mayor que 'a'.
         */
        if (a.compareTo(b) >= 0) {
            return a;
        } else {
            return b;
        }
    }
}