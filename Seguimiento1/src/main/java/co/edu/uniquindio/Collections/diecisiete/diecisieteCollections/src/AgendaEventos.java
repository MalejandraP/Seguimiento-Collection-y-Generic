import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

/**
 * Administra los eventos organizados por fecha.
 *
 * ¿Por qué usamos TreeMap<LocalDate, Evento>?
 *
 * Orden automático por Clave: TreeMap implementa NavigableMap y ordena
 * automáticamente sus claves según su orden natural (LocalDate se ordena de menor a mayor).
 *
 * Acceso al elemento más próximo: Ofrece métodos como firstEntry(), firstKey() o
 * ceilingEntry() para obtener directamente el evento más cercano en el tiempo en O(log n).
 */
public class AgendaEventos {

    // Clave: LocalDate (Fecha del evento) | Valor: Evento
    private TreeMap<LocalDate, Evento> agenda;

    public AgendaEventos() {
        this.agenda = new TreeMap<>();
    }

    /**
     * Agrega un nuevo evento a la agenda. Se ubicará automáticamente en su lugar cronológico.
     */
    public void agregarEvento(LocalDate fecha, Evento evento) {
        agenda.put(fecha, evento);
    }

    /**
     * Devuelve el evento más antiguo o más próximo registrado en la agenda.
     */
    public Map.Entry<LocalDate, Evento> obtenerEventoMasProximo() {
        // .firstEntry() recupera la primera pareja (la fecha más baja/antigua)
        return agenda.firstEntry();
    }

    /**
     * Devuelve el próximo evento a partir de la fecha actual dada.
     */
    public Map.Entry<LocalDate, Evento> obtenerProximoEventoDesde(LocalDate fechaActual) {
        // .ceilingEntry() busca la clave igual o inmediatamente superior a la fecha dada
        return agenda.ceilingEntry(fechaActual);
    }

    /**
     * Imprime todos los eventos en orden cronológico ascendente.
     */
    public void mostrarAgenda() {
        if (agenda.isEmpty()) {
            System.out.println("La agenda está vacía.");
            return;
        }

        System.out.println("AGENDA EN ORDEN CRONOLÓGICO");
        for (Map.Entry<LocalDate, Evento> entrada : agenda.entrySet()) {
            System.out.println("Fecha: " + entrada.getKey() + " | " + entrada.getValue());
        }
    }

    public TreeMap<LocalDate, Evento> getAgenda() {
        return agenda;
    }
}