package Corte3.Pilas.Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dispensador dispensador = new Dispensador();
        int opcion;

        do {
            System.out.println("\n*** MENÚ FARMACIA AUTOMATIZADA ***");
            System.out.println("1. Agregar medicamento");
            System.out.println("2. Mostrar medicamentos en dispensador");
            System.out.println("3. Validar despacho");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del medicamento: ");
                    String nombre = sc.nextLine();
                    System.out.print("Lote: ");
                    String lote = sc.nextLine();
                    System.out.print("Días para vencer: ");
                    int dias = sc.nextInt();
                    sc.nextLine();

                    dispensador.agregarMedicamento(new Medicamento(nombre, lote, dias));
                    System.out.println("Medicamento agregado.");
                    break;

                case 2:
                    dispensador.mostrarMedicamentos();
                    break;

                case 3:
                    dispensador.validarDespacho();
                    break;

                case 0:
                    System.out.println("Fin del sistema de farmacia.");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
