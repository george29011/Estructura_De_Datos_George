package Corte2.ListasEnlazadas.Ejercicio5;

public class Cancion {
    private String titulo;
    private String artista;
    private int duracionSegundos;
    private String genero;

    private Cancion siguiente;

    public Cancion(String titulo, String artista, int duracionSegundos, String genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracionSegundos = duracionSegundos;
        this.genero = genero;
        this.siguiente = null;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public String getGenero() {
        return genero;
    }

    public Cancion getSiguiente() {
        return siguiente;
    }

   
    public void setSiguiente(Cancion siguiente) {
        this.siguiente = siguiente;
    }
}