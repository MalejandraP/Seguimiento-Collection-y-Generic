package co.edu.uniquindio.Generics.tres;
public class Main {//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static void main(String[] args) {
        /**
         * Ejercicio 8
         *Clase Comparador<T extends Comparable<T>>
         * Crear una clase genérica con un método mayor(T a, T b) que devuelva
         * el mayor entre dos elementos comparables.
         *
         */


        // Comparar Números Enteros (Integer implementa Comparable<Integer>)
        Comparador<Integer> comparadorEnteros = new Comparador<>();
        Integer mayorNumero = comparadorEnteros.mayor(45, 89);
        System.out.println("El mayor número entre 45 y 89 es: " + mayorNumero);


        // Comparar Cadenas de Texto (String implementa Comparable<String>)
        // En los Strings, la comparación es alfabética (lexicográfica).
        Comparador<String> comparadorTexto = new Comparador<>();
        String mayorTexto = comparadorTexto.mayor("Manzana", "Pera");
        System.out.println("El texto mayor alfabéticamente entre 'Manzana' y 'Pera' es: " + mayorTexto);


        // Comparar Decimales (Double implementa Comparable<Double>)
        Comparador<Double> comparadorDecimales = new Comparador<>();
        Double mayorDecimal = comparadorDecimales.mayor(15.75, 12.30);
        System.out.println("El mayor decimal entre 15.75 y 12.30 es: " + mayorDecimal);
    }
}
