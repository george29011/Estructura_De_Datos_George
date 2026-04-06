package Corte2.ListasEnlazadas.Ejercicio1;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Clase_tren tren = new Clase_tren();
        int opcion;

        do {
            System.out.println("\n===== MENÚ TREN =====");
            System.out.println("1. Agregar vagón");
            System.out.println("2. Mostrar tren");
            System.out.println("3. Calcular peso total");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Contenido: ");
                    String contenido = sc.nextLine();

                    System.out.print("Peso (toneladas): ");
                    double peso = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Origen: ");
                    String origen = sc.nextLine();

                    System.out.print("Destino: ");
                    String destino = sc.nextLine();

                    tren.agregarVagon(contenido, peso, origen, destino);
                    System.out.println("Vagón agregado correctamente.");
                    break;

                case 2:
                    tren.mostrarTren();
                    break;

                case 3:
                    double total = tren.calcularPesoTotal();
                    System.out.println("Peso total: " + total + " toneladas");
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}