package Corte2.ListasEnlazadas.Ejercicio5;

public class Reproductor {
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
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nueva);
        }
    }

    public void agregarAContinuacion(String titulo, String artista, int duracion, String genero) {
        Cancion nueva = new Cancion(titulo, artista, duracion, genero);

        if (cabeza == null) {
            cabeza = nueva;
        } else {
            nueva.setSiguiente(cabeza.getSiguiente());
            cabeza.setSiguiente(nueva);
        }
    }

    public void mostrarLista() {
        Cancion actual = cabeza;

        while (actual != null) {
            System.out.println(actual.getTitulo() + " - " + actual.getArtista() +
                    " | Duración: " + actual.getDuracionSegundos() + "s" +
                    " | Género: " + actual.getGenero());
            actual = actual.getSiguiente();
        }
    }

    public void mostrarDuracionTotal() {
        int totalSegundos = 0;
        Cancion actual = cabeza;

        while (actual != null) {
            totalSegundos += actual.getDuracionSegundos();
            actual = actual.getSiguiente();
        }

        int minutos = totalSegundos / 60;
        int segundos = totalSegundos % 60;

        System.out.println("Tiempo total: " + minutos + ":" +
                (segundos < 10 ? "0" + segundos : segundos));
    }
}
