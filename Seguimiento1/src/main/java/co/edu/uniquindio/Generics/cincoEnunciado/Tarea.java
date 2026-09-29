package co.edu.uniquindio.Generics.cincoEnunciado;

public class Tarea implements Comparable<Tarea> {
    private String descripcion;
    private int prioridad; // 1 (Alta) a 10 (Baja)

    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Tarea otra) {
        return Integer.compare(this.prioridad, otra.getPrioridad());
    }

    @Override
    public String toString() {
        return String.format("Tarea{descripcion='%s', prioridad=%d}", descripcion, prioridad);
    }
}