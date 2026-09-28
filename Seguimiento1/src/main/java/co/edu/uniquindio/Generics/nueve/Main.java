package co.edu.uniquindio.Generics.nueve;
// 15. Clase CalculadoraAvanzada<T extends Number & Comparable<T>>
// Implementar métodos sumar, restar, maximo y minimo para cualquier tipo numérico comparable (Integer, Double, etc.).
public class Main {

    /**
     * Ejecuta la demostración de la CalculadoraAvanzada con dos tipos numéricos:
     * Integer y Double
     * @param args
     */
    public static void main(String[] args) {
        CalculadoraAvanzada<Integer> enteros = new CalculadoraAvanzada<>(2,5);
        System.out.println(enteros.sumar());
        System.out.println(enteros.restar());
        System.out.println(enteros.minimo());

        CalculadoraAvanzada<Double> reales = new CalculadoraAvanzada<>(7.51,4.86);
        System.out.println(reales.sumar());
        System.out.println(reales.restar());
        System.out.println(reales.maximo());

    }
}
