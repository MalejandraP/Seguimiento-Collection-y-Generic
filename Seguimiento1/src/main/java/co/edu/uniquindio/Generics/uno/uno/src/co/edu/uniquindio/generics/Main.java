
package co.edu.uniquindio.generics;//

public class Main {

    /**
     * Ejericio 1 de la sección Básica
     *Clase genérica Caja<T>
     *Implementar una clase con un atributo T contenido y métodos guardar(T valor) y obtener().
     *
     */
    public static void main(String[] args) {
        // Guardar y obtener un String
        Caja<String> cajaDeTexto = new Caja<>();
        cajaDeTexto.guardar("Documento Importante");

        String texto = cajaDeTexto.obtener();
        System.out.println("Contenido de cajaDeTexto: " + texto);

        //  Guardar y obtener un Integer
        Caja<Integer> cajaDeNumero = new Caja<>();
        cajaDeNumero.guardar(2026);

        Integer numero = cajaDeNumero.obtener();
        System.out.println("Contenido de cajaDeNumero: " + numero);

        // Guardar y obtener un Double (para evitar la dependencia de la clase Producto)
        Caja<Double> cajaDeDecimal = new Caja<>();
        cajaDeDecimal.guardar(99.99);

        Double decimal = cajaDeDecimal.obtener();
        System.out.println("Contenido de cajaDeDecimal: " + decimal);

    }
}