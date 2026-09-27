package co.edu.uniquindio.Collections.seis;

import java.util.PriorityQueue;
// 4. Cree una cola (Queue) que almacene objetos de tipo "Tarea" que tengan una prioridad asociada. Implemente la cola usando un PriorityQueue y defina la prioridad de cada tarea según su importancia.

public class Main {
    public static void main(String[] args) {
        tareaPrioritaria();
    }

    /**
     * Metodo que me permite almacenar objetos con una importancia establecida anteriormente mediante PriorityQueue
     * Muestra todos los objetos de la lista ordenados según su prioridad.
     */
    public static void tareaPrioritaria(){
        PriorityQueue<Tarea> tareitasConPrioridad = new PriorityQueue<>();

        // Creo nuevas tareas y le asigno un nivel de importancia.
        Tarea tareita1 = new Tarea("Estudiar para el parcial", 1);
        Tarea tareita2 = new Tarea("Terminar el laboratorio", 3);
        Tarea tareita3 = new Tarea("Realizar el taller", 2);

        // Añado las tareas creadas a la lista.
        tareitasConPrioridad.add(tareita1);
        tareitasConPrioridad.add(tareita2);
        tareitasConPrioridad.add(tareita3);

        // Mientras la lista no esté vacía, voy mostrando y borrando el primer elemento con poll().
        while (!tareitasConPrioridad.isEmpty()) {
            System.out.println(tareitasConPrioridad.poll());
        }
    }

}
