package Corte2.ListasDobleEnlazadas.Ejercicio1;

class Cambio {
    String texto;
    String tipoOperacion;
    Cambio anterior;
    Cambio siguiente;

    public Cambio(String texto, String tipoOperacion) {
        this.texto = texto;
        this.tipoOperacion = tipoOperacion;
        this.anterior = null;
        this.siguiente = null;
    }
}