package co.edu.uniquindio.Generics.siete;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
/**
 * Implementación de Almacenable que guarda elementos sin duplicados
 * y calcula el mayor según su orden natural con compareTo().
 *
 * @param <T>
 */
public class Almacenaje<T extends Comparable<T>> implements Almacenable<T>{
    private TreeSet<T> elementos = new TreeSet<>();


    /**
     * Guarda un elemento. Si ya existe uno equivalente según {@code compareTo},
     * no se agrega.
     * @param item elemento a guardar
     */
    @Override
    public void guardar(T item) {
        elementos.add(item);
    }

    /**
     * Calcula el mayor elemento almacenado.
     * @return el mayor elemento (el último en la lista ordenada por el compareTo()), o null si no hay elementos
     */
    @Override
    public T maximo(){
        if (!elementos.isEmpty()){
            return elementos.last();
        }
        return null;
    }
}
