package Corte2.ListasEnlazadas;

public class Ejercicio_5 {

    public static void main(String[] args) {

        Reproductor reproductor = new Reproductor();

        reproductor.agregarAlFinal("Song 1", "Artista A", 200, "Pop");
        reproductor.agregarAlFinal("Song 2", "Artista B", 180, "Rock");
        reproductor.agregarAlFinal("Song 3", "Artista C", 240, "Jazz");

        
        reproductor.agregarAContinuacion("Song 4", "Artista D", 150, "Reggaeton");

        System.out.println("=== LISTA DE CANCIONES ===");
        reproductor.mostrarLista();

        System.out.println("\n=== DURACIÓN TOTAL ===");
        reproductor.mostrarDuracionTotal();
    }
}


class Reproductor {
    private Cancion cabeza;

    public Reproductor() {
        cabeza = null;
    }

    
    public void agregarAlFinal(String titulo, String artista, int duracion, String genero) {
        Cancion nueva = new Cancion(titulo, artista, duracion, genero);

        if (cabeza == null) {
            cabeza = nueva;
        } else {
            Cancion actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nueva;
        }
    }


    public void agregarAContinuacion(String titulo, String artista, int duracion, String genero) {
        Cancion nueva = new Cancion(titulo, artista, duracion, genero);

        if (cabeza == null) {
            cabeza = nueva;
        } else {
            nueva.siguiente = cabeza.siguiente;
            cabeza.siguiente = nueva;
        }
    }

    
    public void mostrarLista() {
        Cancion actual = cabeza;

        while (actual != null) {
            System.out.println(actual.titulo + " - " + actual.artista +
                    " | Duración: " + actual.duracionSegundos + "s" +
                    " | Género: " + actual.genero);
            actual = actual.siguiente;
        }
    }

    
    public void mostrarDuracionTotal() {
        int totalSegundos = 0;
        Cancion actual = cabeza;

        while (actual != null) {
            totalSegundos += actual.duracionSegundos;
            actual = actual.siguiente;
        }

        int minutos = totalSegundos / 60;
        int segundos = totalSegundos % 60;

        System.out.println("Tiempo total: " + minutos + ":" + 
            (segundos < 10 ? "0" + segundos : segundos));
    }
}


class Cancion {
    String titulo;
    String artista;
    int duracionSegundos;
    String genero;

    Cancion siguiente;

    public Cancion(String titulo, String artista, int duracionSegundos, String genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracionSegundos = duracionSegundos;
        this.genero = genero;
        this.siguiente = null;
    }
}