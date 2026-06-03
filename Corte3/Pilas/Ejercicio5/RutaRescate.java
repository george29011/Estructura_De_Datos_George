package Corte3.Pilas.Ejercicio5;

import java.util.Stack;

public class RutaRescate {
    private Stack<Estacion> pilaEstaciones = new Stack<>();

    public void agregarEstacion(Estacion e) {
        pilaEstaciones.push(e);
    }

    public void mostrarEstaciones() {
        if (pilaEstaciones.isEmpty()) {
            System.out.println("No hay estaciones registradas.");
        } else {
            System.out.println("Estaciones registradas:");
            for (Estacion e : pilaEstaciones) {
                System.out.println(" - " + e);
            }
        }
    }

    public void retrocederASuperficie() {
        if (pilaEstaciones.isEmpty()) {
            System.out.println("No hay estaciones para retroceder.");
            return;
        }

        System.out.println("\n--- RETROCESO A SUPERFICIE ---");
        while (!pilaEstaciones.isEmpty()) {
            Estacion e = pilaEstaciones.pop();
            System.out.println("Pasando por: " + e);
            if (e.getNivelOxigeno() < 18) {
                System.out.println("ALERTA: Uso de Tanque de Emergencia Requerido en " + e);
            }
        }
        System.out.println("El equipo ha salido a la superficie.");
    }
}
