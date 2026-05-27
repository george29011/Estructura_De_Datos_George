package Corte3.Colas.Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Impresora impresora = new Impresora();
        int opcion;

        do {
            System.out.println("\n*** MENÚ IMPRESORA COMPARTIDA ***");
            System.out.println("1. Agregar documento");
            System.out.println("2. Mostrar cola de impresión");
            System.out.println("3. Calcular páginas totales pendientes");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del archivo: ");
                    String archivo = sc.nextLine();
                    System.out.print("Usuario: ");
                    String usuario = sc.nextLine();
                    System.out.print("Número de páginas: ");
                    int paginas = sc.nextInt();
                    sc.nextLine();
                    System.out.print("¿Es a color? (true/false): ");
                    boolean color = sc.nextBoolean();
                    sc.nextLine();

                    impresora.agregarDocumento(new Documento(archivo, usuario, paginas, color));
                    System.out.println("✅ Documento agregado a la cola.");
                    break;

                case 2:
                    impresora.mostrarCola();
                    break;

                case 3:
                    int total = impresora.calcularPaginasTotales();
                    System.out.println("Total de páginas pendientes: " + total);
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}

