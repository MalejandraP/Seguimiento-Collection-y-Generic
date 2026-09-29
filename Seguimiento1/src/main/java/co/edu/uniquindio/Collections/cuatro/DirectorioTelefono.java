package co.edu.uniquindio.Collections.cuatro;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * Un directorio telefónico necesita almacenar nombres junto con sus respectivos números
 * de teléfono y permitir búsquedas eficientes. Para este caso, se usará un HashMap,
 * el cual asociará cada nombre con su número telefónico, posibilitando consultas rápidas
 * y evitando duplicados.
 *
 * ¿Por qué usamos HashMap<String, String>?
 * 1. Estructura Clave-Valor: La clave representa el nombre del contacto (único)
 *    y el valor su número telefónico.
 * 2. Búsquedas eficientes: Permite encontrar el número de cualquier persona en
 *    tiempo constante O(1) usando su nombre.
 * 3. Evita claves duplicadas: Si intentas agregar un contacto con un nombre que ya existe,
 *    HashMap sobrescribe el número viejo con el nuevo.
 */
public class DirectorioTelefono {


    private HashMap<String, String> directorio;

    public DirectorioTelefono() {
        this.directorio = new HashMap<>();
    }

    /**
     * Agrega un nuevo contacto o actualiza el número si el nombre ya existe.
     *
     */
    public void agregarContacto(String nombre, String telefono) {
        // .put() inserta el par clave-valor. Si la clave existe, actualiza el valor.
        directorio.put(nombre, telefono);
    }

    /**
     * Busca el número de teléfono dado el nombre del contacto.
     *
     */
    public String buscarTelefono(String nombre) {
        // .getOrDefault() devuelve el valor si la clave existe, o un texto por defecto si no.
        return directorio.getOrDefault(nombre, "Contacto no encontrado");
    }

    /**
     * Verifica si un contacto existe en el directorio.
     */
    public boolean existeContacto(String nombre) {
        return directorio.containsKey(nombre);
    }

    /**
     * Elimina un contacto del directorio por su nombre.
     */
    public boolean eliminarContacto(String nombre) {
        return directorio.remove(nombre) != null;
    }

    /**
     * Muestra todos los contactos registrados en el directorio.
     */
    public void mostrarDirectorio() {
        if (directorio.isEmpty()) {
            System.out.println("El directorio está vacío.");
            return;
        }

        System.out.println("CONTACTOS REGISTRADOS");
        // Usamos entrySet() para iterar sobre los pares Clave-Valor
        for (Map.Entry<String, String> entrada : directorio.entrySet()) {
            System.out.println("Nombre: " + entrada.getKey() + " | Teléfono: " + entrada.getValue());
        }
    }

    public HashMap<String, String> getDirectorio() {
        return directorio;
    }
}
