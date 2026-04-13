package Corte2.ListasEnlazadas.Ejercicio5;


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