package Corte3.Colas.Ejercicio2;

import java.util.LinkedList;
import java.util.Queue;

public class SalaUrgencias {
    private Queue<Paciente> colaPacientes = new LinkedList<>();

    public void registrarPaciente(Paciente p) {
        colaPacientes.add(p);
    }

    public void mostrarPacientes() {
        if (colaPacientes.isEmpty()) {
            System.out.println("No hay pacientes en espera.");
        } else {
            System.out.println("Pacientes en espera:");
            for (Paciente p : colaPacientes) {
                System.out.println(" - " + p);
            }
        }
    }

    public void atenderTodos() {
        if (colaPacientes.isEmpty()) {
            System.out.println("No hay pacientes para atender.");
            return;
        }

        int contador = 0;
        System.out.println("\n--- ATENDIENDO PACIENTES ---");
        while (!colaPacientes.isEmpty()) {
            Paciente p = colaPacientes.poll(); 
            System.out.println("Atendiendo: " + p);
            contador++;
        }
        System.out.println("\nTotal de pacientes atendidos: " + contador);
    }
}
