package Corte3.Arboles.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Catalogo catalogo = new Catalogo();
        int opcion;

        do {
            System.out.println("\n*** MENÚ CATÁLOGO DIGITAL ***");
            System.out.println("1. Registrar libro");
            System.out.println("2. Verificar ISBN");
            System.out.println("3. Imprimir catálogo");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ISBN: ");
                    long isbn = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Año de publicación: ");
                    int anio = sc.nextInt();
                    sc.nextLine();

                    catalogo.insertar(isbn, titulo, autor, anio);
                    break;

                case 2:
                    System.out.print("Ingrese ISBN a verificar: ");
                    long buscarIsbn = sc.nextLong();
                    sc.nextLine();
                    boolean existe = catalogo.existeISBN(buscarIsbn);
                    System.out.println(existe ? "El ISBN ya está registrado." : "El ISBN no existe en el catálogo.");
                    break;

                case 3:
                    catalogo.imprimirCatalogo();
                    break;

                case 0:
                    System.out.println("Fin del sistema de biblioteca.");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
