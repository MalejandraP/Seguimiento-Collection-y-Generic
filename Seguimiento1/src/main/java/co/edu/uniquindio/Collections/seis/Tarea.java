package co.edu.uniquindio.Collections.seis;

/**
 * Clase Tarea con atributos título y nivel de importancia
 * Implementa de Comparable, lo que me permite comparar cada tarea para definir el orden por nivel de importancia de cada una de forma automática.
 */
public class Tarea implements Comparable<Tarea>{
    private String titulo;
    private int NivelImportancia;

    public Tarea(String titulo, int nivelImportancia) {
        this.titulo = titulo;
        NivelImportancia = nivelImportancia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNivelImportancia() {
        return NivelImportancia;
    }

    public void setNivelImportancia(int nivelImportancia) {
        NivelImportancia = nivelImportancia;
    }

    @Override
    public String toString() {
        return "Tarea \n" +
                "Titulo :'" + titulo + '\'' +
                ", Nivel de importancia :" + NivelImportancia +
                '\n';
    }

    /**
     * Metodo que me permite comparar entre dos tareas, cuál es la que tiene mayor prioridad según su nivel de importancia.
     * @param t the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Tarea t) {
        return Integer.compare(this.NivelImportancia, t.NivelImportancia);
    }
}
