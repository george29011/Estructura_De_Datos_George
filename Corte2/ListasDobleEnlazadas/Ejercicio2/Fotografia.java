package Corte2.ListasDobleEnlazadas.Ejercicio2;

class Fotografia {
    String nombreArchivo;
    double tamañoMB;
    String resolucion;
    Fotografia anterior;
    Fotografia siguiente;

    public Fotografia(String nombreArchivo, double tamañoMB, String resolucion) {
        this.nombreArchivo = nombreArchivo;
        this.tamanoMB = tamñoMB;
        this.resolucion = resolucion;
        this.anterior = null;
        this.siguiente = null;
    }
}