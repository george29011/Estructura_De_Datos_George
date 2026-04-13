package Corte2.ListasDobleEnlazadas.Ejercicio1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Historial historial = new Historial();
        int opcion;

        do {
            System.out.println("\n=== EDITOR CON UNDO/REDO ===");
            System.out.println("1. Escribir");
            System.out.println("2. Borrar");
            System.out.println("3. Deshacer");
            System.out.println("4. Rehacer");
            System.out.println("5. Mostrar historial");
            System.out.println("6. Mostrar actual");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Texto a escribir: ");
                    String textoE = sc.nextLine();
                    historial.agregarCambio(textoE, "Escribir");
                    break;

                case 2:
                    System.out.print("Texto a borrar: ");
                    String textoB = sc.nextLine();
                    historial.agregarCambio(textoB, "Borrar");
                    break;

                case 3:
                    historial.deshacer();
                    break;

                case 4:
                    historial.rehacer();
                    break;

                case 5:
                    historial.mostrarHistorial();
                    break;

                case 6:
                    historial.mostrarActual();
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
