package co.edu.uniquindio.Collections.dos;
public class Main {
    public static void main(String[] args) {
        ControlAcceso edifControl = new ControlAcceso();

        System.out.println("REGISTRO DE EMPLEADOS ");
        System.out.println("Registro EMPLEADO-001: " + edifControl.registrarEmpleado("EMPLEADO-001"));
        System.out.println("Registro EMPLEADO-002: " + edifControl.registrarEmpleado("EMPLEADO-002"));
        System.out.println("Registro EMPLEADO-003: " + edifControl.registrarEmpleado("EMPLEADO-003"));

        // Intentar registrar un duplicado
        System.out.println("\n--- INTENTO DE REGISTRO DUPLICADO ---");
        boolean sePudoRegistrar = edifControl.registrarEmpleado("EMPLEADO-001");
        System.out.println("¿Se pudo registrar EMPLEADO-001 otra vez?: " + sePudoRegistrar);

        // Verificación de entradas
        System.out.println("\nCONTROL DE ENTRADA EN TORNIQUETE ");
        probarEntrada(edifControl, "EMPLEADO-002"); // Debe ingresar
        probarEntrada(edifControl, "EMPLEADO-999"); // Debe denegar

        // Revocar acceso
        System.out.println("\n REVOCAR ACCESO");
        edifControl.revocarAcceso("EMPLEADO-002");
        probarEntrada(edifControl, "EMPLEADO-002"); // Ahora debe denegar
    }

    private static void probarEntrada(ControlAcceso control, String id) {
        if (control.verificarAcceso(id)) {
            System.out.println("Acceso PERMITIDO para el ID: " + id);
        } else {
            System.out.println("Acceso DENEGADO para el ID: " + id + " (No registrado o revocado)");
        }
    }
}
