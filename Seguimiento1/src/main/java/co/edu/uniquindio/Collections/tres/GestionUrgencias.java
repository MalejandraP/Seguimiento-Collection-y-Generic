package co.edu.uniquindio.Collections.tres;

import java.util.PriorityQueue;

/**
 * Administra la cola de atención médica usando PriorityQueue.
 */
public class GestionUrgencias {

    /**
     * ¿Por qué usamos PriorityQueue?
     * A diferencia de una Queue normal (FIFO - primero en llegar, primero en salir),
     * PriorityQueue reordena los elementos automáticamente cada vez que se inserta uno nuevo.
     * El elemento con mayor prioridad (menor número de gravedad) siempre estará al frente.
     */
    private PriorityQueue<Paciente> colaUrgencias;

    public GestionUrgencias() {
        this.colaUrgencias = new PriorityQueue<>();
    }


    public void ingresarPaciente(Paciente paciente) {
        colaUrgencias.add(paciente);
    }

    /**
     * Atender al siguiente paciente más urgente.
     *
     * ¿Por qué .poll()?
     * El método .poll() extrae y ELIMINA el elemento con mayor prioridad de la cola.
     * Si la cola está vacía, retorna null sin lanzar excepción.
     */
    public Paciente atenderSiguientePaciente() {
        return colaUrgencias.poll();
    }

    /**
     * 3. Consultar quién es el siguiente sin retirarlo de la cola.
     *
     * ¿Por qué .peek()?
     * El método .peek() permite VER el elemento al frente de la cola sin eliminarlo.
     */
    public Paciente verSiguientePaciente() {
        return colaUrgencias.peek();
    }

    public boolean hayPacientes() {
        return !colaUrgencias.isEmpty();
    }

    public int cantidadPacientesEnEspera() {
        return colaUrgencias.size();
    }
}