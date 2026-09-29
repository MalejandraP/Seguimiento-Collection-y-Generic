package co.edu.uniquindio.Collections.uno;

public class Main {
    public static void main(String[] args) {
        InventarioTienda tienda = new InventarioTienda();

        // Cargar productos al ArrayList
        tienda.agregarProducto(new Producto("P01", "Acuarelas", 15.000));
        tienda.agregarProducto(new Producto("P02", "Cuaderno", 10.000));
        tienda.agregarProducto(new Producto("P03", "Calculadora", 80.000));

        // Buscar producto
        System.out.println("Buscar Producto");
        Producto p = tienda.buscarPorCodigo("P03");
        System.out.println(p != null ? p : "Producto no encontrado");

        //  Obtener ArrayList ordenado por nombre
        System.out.println("\n ORDEN ALFABÉTICO (por Nombre) ");
        for (Producto producto : tienda.obtenerOrdenadoPorNombre()) {
            System.out.println(producto);
        }

        // Obtener ArrayList ordenado por precio
        System.out.println("\n ORDEN POR PRECIO (Menor a Mayor)");
        for (Producto producto : tienda.obtenerOrdenadoPorPrecio()) {
            System.out.println(producto);
        }

        // Eliminar elemento del ArrayList usando Iterator
        System.out.println("\n ELIMINAR PRODUCTO");
        tienda.eliminarProductoPorCodigo("P02");

        System.out.println("Inventario restante:");
        for (Producto producto : tienda.getInventario()) {
            System.out.println(producto);
        }
    }
}