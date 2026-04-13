package Corte2.Listas_Circulares.Ejercicio1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sorteo sorteo = new Sorteo();
        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE RIFA ===");
            System.out.println("1. Agregar participante");
            System.out.println("2. Mostrar participantes");
            System.out.println("3. Realizar sorteo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Número de boleta: ");
                    int boleta = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Ciudad: ");
                    String ciudad = sc.nextLine();

                    sorteo.agregar(nombre, boleta, ciudad);
                    break;

                case 2:
                    sorteo.mostrar();
                    break;

                case 3:
                    System.out.print("Ingrese número de pasos: ");
                    int pasos = sc.nextInt();
                    sorteo.realizarSorteo(pasos);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}