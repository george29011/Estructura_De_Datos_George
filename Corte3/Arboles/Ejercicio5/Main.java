package Corte3.Arboles.Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();
        int opcion;

        do {
            System.out.println("\n*** MENÚ CONTROL DE INVENTARIO ***");
            System.out.println("1. Registrar repuesto");
            System.out.println("2. Backup PreOrden");
            System.out.println("3. Reporte repuestos únicos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Código de referencia: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Descripción: ");
                    String descripcion = sc.nextLine();
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Stock: ");
                    int stock = sc.nextInt();
                    sc.nextLine();

                    inventario.insertar(codigo, descripcion, marca, stock);
                    break;

                case 2:
                    inventario.backupPreOrden();
                    break;

                case 3:
                    inventario.reporteRepuestosUnicos();
                    break;

                case 0:
                    System.out.println("Fin del sistema de inventario.");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
