package co.edu.uniquindio.Generics.dos;

/**
 * 4. Método genérico intercambiar
 *  Implementar un método que reciba dos elementos de tipo T e intercambie sus posiciones en un arreglo.
 */
public class Main {

    public static void main(String[] args) {
        String[] nombres = {"Ana", "Carlos", "Beatriz", "David"};

        // Llamada directa al método
        intercambiar(nombres, "Carlos", "David");

        System.out.println(java.util.Arrays.toString(nombres));
    }

    // Método genérico
    public static <T> void intercambiar(T[] arreglo, T elem1, T elem2) {
        if (arreglo == null || elem1 == null || elem2 == null) return;

        int pos1 = -1, pos2 = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].equals(elem1) && pos1 == -1) pos1 = i;
            else if (arreglo[i] != null && arreglo[i].equals(elem2) && pos2 == -1) pos2 = i;
        }

        if (pos1 != -1 && pos2 != -1) {
            T aux = arreglo[pos1];
            arreglo[pos1] = arreglo[pos2];
            arreglo[pos2] = aux;
        }
    }
}