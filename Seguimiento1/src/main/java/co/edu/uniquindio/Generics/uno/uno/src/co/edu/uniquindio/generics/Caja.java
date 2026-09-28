package co.edu.uniquindio.generics; // Asegúrate de que coincida con el paquete de tu carpeta

/**
 * Clase genérica Caja<T> que almacena un elemento de cualquier tipo.
 */
public class Caja<T> {

    private T contenido;

    public Caja() {
        this.contenido = null;
    }

    public void guardar(T valor) {
        this.contenido = valor;
    }

    public T obtener() {
        return this.contenido;
    }

    public boolean estaVacia() {
        return this.contenido == null;
    }
}