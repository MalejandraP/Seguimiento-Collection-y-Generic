import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Administra la lista de productos usando ArrayList.
 */
public class InventarioTienda {


    private ArrayList<Producto> inventario;

    public InventarioTienda() {
        this.inventario = new ArrayList<>();
    }

    // 1. Agregar un producto al ArrayList
    public void agregarProducto(Producto producto) {
        inventario.add(producto);
    }

    /**
     * 2. Eliminar por código.

     *
     * 'Iterator.remove()' es la forma segura de eliminar dentro del recorrido.
     */
    public boolean eliminarProductoPorCodigo(String codigo) {
        Iterator<Producto> iterator = inventario.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.getCodigo().equalsIgnoreCase(codigo)) {
                iterator.remove(); // Eliminación segura del ArrayList
                return true;
            }
        }
        return false;
    }

    // 3. Buscar un producto por su código
    public Producto buscarPorCodigo(String codigo) {
        for (Producto p : inventario) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Ordenar por Nombre (Alfabético).
     * ¿Por qué clonamos con 'new ArrayList<>(inventario)'?
     * Para devolver un ArrayList ordenado sin modificar el orden del inventario original.
     *
     * ¿Por qué Comparator?
     * Como el orden natural ya está ocupado por el Precio (Comparable),
     * usamos un Comparator personalizado para ordenar por Nombre.
     */

    public ArrayList<Producto> obtenerOrdenadoPorNombre() {
        ArrayList<Producto> copia = new ArrayList<>(inventario);
        copia.sort(Comparator.comparing(Producto::getNombre, String.CASE_INSENSITIVE_ORDER));
        return copia;
    }

    /**
     * Ordenar por Precio.
     * Collections.sort() utiliza directamente el método compareTo() de la clase Producto.
     */
    public ArrayList<Producto> obtenerOrdenadoPorPrecio() {
        ArrayList<Producto> copia = new ArrayList<>(inventario);
        Collections.sort(copia);
        return copia;
    }

    // Devuelve el ArrayList completo del inventario
    public ArrayList<Producto> getInventario() {
        return inventario;
    }
}