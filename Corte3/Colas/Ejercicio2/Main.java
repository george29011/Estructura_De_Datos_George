package Corte3.Colas.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SalaUrgencias sala = new SalaUrgencias();
        int opcion;

        do {
            System.out.println("\n*** MENÚ URGENCIAS HOSPITALARIAS ***");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Mostrar pacientes en espera");
            System.out.println("3. Atender todos los pacientes");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Cédula: ");
                    String cedula = sc.nextLine();
                    System.out.print("Nombre completo: ");
                    String nombre = sc.nextLine();
                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Síntoma principal: ");
                    String sintoma = sc.nextLine();

                    sala.registrarPaciente(new Paciente(cedula, nombre, edad, sintoma));
                    System.out.println("✅ Paciente registrado.");
                    break;

                case 2:
                    sala.mostrarPacientes();
                    break;

                case 3:
                    sala.atenderTodos();
                    break;

                case 0:
                    System.out.println("Fin del turno. Cerrando sistema...");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
