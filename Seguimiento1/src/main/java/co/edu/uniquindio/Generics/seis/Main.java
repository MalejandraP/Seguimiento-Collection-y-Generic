package co.edu.uniquindio.Generics.seis;
// 5. Clase Par<T>
// Implementar una clase que guarde dos valores de tipo T y un método para verificar si ambos son iguales.
public class Main {
    public static void main(String[] args) {
        compararDosDatosGenericos();
    }

    /**
     * Mostramos el uso de la clase genérica Par comparando dos pares de datos,
     * String y Double que me devuelve un booleano: True si son dos valores iguales, False si son distintos.
     */
    public static void compararDosDatosGenericos() {
        Par<String> par = new Par<>("uno", "dos");
        System.out.println(par.sonIguales());

        Par<Double> par2 = new Par<>(1.09, 1.09);
        System.out.println(par2.sonIguales());
    }
}
