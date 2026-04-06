
package Corte2.ListasEnlazadas.Ejercicio1;


public class Vagon {
    public String contenido;
    public double pesoToneladas;
    public String origen;
    public String destino;
    public Vagon siguiente;

    public Vagon(String contenido, double pesoToneladas, String origen, String destino) {
        this.contenido = contenido;
        this.pesoToneladas = pesoToneladas;
        this.origen = origen;
        this.destino = destino;
        this.siguiente = null;
    }
}

