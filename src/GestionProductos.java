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
}
