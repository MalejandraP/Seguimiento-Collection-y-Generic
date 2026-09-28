import java.util.HashSet;

/**
 * Enunciado:
 * En un edificio con control de acceso, los empleados deben identificarse mediante un
 * código único para poder ingresar. Para gestionar estos accesos sin permitir duplicados,
 * se utilizará un HashSet, donde cada ID de empleado será almacenado y verificado antes
 * de permitir la entrada.
 *
 * ¿Por qué usamos HashSet?
 * 1. No permite elementos duplicados: si intentas agregar dos veces el mismo ID, 
 *    el HashSet simplemente lo ignora.
 * 2. Búsquedas ultra rápidas: el método contains() se ejecuta en tiempo constante,
 *    lo que es ideal para verificar credenciales en tiempo real.
 */
public class ControlAcceso {

    // Almacena únicamente los IDs autorizados
    private HashSet<String> empleadosAutorizados;

    public ControlAcceso() {
        this.empleadosAutorizados = new HashSet<>();
    }

    /**
     * Registra un nuevo ID de empleado.
     */
    public boolean registrarEmpleado(String idEmpleado) {
        // el método .add() de HashSet retorna false si el elemento ya está en el conjunto
        return empleadosAutorizados.add(idEmpleado);
    }

    /**
     * Verifica si un empleado tiene acceso permitido antes de entrar.
     */
    public boolean verificarAcceso(String idEmpleado) {
        // .contains() busca de forma inmediata en la tabla Hash
        return empleadosAutorizados.contains(idEmpleado);
    }

    /**
     * Elimina el acceso a un empleado
     */
    public boolean revocarAcceso(String idEmpleado) {
        return empleadosAutorizados.remove(idEmpleado);
    }

    // Retorna el HashSet completo de autorizados
    public HashSet<String> getEmpleadosAutorizados() {
        return empleadosAutorizados;
    }
}