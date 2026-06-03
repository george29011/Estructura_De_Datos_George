package Corte3.Colas.Ejercicio5;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bodega bodega = new Bodega();
        int opcion;

        do {
            System.out.println("\n*** MENÚ FÁBRICA DE PEDIDOS ***");
            System.out.println("1. Registrar pedido");
            System.out.println("2. Mostrar pedidos en cola");
            System.out.println("3. Procesar pedidos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Número de pedido: ");
                    String numero = sc.nextLine();
                    System.out.print("Cliente: ");
                    String cliente = sc.nextLine();
                    System.out.print("Total a pagar: ");
                    double total = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("¿Cancelado? (true/false): ");
                    boolean cancelado = sc.nextBoolean();
                    sc.nextLine();

                    bodega.registrarPedido(new Pedido(numero, cliente, total, cancelado));
                    System.out.println(" Pedido registrado.");
                    break;

                case 2:
                    bodega.mostrarCola();
                    break;

                case 3:
                    bodega.procesarPedidos();
                    break;

                case 0:
                    System.out.println("Fin del sistema de pedidos.");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
