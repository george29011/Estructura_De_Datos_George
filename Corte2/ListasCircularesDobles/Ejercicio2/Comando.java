package Corte2.ListasCircularesDobles.Ejercicio2;

class Comando {
    String texto;
    boolean exitoso;
    String directorio;
    Comando siguiente;
    Comando anterior;

    public Comando(String texto, boolean exitoso, String directorio) {
        this.texto = texto;
        this.exitoso = exitoso;
        this.directorio = directorio;
    }
}