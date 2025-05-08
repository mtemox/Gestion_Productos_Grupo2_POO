
import java.util.Scanner;

public class GestionProductos {
    // Atributos
    private String nombreProducto;
    private int cantidadActual;

    // Constructor
    public GestionProductos(String nombreProducto, int cantidadInicial) {
        this.nombreProducto = nombreProducto;
        this.cantidadActual = Math.max(0, cantidadInicial); // no permitimos cantidad negativa al inicio
        System.out.println("Producto '" + nombreProducto + "' creado con cantidad inicial: " + this.cantidadActual);
    }
}
