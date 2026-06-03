package Corte3.Pilas.Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RutaRescate ruta = new RutaRescate();
        int opcion;

        do {
            System.out.println("\n*** MENÚ RUTA DE RESCATE ***");
            System.out.println("1. Registrar estación");
            System.out.println("2. Mostrar estaciones");
            System.out.println("3. Retroceder a superficie");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del punto: ");
                    String nombre = sc.nextLine();
                    System.out.print("Profundidad (m): ");
                    int profundidad = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nivel de oxígeno (%): ");
                    double oxigeno = sc.nextDouble();
                    sc.nextLine();

                    ruta.agregarEstacion(new Estacion(nombre, profundidad, oxigeno));
                    System.out.println("Estación registrada.");
                    break;

                case 2:
                    ruta.mostrarEstaciones();
                    break;

                case 3:
                    ruta.retrocederASuperficie();
                    break;

                case 0:
                    System.out.println("Fin del sistema de rescate.");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
