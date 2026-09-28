package co.edu.uniquindio.Generics.ocho;
/*
 10. Método imprimirMayor<T extends Number & Comparable<T>> Implementar un método que reciba dos números comparables y devuelva el mayor.
 */
public class Main {
    /**
     * Demostración del método imprimirMayor() a partir de la clase genérica NúmeroMayor, probándolo con la comparación entre dos enteros y entre dos reales.
     * Muestra el número mayor
     * @param args
     */
    public static void main(String[] args) {
        NumeroMayor<Integer> enteros = new NumeroMayor<>();
        System.out.println(enteros.imprimirMayor(3, 2));

        NumeroMayor<Double> decimales = new NumeroMayor<>();
        System.out.println(decimales.imprimirMayor(3.04, 5.78));
    }

}
