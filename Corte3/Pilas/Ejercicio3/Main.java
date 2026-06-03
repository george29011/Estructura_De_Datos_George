package Corte3.Pilas.Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Callejon callejon = new Callejon();
        int opcion;

        do {
            System.out.println("\n*** MENÚ CALLEJÓN SIN SALIDA ***");
            System.out.println("1. Ingresar camión");
            System.out.println("2. Mostrar camiones en el callejón");
            System.out.println("3. Calcular carga total");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Placa: ");
                    String placa = sc.nextLine();
                    System.out.print("Conductor: ");
                    String conductor = sc.nextLine();
                    System.out.print("Carga en toneladas: ");
                    double carga = sc.nextDouble();
                    sc.nextLine();

                    callejon.ingresarCamion(new Camion(placa, conductor, carga));
                    System.out.println("Camión ingresado.");
                    break;

                case 2:
                    callejon.mostrarCamiones();
                    break;

                case 3:
                    double total = callejon.calcularCargaTotal();
                    System.out.println("Carga total en el callejón: " + total + " toneladas.");
                    break;

                case 0:
                    System.out.println("Fin del sistema de logística.");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}

