package Corte3.Arboles.Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nomina nomina = new Nomina();
        int opcion;

        do {
            System.out.println("\n*** MENÚ SISTEMA DE NÓMINA ***");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Buscar empleado con cédula mínima");
            System.out.println("3. Buscar empleado con cédula máxima");
            System.out.println("4. Reporte de eficiencia");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Cédula: ");
                    long cedula = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Nombre completo: ");
                    String nombre = sc.nextLine();
                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();
                    System.out.print("Salario: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();

                    nomina.insertar(cedula, nombre, cargo, salario);
                    break;

                case 2:
                    nomina.buscarMinimo();
                    break;

                case 3:
                    nomina.buscarMaximo();
                    break;

                case 4:
                    nomina.reporteEficiencia();
                    break;

                case 0:
                    System.out.println("Fin del sistema de nómina.");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
