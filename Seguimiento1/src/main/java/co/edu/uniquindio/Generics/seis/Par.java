package co.edu.uniquindio.Generics.seis;

/**
 * Clase Genérica que me permite comparar dos datos del mismo tipo.
 * @param <T>
 */
public class Par<T> {
    private T dato1;
    private T dato2;

    public Par(T dato1, T dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    // Verifica si son iguales usando .equals()
    public boolean sonIguales() {
        return dato1.equals(dato2);
    }
}

