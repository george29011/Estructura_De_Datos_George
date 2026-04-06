package Corte2.ListasEnlazadas.Ejercicio3;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ColaVuelos cola = new ColaVuelos();

        int opcion;

        do {
            System.out.println("\n=== MENÚ VUELOS ===");
            System.out.println("1. Agregar vuelo");
            System.out.println("2. Mostrar vuelos");
            System.out.println("3. Reportar emergencia");
            System.out.println("4. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Número de vuelo: ");
                    String numero = sc.nextLine();

                    System.out.print("Aerolínea: ");
                    String aerolinea = sc.nextLine();

                    System.out.print("Combustible restante: ");
                    int combustible = sc.nextInt();

                    System.out.print("Pasajeros: ");
                    int pasajeros = sc.nextInt();
                    sc.nextLine();

                    cola.agregarVuelo(numero, aerolinea, combustible, pasajeros);
                    System.out.println("Vuelo agregado");
                    break;

                case 2:
                    cola.mostrarVuelos();
                    break;

                case 3:
                    System.out.print("Número de vuelo en emergencia: ");
                    String emergencia = sc.nextLine();
                    cola.reportarEmergencia(emergencia);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);

        sc.close();
    }
}