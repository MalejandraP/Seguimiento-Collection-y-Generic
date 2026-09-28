import java.time.LocalDate;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /**
         *En una agenda de eventos, es fundamental organizar las actividades según
         * su fecha de realización. Para cumplir con este requerimiento, se usará un
         * TreeMap, que almacenará los eventos con sus respectivas fechas como clave,
         * garantizando que siempre se mantengan ordenados cronológicamente y permitiendo
         * acceder de manera eficiente al evento más próximo.
         */

        AgendaEventos miAgenda = new AgendaEventos();

        // Insertamos eventos en desorden de fechas
        miAgenda.agregarEvento(LocalDate.of(2026, 11, 15), new Evento("Conferencia Java", "Auditorio A"));
        miAgenda.agregarEvento(LocalDate.of(2026, 10, 5), new Evento("Taller de Git", "Sala de Cómputo"));
        miAgenda.agregarEvento(LocalDate.of(2026, 12, 1), new Evento("Examen Final", "Aula 202"));
        miAgenda.agregarEvento(LocalDate.of(2026, 10, 1), new Evento("Reunión de Equipo", "Oficina Principal"));

        // Se muestran ordenados automáticamente por fecha
        miAgenda.mostrarAgenda();

        // Obtener el evento más próximo en la agenda
        System.out.println("\n EVENTO MÁS PRÓXIMO EN LA AGENDA");
        Map.Entry<LocalDate, Evento> masProximo = miAgenda.obtenerEventoMasProximo();
        System.out.println("Fecha: " + masProximo.getKey() + " -> " + masProximo.getValue());

        // Buscar el próximo evento a partir de una fecha específica
        System.out.println("\n BÚSQUEDA DESDE FECHA ESPECÍFICA (Ej: 2026-10-10) ");
        LocalDate fechaBusqueda = LocalDate.of(2026, 10, 10);
        Map.Entry<LocalDate, Evento> proximo = miAgenda.obtenerProximoEventoDesde(fechaBusqueda);
        System.out.println("El evento más cercano después de " + fechaBusqueda + " es:");
        System.out.println("Fecha: " + proximo.getKey() + " -> " + proximo.getValue());
    }
}