package Corte2.Listas_Circulares.Ejercicio2;

class Carrusel {
    private Anuncio cabeza = null;

   
    public void agregar(String titulo, int duracion, String categoria) {
        Anuncio nuevo = new Anuncio(titulo, duracion, categoria);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
        } else {
            Anuncio temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("No hay anuncios.");
            return;
        }

        Anuncio temp = cabeza;
        do {
            System.out.println("Título: " + temp.titulo +
                               " | Categoría: " + temp.categoria +
                               " | Duración: " + temp.duracionSegundos +
                               "s | Repeticiones: " + temp.vecesRepetido);
            temp = temp.siguiente;
        } while (temp != cabeza);
    }

    // Método principal
    public void reproducir(int ciclos) {
        if (cabeza == null) {
            System.out.println("No hay anuncios para reproducir.");
            return;
        }

        int tiempoTotal = 0;
        Anuncio actual = cabeza;

        System.out.println("\n--- INICIANDO CARRUSEL ---");

        for (int i = 0; i < ciclos; i++) {
            do {
                System.out.println("Mostrando: " + actual.titulo +
                                   " (" + actual.categoria + ")");

                actual.vecesRepetido++;
                tiempoTotal += actual.duracionSegundos;

                actual = actual.siguiente;
            } while (actual != cabeza);
        }

        
        Anuncio masRepetido = cabeza;
        Anuncio temp = cabeza.siguiente;

        while (temp != cabeza) {
            if (temp.vecesRepetido > masRepetido.vecesRepetido) {
                masRepetido = temp;
            }
            temp = temp.siguiente;
        }

        
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Anuncio más repetido: " + masRepetido.titulo +
                           " (" + masRepetido.vecesRepetido + " veces)");
        System.out.println("Tiempo total en pantalla: " + tiempoTotal + " segundos");
    }
}