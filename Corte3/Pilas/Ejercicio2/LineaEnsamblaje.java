package Corte3.Pilas.Ejercicio2;

import java.util.Stack;

public class LineaEnsamblaje {
    private Stack<Pieza> pilaPiezas = new Stack<>();

    public void agregarPieza(Pieza p) {
        pilaPiezas.push(p);
    }

    public void mostrarPiezas() {
        if (pilaPiezas.isEmpty()) {
            System.out.println("No hay piezas en la pila.");
        } else {
            System.out.println("Piezas en la pila:");
            for (Pieza p : pilaPiezas) {
                System.out.println(" - " + p);
            }
        }
    }

    public void limpiarHastaDefecto() {
        if (pilaPiezas.isEmpty()) {
            System.out.println("No hay piezas en la pila.");
            return;
        }

        System.out.println("\n--- LIMPIANDO HASTA DEFECTO ---");
        while (!pilaPiezas.isEmpty()) {
            Pieza p = pilaPiezas.pop();
            if (p.isDefectuosa()) {
                System.out.println("⚠️ Se encontró pieza defectuosa: " + p);
                break; // detener la línea
            } else {
                System.out.println("Pieza descartada: " + p);
            }
        }
    }
}
