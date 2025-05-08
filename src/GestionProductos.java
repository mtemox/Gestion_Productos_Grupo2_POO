
import java.util.Scanner;

public class GestionProductos {
    // Atributos
    private String nombreProducto;
    private int cantidadActual;

    // Constructor :)
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

    // Macias Ariel: implementacion de lo loggers
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

}

