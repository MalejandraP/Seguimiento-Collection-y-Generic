package co.edu.uniquindio.Collections.siete;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

//  9. En la navegación web, los usuarios necesitan poder retroceder a páginas anteriores. Para este propósito, se usará un Stack, que funciona como una pila LIFO (Last In, First Out).
//  Cada vez que el usuario visite una nueva página, esta se añadirá a la pila, y cuando decida volver atrás, se eliminará la última página visitada para regresar a la anterior.
public class Main {
    public static void main(String[] args) {
        navegacionStack();
    }

    /**
     * Metodo que me permite simular un historial de navegación usando Deque como pila, cada página agregada se apila quedando siempre la última en la cima de la pila.
     * Cuando me devuelvo, elimino la última agregada para que la anterior pueda quedar en la cima.
     */
    public static void navegacionStack(){
        Deque<String> stack = new ArrayDeque<>();

        // Con push y addFirst apilo en la cima de la fila (como primer elemento) cada página agregada
        stack.push("websideB");
        stack.addFirst("websideC");
        stack.push("websideA");
        stack.push("websideD");

        // Imprimo y elimino el primer elemento mediante pop().
        System.out.println(stack.pop());
        // Imprimo el primer elemento
        System.out.println(stack.peek());
    }
}
