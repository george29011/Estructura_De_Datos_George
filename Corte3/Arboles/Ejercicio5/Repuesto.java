package Corte3.Arboles.Ejercicio5;

public class Repuesto {
    int codigoRef;
    String descripcion;
    String marca;
    int stock;
    Repuesto izquierda, derecha;

    public Repuesto(int codigoRef, String descripcion, String marca, int stock) {
        this.codigoRef = codigoRef;
        this.descripcion = descripcion;
        this.marca = marca;
        this.stock = stock;
        this.izquierda = null;
        this.derecha = null;
    }

    @Override
    public String toString() {
        return "[" + codigoRef + "] " + descripcion + " - " + marca + " (" + stock + " uds)";
    }
}
