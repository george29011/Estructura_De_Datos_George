package Corte3.Colas.Ejercicio4;

import java.util.LinkedList;
import java.util.Queue;

public class Peaje {
    private Queue<Vehiculo> colaVehiculos = new LinkedList<>();

    public void registrarVehiculo(Vehiculo v) {
        colaVehiculos.add(v);
    }

    public void mostrarCola() {
        if (colaVehiculos.isEmpty()) {
            System.out.println("No hay vehículos en espera.");
        } else {
            System.out.println("Vehículos en cola:");
            for (Vehiculo v : colaVehiculos) {
                System.out.println(" - " + v);
            }
        }
    }

    public void cerrarTurno() {
        if (colaVehiculos.isEmpty()) {
            System.out.println("No hay vehículos para procesar.");
            return;
        }

        double total = 0;
        System.out.println("\n--- PROCESANDO VEHÍCULOS ---");
        while (!colaVehiculos.isEmpty()) {
            Vehiculo v = colaVehiculos.poll(); // extrae el primero
            System.out.println("Atendiendo: " + v);
            if (!v.isExento()) {
                total += v.getTarifa();
            }
        }
        System.out.println("\nTotal recaudado: $" + total);
    }
}
