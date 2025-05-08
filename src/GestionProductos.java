
import java.util.Scanner;

public class GestionProductos {
    // Atributos
    private String nombreProducto;
    private int cantidadActual;

    // Constructor
    public GestionProductos(String nombreProducto, int cantidadInicial) {
        this.nombreProducto = nombreProducto;
        this.cantidadActual = Math.max(0, cantidadInicial); // no permitimos cantidad negativa al inicio
        log("Producto '" + nombreProducto + "' creado con cantidad inicial: " + this.cantidadActual);
    }
    public void agregarProducto( int cantidad) {
        int nuevaCantidad = cantidadActual + cantidad;
        if (esValida(nuevaCantidad)) {
            log("Agregando " + cantidad + " unidades al producto " + nombreProducto);
            cantidadActual = nuevaCantidad;
        } else {
            System.out.println("Producto nuevo agregado: " + nombreProducto);
        }
    }

    // Método para agregar unidades al inventario
    public void agregar(int unidades) {
        int nuevaCantidad = cantidadActual + unidades;
        if (esValida(nuevaCantidad)) {
            log("Agregando " + unidades + " unidades a '" + nombreProducto + "'. De "
                    + cantidadActual + " a " + nuevaCantidad);
            cantidadActual = nuevaCantidad;
        } else {
            System.out.println("Error: no se puede agregar una cantidad negativa.");
        }
    }

    // Método para quitar unidades del inventario
    public void quitar(int unidades) {
        int nuevaCantidad = cantidadActual - unidades;
        if (esValida(nuevaCantidad)) {
            log("Quitando " + unidades + " unidades de '" + nombreProducto + "'. De "
                    + cantidadActual + " a " + nuevaCantidad);
            cantidadActual = nuevaCantidad;
        } else {
            System.out.println("Error: no hay suficientes unidades para quitar.");
        }
    }

    // Validación interna: la cantidad nunca puede ser negativa
    private boolean esValida(int cantidad) {
        return cantidad >= 0;
    }

    // Logger sencillo
    private void log(String msg) {
        System.out.println("[LOG] " + msg);
    }

    // Getter para la cantidad actual
    public int getCantidadActual() {
        return cantidadActual;
    }

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

