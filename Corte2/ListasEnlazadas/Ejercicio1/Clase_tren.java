package Corte2.ListasEnlazadas.Ejercicio1;

import Corte2.ListasEnlazadas.Ejercicio1.Vagon;

public class Clase_tren {
    private Vagon cabeza;

    public Clase_tren() {
        cabeza = null;
    }

    public void agregarVagon(String contenido, double peso, String origen, String destino) {
        Vagon nuevo = new Vagon(contenido, peso, origen, destino);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Vagon actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public double calcularPesoTotal() {
        double total = 0;
        Vagon actual = cabeza;

        while (actual != null) {
            total += actual.pesoToneladas;
            actual = actual.siguiente;
        }

        return total;
    }

    public void mostrarTren() {
        if (cabeza == null) {
            System.out.println("El tren está vacío.");
            return;
        }

        Vagon actual = cabeza;

        while (actual != null) {
            System.out.println("Contenido: " + actual.contenido +
                    " | Peso: " + actual.pesoToneladas +
                    " | Origen: " + actual.origen +
                    " | Destino: " + actual.destino);
            actual = actual.siguiente;
        }
    }
}