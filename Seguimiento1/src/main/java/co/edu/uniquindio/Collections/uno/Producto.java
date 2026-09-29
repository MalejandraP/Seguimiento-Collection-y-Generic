package co.edu.uniquindio.Collections.uno;
import java.util.Objects;

/**
 *
 * Usamos comparable porque nos permite definir el "orden natural" por defecto de los objetos Producto
 * cuando se usen métodos como Collections.sort(). Aquí ordenamos por precio de menor a mayor.
 */
public class Producto implements Comparable<Producto> {
    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    /**
     * Implementación del método de la interfaz Comparable.
     * Compara los precios de dos productos para determinar cuál es menor, igual o mayor.
     */
    @Override
    public int compareTo(Producto otro) {
        return Double.compare(this.precio, otro.precio);
    }

    /**
     * ArrayList utiliza estos métodos para identificar cuándo dos objetos son iguales.
     * En este caso son idénticos si comparten el mismo 'codigo'.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(codigo, producto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    /**
     * Permite imprimir el objeto en consola con un formato claro en vez de la dirección de memoria.
     */
    @Override
    public String toString() {
        return String.format("Producto{codigo='%s', nombre='%s', precio=%.2f}", codigo, nombre, precio);
    }
}