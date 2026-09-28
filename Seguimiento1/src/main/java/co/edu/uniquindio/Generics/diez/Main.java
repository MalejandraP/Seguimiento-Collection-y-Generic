package co.edu.uniquindio.Generics.diez;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

/*
11. (Enunciados)
ColaAtencionPacientes con prioridad y recorrido selectivo
 Diseñar Paciente (id, nombre, prioridad:int, timestampIngreso: long).
 Requisitos:

Orden natural por nombre.
Comparator por prioridad desc y, si empata, por timestampIngreso desc (más reciente primero).

Estructura ColaAtencionPacientes basada en LinkedList<Paciente>. Implementar un método que, usando solo Iterator,
devuelva los K pacientes de prioridad ≥ P más recientes (no usar for-each ni streams).

 */
public class Main {
    public static void main(String[] args) {
        probarComparador();
    }

    /**
     * Puedo demostrar los dos criterios de ordenamiento del Paciente
     * Creo una lista de pacientes LinkedList que se recorre con ListIterator cuando está organizada por el orden natural y cuando está organizada por el orden según prioridad y timestamp de ingreso en caso de empate.
     */
    public static void probarComparador() {
        LinkedList<Paciente> pacientes = new LinkedList<>();

        pacientes.add(new Paciente("1", "Ana", 2, 1000L));
        pacientes.add(new Paciente("2", "Luis", 3, 2000L));
        pacientes.add(new Paciente("3", "Carlos", 3, 1500L));
        pacientes.add(new Paciente("4", "Marta", 1, 3000L));

        Collections.sort(pacientes);

        ListIterator<Paciente> iteratorOrdenNatural = pacientes.listIterator();
        System.out.println("Orden Natural de la lista: ");
        while (iteratorOrdenNatural.hasNext()) {
            System.out.println(iteratorOrdenNatural.next());
        }

        pacientes.sort(Paciente.ordenamientoPorPrioridadYTimesLap);
        ListIterator<Paciente> iteratorOrdenPrioridad = pacientes.listIterator();
        System.out.println("Orden por prioridad y Times Lap: ");
        while (iteratorOrdenPrioridad.hasNext()) {
            System.out.println(iteratorOrdenPrioridad.next());
        }
    }
}
