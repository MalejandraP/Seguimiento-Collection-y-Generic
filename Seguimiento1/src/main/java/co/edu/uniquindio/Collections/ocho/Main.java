package co.edu.uniquindio.Collections.ocho;

import java.util.LinkedHashSet;
// 11. En una aplicación de música, los usuarios pueden marcar canciones como favoritas.
// Para garantizar que las canciones favoritas se mantengan en el orden en que fueron añadidas sin permitir duplicados, se empleará un LinkedHashSet,
// el cual conservará la secuencia de inserción y asegurará que no haya repeticiones.
public class Main {
    public static void main(String[] args) {
        cancionesFavoritas();
    }

    /**
     * Metodo que me permite agregar canciones a una lista sin aceptar duplicados mediante LinkedHashSet, muestra tamaño de la lista, cada elemento de la lista y verifica que no se agreguen dos elementos iguales.
     */
    public static void cancionesFavoritas(){
        LinkedHashSet<String> favoritas = new LinkedHashSet<>();

        // Agrego canciones a la lista, poniendo dos elementos iguales verificando si los agrega a los dos.
        favoritas.add("Fue lo mejor");
        favoritas.add("Damn Right");
        favoritas.add("I Wish You Roses");
        favoritas.add("I Wish You Roses");

        // Imprimo el tamaño de la lista.
        System.out.println(favoritas.size());
        // Imprimo elementos de la lista.
        System.out.println(favoritas);
        favoritas.add("La Isla Bonita");
        System.out.println(favoritas.size());

    }

}
