package Corte3.Pilas.Ejercicio4;

import java.util.Stack;

public class Dispensador {
    private Stack<Medicamento> pilaMedicamentos = new Stack<>();

    public void agregarMedicamento(Medicamento m) {
        pilaMedicamentos.push(m);
    }

    public void mostrarMedicamentos() {
        if (pilaMedicamentos.isEmpty()) {
            System.out.println("No hay medicamentos en el dispensador.");
        } else {
            System.out.println("Medicamentos en el dispensador:");
            for (Medicamento m : pilaMedicamentos) {
                System.out.println(" - " + m);
            }
        }
    }

    public void validarDespacho() {
        if (pilaMedicamentos.isEmpty()) {
            System.out.println("No hay medicamentos para despachar.");
            return;
        }

        System.out.println("\n--- VALIDANDO DESPACHO ---");
        while (!pilaMedicamentos.isEmpty()) {
            Medicamento m = pilaMedicamentos.peek(); 
            if (m.getDiasParaVencer() < 10) {
                System.out.println("Medicamento retirado por seguridad: " + pilaMedicamentos.pop());
            } else {
                System.out.println("Medicamento seguro para despacho: " + m);
                break; 
            }
        }

        if (pilaMedicamentos.isEmpty()) {
            System.out.println("No quedaron medicamentos aptos para despacho.");
        }
    }
}
