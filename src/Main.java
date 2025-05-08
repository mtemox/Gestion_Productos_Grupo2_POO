import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Pedir datos iniciales
        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.print("Cantidad inicial: ");
        int inicial = sc.nextInt();

        // 2. Crear la instancia de GestionProductos
        GestionProductos tienda = new GestionProductos(nombre, inicial);

        int opcion;
        do {
            // 3. Mostrar menú de opciones
            System.out.println("\n--- Menú Gestión de Inventario ---");
            System.out.println("1) Agregar unidades");
            System.out.println("2) Quitar unidades");
            System.out.println("3) Mostrar cantidad actual");
            System.out.println("4) Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            // 4. Procesar la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántas unidades agregar? ");
                    int toAdd = sc.nextInt();
                    tienda.agregar(toAdd);
                    break;
                case 2:
                    System.out.print("¿Cuántas unidades quitar? ");
                    int toRemove = sc.nextInt();
                    tienda.quitar(toRemove);
                    break;
                case 3:
                    System.out.println("Cantidad actual de '" + nombre + "': "
                            + tienda.getCantidadActual());
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 4);

        sc.close();Scanner sc = new Scanner(System.in);

        // 1. Pedir datos iniciales
        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.print("Cantidad inicial: ");
        int inicial = sc.nextInt();

        // 2. Crear la instancia de GestionProductos
        GestionProductos tienda = new GestionProductos(nombre, inicial);

        int opcion;
        do {
            // 3. Mostrar menú de opciones
            System.out.println("\n--- Menú Gestión de Inventario ---");
            System.out.println("1) Agregar unidades");
            System.out.println("2) Quitar unidades");
            System.out.println("3) Mostrar cantidad actual");
            System.out.println("4) Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            // 4. Procesar la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántas unidades agregar? ");
                    int toAdd = sc.nextInt();
                    tienda.agregar(toAdd);
                    break;
                case 2:
                    System.out.print("¿Cuántas unidades quitar? ");
                    int toRemove = sc.nextInt();
                    tienda.quitar(toRemove);
                    break;
                case 3:
                    System.out.println("Cantidad actual de '" + nombre + "': "
                            + tienda.getCantidadActual());
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        } while (opcion != 4);

        sc.close();


    }
}