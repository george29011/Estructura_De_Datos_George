package Corte2.ListasDobleEnlazadas.Ejercicio3;

class Pestana {
    String tituloPagina;
    String url;
    String horaApertura;
    Pestana anterior;
    Pestana siguiente;

    public Pestana(String tituloPagina, String url, String horaApertura) {
        this.tituloPagina = tituloPagina;
        this.url = url;
        this.horaApertura = horaApertura;
        this.anterior = null;
        this.siguiente = null;
    }
}
