package co.edu.uniquindio.Generics.ocho;

/**
 * Clase genérica NumeroMayor que extiendo de Comparable y Number lo que me permite comparar diferentes tipos de números
 * @param <T>
 */
public class NumeroMayor<T extends Number & Comparable<T>> {
    private T num1;
    private T num2;

    public NumeroMayor() {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Método que me permite comparar dos números y determinar cuál es el mayor.
     * @return T número mayor
     */
    public T imprimirMayor(T num1, T num2){
        return num1.compareTo(num2) > 0 ? num1 : num2;
    }

    @Override
    public String toString() {
        return "Numeros \n" +
                "num1 = " + num1 +
                ", num2 = " + num2 +
                '\n';
    }
}
