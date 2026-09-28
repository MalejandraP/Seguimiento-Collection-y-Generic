import java.util.Objects;

/**
 * Enunciado:
 * En un hospital, los pacientes deben ser atendidos según la gravedad de su condición,
 * con los más urgentes siendo tratados primero. Para manejar esto, se implementará una
 * PriorityQueue, donde cada paciente será ingresado con un nivel de prioridad y el sistema
 * garantizará que aquellos con mayor urgencia sean atendidos antes que los demás.
 *
 * Implementa 'Comparable<Paciente>' para definir cómo se ordenarán automáticamente
 * los pacientes dentro de la PriorityQueue según su gravedad.
 */
public class Paciente implements Comparable<Paciente> {
    private String nombre;
    private int nivelGravedad; // Convención: 1 (Mayor urgencia) a 5 (Menor urgencia)

    public Paciente(String nombre, int nivelGravedad) {
        this.nombre = nombre;
        this.nivelGravedad = nivelGravedad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivelGravedad() {
        return nivelGravedad;
    }

    /**
     *
     * ¿Por qué 'Integer.compare(this.nivelGravedad, otro.nivelGravedad)'?
     * PriorityQueue saca primero el elemento de MENOR valor numérico por defecto (Min-Heap).
     * Por lo tanto, si el nivel 1 es la máxima urgencia (ej. Paro Cardíaco) y el nivel 5 es menor (ej. Gripe),
     * esta comparación garantiza que el nivel 1 salga primero.
     */
    @Override
    public int compareTo(Paciente otro) {
        return Integer.compare(this.nivelGravedad, otro.nivelGravedad);
    }

    @Override
    public String toString() {
        return String.format("Paciente{nombre='%s', nivelGravedad=%d}", nombre, nivelGravedad);
    }
}