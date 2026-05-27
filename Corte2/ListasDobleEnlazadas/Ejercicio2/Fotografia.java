package Corte2.ListasDobleEnlazadas.Ejercicio2;

class Fotografia {
    String nombreArchivo;
    double tamanoMB;
    String resolucion;
    Fotografia anterior;
    Fotografia siguiente;

    public Fotografia(String nombreArchivo, double tamanoMB, String resolucion) {
        this.nombreArchivo = nombreArchivo;
        this.tamanoMB = tamanoMB;
        this.resolucion = resolucion;
        this.anterior = null;
        this.siguiente = null;
    }
}