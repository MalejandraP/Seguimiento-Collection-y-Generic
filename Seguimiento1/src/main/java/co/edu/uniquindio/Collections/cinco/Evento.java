package co.edu.uniquindio.Collections.cinco;
/**
 *
 *
 * Representa la información de un evento dentro de la agenda.
 */
public class Evento {
    private String titulo;
    private String lugar;

    public Evento(String titulo, String lugar) {
        this.titulo = titulo;
        this.lugar = lugar;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getLugar() {
        return lugar;
    }

    @Override
    public String toString() {
        return String.format("Evento{titulo='%s', lugar='%s'}", titulo, lugar);
    }
}
