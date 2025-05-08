import java.util.Scanner;
// Interfaz por consola
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nombre del producto: ");
    String nombre = sc.nextLine();
    System.out.print("Cantidad inicial: ");
    int inicial = sc.nextInt();

    GestionProductos tienda = new GestionProductos(nombre, inicial);
    int opcion;

    do {
        System.out.println("\n--- Menú Gestión de Inventario ---");
        System.out.println("1) Agregar unidades");
        System.out.println("2) Quitar unidades");
        System.out.println("3) Mostrar cantidad actual");
        System.out.println("4) Salir");
        System.out.print("Opción: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("¿Cuántas unidades agregar? ");
                tienda.agregar(sc.nextInt());
                break;
            case 2:
                System.out.print("¿Cuántas unidades quitar? ");
                tienda.quitar(sc.nextInt());
                break;
            case 3:
                System.out.println("Cantidad actual de '" + nombre + "': "
                        + tienda.getCantidadActual());
                break;
            case 4:
                System.out.println("Saliendo del sistema.");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    } while (opcion != 4);

    sc.close();
}
}