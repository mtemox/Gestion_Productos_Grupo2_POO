import java.util.Scanner;
import static java.rmi.server.LogStream.log;

public class GestionProductos {
    private String nombre;
    private int cantidadActual;
    public GestionProductos(String nombre, int cantidadInicial){
        this.nombre = nombre;
        this.cantidadActual = Math.max(0, cantidadInicial);
        log("Prodcuto"+ nombre + "creado por cantidad inicial: " + this.cantidadActual);


    }
    public void agregarProducto( int cantidad) {
        int nuevaCantidad = cantidadActual + cantidad;
        if (esValida(nuevaCantidad)) {
            log("Agregando " + cantidad + " unidades al producto " + nombre);
            cantidadActual = nuevaCantidad;
        } else {
            System.out.println("Producto nuevo agregado: " + nombre);
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

