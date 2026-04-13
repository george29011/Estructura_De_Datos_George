package Corte2.Listas_Circulares.Ejercicio1;

class Participante {
    String nombre;
    int numeroBoleta;
    String ciudad;
    Participante siguiente;

    public Participante(String nombre, int numeroBoleta, String ciudad) {
        this.nombre = nombre;
        this.numeroBoleta = numeroBoleta;
        this.ciudad = ciudad;
        this.siguiente = null;
    }
}