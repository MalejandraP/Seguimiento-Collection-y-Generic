public class Main {
    public static void main(String[] args) {
        DirectorioTelefono directorio = new DirectorioTelefono();

        // Agregar contactos
        directorio.agregarContacto("Maria Lopez", "3001234567");
        directorio.agregarContacto("Alejandra Perez", "3159876543");
        directorio.agregarContacto("Carlos Gomez", "3114567890");

        // Mostrar directorio completo
        directorio.mostrarDirectorio();

        // Buscar número por nombre (Búsqueda inmediata O(1))
        System.out.println("\n BÚSQUEDA DE CONTACTO ");
        System.out.println("Teléfono de Maria Lopez: " + directorio.buscarTelefono("Maria Lopez"));
        System.out.println("Teléfono de Juan Perez: " + directorio.buscarTelefono("Juan Perez"));

        // Intentar agregar una clave duplicada (Sobrescribe el número anterior)
        System.out.println("\n ACTUALIZACIÓN DE NÚMERO (Misma clave) ");
        directorio.agregarContacto("Maria Lopez", "3000000000"); // Nuevo número
        System.out.println("Nuevo teléfono de Maria Lopez: " + directorio.buscarTelefono("Maria Lopez"));

        // Eliminar un contacto
        System.out.println("\n ELIMINACIÓN DE CONTACTO ");
        directorio.eliminarContacto("Carlos Gomez");

        System.out.println("\nDirectorio actualizado:");
        directorio.mostrarDirectorio();
    }
}