package co.edu.uniquindio.Generics.cincoEnunciado;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * Enunciado 8
         *ListaTareas<T extends Comparable<T>> con iterador inverso personalizado
         * Diseñar ListaTareas<T extends Comparable<T>> apoyada en ArrayList<T>,
         * que implemente Iterable<T>. Proveer:
         *
         *
         * Iterador “normal” (del índice 0 al final).
         *
         *
         * Iterador inverso como clase interna que recorra del último al primero.
         *
         *
         * Método que obtenga los elementos entre dos valores T min y T max usando
         * exclusivamente el iterador inverso.
         *
         */
        ListaTareas<Tarea> lista = new ListaTareas<>();

        // Insertamos tareas en la lista
        lista.agregarTarea(new Tarea("Preparar exposición de Java", 1));
        lista.agregarTarea(new Tarea("Ecuaciones Diferenciales", 3));
        lista.agregarTarea(new Tarea("Calculo Vectorial", 5));
        lista.agregarTarea(new Tarea("Hacer ejercicio", 8));
        lista.agregarTarea(new Tarea("Estructura de datos", 2));

        // Recorrido Normal (for-each / del índice 0 al final)
        System.out.println("Recorrido normal (0 al final)");
        for (Tarea t : lista) {
            System.out.println(t);
        }

        // Recorrido Inverso (del último al primero)
        System.out.println("\n Recorrido inverso (último al primero)");
        Iterator<Tarea> itInverso = lista.iteradorInverso();
        while (itInverso.hasNext()) {
            System.out.println(itInverso.next());
        }

        // Filtrar entre dos valores T min y T max usando el Iterador Inverso
        System.out.println("\n Tareas con diferente prioridad 2 Y 5 (Usando Iterador Inverso) ");
        Tarea min = new Tarea("Min", 2);
        Tarea max = new Tarea("Max", 5);

        List<Tarea> filtradas = lista.obtenerElementosEntre(min, max);
        for (Tarea t : filtradas) {
            System.out.println(t);
        }
    }
}
