import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         *Clase Ordenador<T extends Comparable<T>>
         *  Implementar un método ordenar(List<T> lista) que ordene una lista usando el método compareTo.
         *
         */

        // Probar ordenando una lista de Nombres (Strings)
        List<String> frutas = new ArrayList<>();
        frutas.add("Pera");
        frutas.add("Manzana");
        frutas.add("Banano");
        frutas.add("Uva");

        System.out.println("Lista de frutas desordenada: " + frutas);

        Ordenador<String> ordenadorTexto = new Ordenador<>();
        ordenadorTexto.ordenar(frutas);

        System.out.println("Lista de frutas ordenada: " + frutas);


        //  Probar ordenando una lista de Números (Integers)
        List<Integer> numeros = new ArrayList<>();
        numeros.add(45);
        numeros.add(12);
        numeros.add(89);
        numeros.add(3);

        System.out.println("\nLista de números desordenada: " + numeros);

        Ordenador<Integer> ordenadorNumeros = new Ordenador<>();
        ordenadorNumeros.ordenar(numeros);

        System.out.println("Lista de números ordenada: " + numeros);
    }
}