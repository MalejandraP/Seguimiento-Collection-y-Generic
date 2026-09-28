package co.edu.uniquindio.Generics.nueve;

/***
 * Calculadora genérica que me permite operar sobre dos números comparables del mismo tipo
 * Operaciones de suma, resta, máximo y mínimo.
 * @param <N>
 */
public class CalculadoraAvanzada<N extends Number & Comparable<N>> {
    private final N num1, num2;

    public CalculadoraAvanzada(N num1, N num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sumar() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public double restar() {
        return num1.doubleValue() - num2.doubleValue();
    }

    /**
     * Método que devuelve el mayor entre dos números.
     * @return
     */
    public N maximo(){
        if (num1.compareTo(num2) > 0){
            return num1;
        }
        return num2;
    }

    /**
     * Método que devuelve el menor entre dos números.
     * @return
     */
    public N minimo(){
        if (num1.compareTo(num2) < 0){
            return num1;
        }
        return num2;
    }

}
