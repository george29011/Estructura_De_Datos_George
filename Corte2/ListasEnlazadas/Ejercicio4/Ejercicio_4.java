package Corte2.ListasEnlazadas.Ejercicio4;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HistorialLecturas historial = new HistorialLecturas();

        int opcion;

        do {
            System.out.println("\n=== MENÚ LECTURAS ===");
            System.out.println("1. Agregar lectura");
            System.out.println("2. Mostrar lecturas");
            System.out.println("3. Mayor temperatura");
            System.out.println("4. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID Sensor: ");
                    int id = sc.nextInt();

                    System.out.print("Temperatura: ");
                    double temp = sc.nextDouble();

                    System.out.print("Presión: ");
                    double presion = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Hora: ");
                    String hora = sc.nextLine();

                    historial.agregarLectura(id, temp, presion, hora);
                    System.out.println("Lectura agregada");
                    break;

                case 2:
                    historial.mostrarLecturas();
                    break;

                case 3:
                    historial.mayorTemperatura();
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