package co.edu.uniquindio.Generics.diez;

import java.util.Comparator;

/**
 * Representando a un paciente en una cola de atención, con orden natural por nombre en orden alfabético.
 * Tiene  un comparador alternativo que es por prioridad, en lugar de empate en prioridad, se compara el timestamp de ingreso.
 */
public class Paciente implements Comparable<Paciente> {
    private String id, nombre;
    private int prioridad;
    private long timestampIngreso;

    public Paciente(String id, String nombre, int prioridad, long timestampIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.timestampIngreso = timestampIngreso;
    }

    /**
     * Orden natural: orden alfabético
     * @param o the object to be compared.
     * @return negativo, cero o positivo según el orden alfabético según los nombres
     */
    @Override
    public int compareTo(Paciente o) {
        return this.nombre.compareTo(o.nombre);
    }

    /**
     * Comparador que ordena por prioridad descendente y si existe empate es por timestamp de ingreso descendente (más reciente primero).
     */
    public static Comparator<Paciente> ordenamientoPorPrioridadYTimesLap = new Comparator<Paciente>() {
        @Override
        public int compare(Paciente p1, Paciente p2) {
            if (p1.prioridad!= p2.prioridad) {
                if (p1.prioridad > p2.prioridad) {
                    return -1;
                } else {
                    return 1;
                }
            } else {
                if (p1.timestampIngreso > p2.timestampIngreso) {
                    return -1;
                } else if (p1.timestampIngreso < p2.timestampIngreso) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    };

    public long getTimestampIngreso() {
        return timestampIngreso;
    }

    public void setTimestampIngreso(long timestampIngreso) {
        this.timestampIngreso = timestampIngreso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Paciente\n" +
                "id : '" + id + '\'' +
                ", nombre : '" + nombre + '\'' +
                ", prioridad : " + prioridad +
                ", timestampIngreso : " + timestampIngreso +
                '\n';
    }
}
