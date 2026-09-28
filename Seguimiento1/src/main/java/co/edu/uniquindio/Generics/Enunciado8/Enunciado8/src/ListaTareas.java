import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Representa una lista de tareas respaldada por un ArrayList<T>.
 * Implementa Iterable<T> para permitir el recorrido estándar (del índice 0 al final) mediante 'for-each'.
 *
 *
 */
public class ListaTareas<T extends Comparable<T>> implements Iterable<T> {

    private final ArrayList<T> tareas;

    public ListaTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(T tarea) {
        tareas.add(tarea);
    }

    public int tamano() {
        return tareas.size();
    }

    // Iterador "normal" (del índice 0 al final) exigido por Iterable<T>
    @Override
    public Iterator<T> iterator() {
        return tareas.iterator();
    }

    // Método para obtener una instancia del Iterador Inverso
    public Iterator<T> iteradorInverso() {
        return new IteradorInverso();
    }


    private class IteradorInverso implements Iterator<T> {
        private int posicionActual;

        public IteradorInverso() {

            this.posicionActual = tareas.size() - 1;
        }

        @Override
        public boolean hasNext() {
            return posicionActual >= 0;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No hay más elementos en la iteración inversa.");
            }
            T elemento = tareas.get(posicionActual);
            posicionActual--; // Avanza hacia atrás
            return elemento;
        }
    }

    /**
     * Obtiene los elementos cuyo valor esté entre min y max (ambos inclusivos)
     * usando EXCLUSIVAMENTE el iterador inverso.
     *
     *
     */
    public List<T> obtenerElementosEntre(T min, T max) {
        List<T> resultado = new ArrayList<>();
        Iterator<T> itInverso = iteradorInverso();

        while (itInverso.hasNext()) {
            T elemento = itInverso.next();


            boolean esMayorOIgualMin = elemento.compareTo(min) >= 0;
            boolean esMenorOIgualMax = elemento.compareTo(max) <= 0;

            if (esMayorOIgualMin && esMenorOIgualMax) {
                resultado.add(elemento);
            }
        }

        return resultado;
    }
}