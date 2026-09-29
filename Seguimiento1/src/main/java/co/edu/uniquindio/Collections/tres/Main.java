package co.edu.uniquindio.Collections.tres;

public class Main {
    public static void main(String[] args) {
        GestionUrgencias hospital = new GestionUrgencias();

        // Nivel 1 = Crítico / Nivel 2 = Urgente / Nivel 3 = Leve
        System.out.println("--- LLEGADA DE PACIENTES A URGENCIAS ---");

        // Llega un paciente con gravedad leve
        hospital.ingresarPaciente(new Paciente("Carlos (Dolor de Cabeza)", 3));

        // Llega un paciente con urgencia media
        hospital.ingresarPaciente(new Paciente("Ana (Fractura de Brazo)", 2));

        // Llega un paciente en estado crítico (debe pasar al frente)
        hospital.ingresarPaciente(new Paciente("Roberto (Infarto)", 1));

        // Llega otro paciente con gravedad leve
        hospital.ingresarPaciente(new Paciente("Maria (Fiebre alta)", 3));

        System.out.println("Siguiente paciente a ser atendido: " + hospital.verSiguientePaciente());

        System.out.println("\n--- ORDEN DE ATENCIÓN MÉDICA ---");
        // Se atienden según gravedad, no por orden de llegada
        while (hospital.hayPacientes()) {
            Paciente pacienteAtendido = hospital.atenderSiguientePaciente();
            System.out.println("Atendiendo a: " + pacienteAtendido);
        }
    }
}