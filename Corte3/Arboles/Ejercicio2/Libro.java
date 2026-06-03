package Corte3.Arboles.Ejercicio2;

public class Libro {
    long isbn;
    String titulo;
    String autor;
    int anioPublicacion;
    Libro izquierda, derecha;

    public Libro(long isbn, String titulo, String autor, int anioPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.izquierda = null;
        this.derecha = null;
    }

    @Override
    public String toString() {
        return isbn + " - " + titulo + " - " + autor;
    }
}

