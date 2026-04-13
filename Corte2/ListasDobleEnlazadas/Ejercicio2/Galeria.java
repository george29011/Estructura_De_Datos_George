package Corte2.ListasDobleEnlazadas.Ejercicio2;

class Galeria {
    private Fotografia cabeza = null;
    private Fotografia actual = null;

    
    public void agregar(String nombre, double tamano, String resolucion) {
        Fotografia nueva = new Fotografia(nombre, tamaño, resolucion);

        if (cabeza == null) {
            cabeza = nueva;
            actual = nueva;
        } else {
            Fotografia temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nueva;
            nueva.anterior = temp;
        }
    }

   
    public void mostrarActual() {
        if (actual == null) {
            System.out.println("No hay fotos.");
        } else {
            System.out.println("Foto actual:");
            System.out.println("Archivo: " + actual.nombreArchivo +
                               " | Tamaño: " + actual.tamañoMB + " MB" +
                               " | Resolución: " + actual.resolucion);
        }
    }

    
    public void siguiente() {
        if (actual == null) {
            System.out.println("No hay fotos.");
            return;
        }

        if (actual.siguiente == null) {
            System.out.println("Ya estás en la última foto.");
        } else {
            actual = actual.siguiente;
            mostrarActual();
        }
    }

    
    public void anterior() {
        if (actual == null) {
            System.out.println("No hay fotos.");
            return;
        }

        if (actual.anterior == null) {
            System.out.println("Ya estás en la primera foto.");
        } else {
            actual = actual.anterior;
            mostrarActual();
        }
    }

    
    public void reproducirGaleria() {
        if (cabeza == null) {
            System.out.println("Galería vacía.");
            return;
        }

        Fotografia temp = cabeza;

        System.out.println("\n--- RECORRIDO HACIA ADELANTE ---");
        while (temp != null) {
            System.out.println("Archivo: " + temp.nombreArchivo +
                               " | Tamaño: " + temp.tamañoMB + " MB" +
                               " | Resolución: " + temp.resolucion);
            temp = temp.siguiente;
        }

        
        Fotografia ultimo = cabeza;
        while (ultimo.siguiente != null) {
            ultimo = ultimo.siguiente;
        }

        System.out.println("\n--- RECORRIDO HACIA ATRÁS ---");
        while (ultimo != null) {
            System.out.println("Archivo: " + ultimo.nombreArchivo +
                               " | Tamaño: " + ultimo.tamañoMB + " MB" +
                               " | Resolución: " + ultimo.resolucion);
            ultimo = ultimo.anterior;
        }
    }
}