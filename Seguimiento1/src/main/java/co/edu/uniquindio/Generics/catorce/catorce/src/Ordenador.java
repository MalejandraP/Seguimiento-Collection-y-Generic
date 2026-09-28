import java.util.List;

/**
 * Clase genérica para ordenar listas de objetos comparables.
 *
 *
 */
public class Ordenador<T extends Comparable<T>> {

    /**
     * Ordena una lista en orden ascendente utilizando el método compareTo.
     *
     *
     */
    public void ordenar(List<T> lista) {
        if (lista == null || lista.size() <= 1) {
            return; // Lista vacía o con un solo elemento ya está ordenada
        }

        int n = lista.size();

        // Algoritmo de ordenamiento por burbuja utilizando compareTo
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                // Si elemento_j > elemento_j+1, compareTo devuelve un valor mayor a 0
                if (lista.get(j).compareTo(lista.get(j + 1)) > 0) {

                    // Intercambiamos los elementos
                    T aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, aux);
                }
            }
        }
    }
}