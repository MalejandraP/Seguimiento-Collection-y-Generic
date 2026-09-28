package co.edu.uniquindio.Generics.siete;

/**
 * Interfaz genérica para almacenar elementos y obtener el mayor de ellos.
 * @param <T>
 */
public interface Almacenable<T extends Comparable<T>> {
    public void guardar(T item);

    public T maximo();
}
