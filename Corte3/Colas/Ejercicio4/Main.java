package Corte3.Colas.Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Peaje peaje = new Peaje();
        int opcion;

        do {
            System.out.println("\n*** MENÚ PEAJE INTELIGENTE ***");
            System.out.println("1. Registrar vehículo");
            System.out.println("2. Mostrar vehículos en cola");
            System.out.println("3. Cerrar turno (procesar todos)");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Placa: ");
                    String placa = sc.nextLine();
                    System.out.print("Tipo de vehículo: ");
                    String tipo = sc.nextLine();
                    System.out.print("Tarifa: ");
                    double tarifa = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("¿Es exento? (true/false): ");
                    boolean exento = sc.nextBoolean();
                    sc.nextLine();

                    peaje.registrarVehiculo(new Vehiculo(placa, tipo, tarifa, exento));
                    System.out.println("✅ Vehículo registrado.");
                    break;

                case 2:
                    peaje.mostrarCola();
                    break;

                case 3:
                    peaje.cerrarTurno();
                    break;

                case 0:
                    System.out.println("Fin del sistema de peaje.");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}

