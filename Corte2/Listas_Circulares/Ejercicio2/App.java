package Corte2.Listas_Circulares.Ejercicio2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carrusel carrusel = new Carrusel();
        int opcion;

        do {
            System.out.println("\n=== CARRUSEL DE ANUNCIOS ===");
            System.out.println("1. Agregar anuncio");
            System.out.println("2. Mostrar anuncios");
            System.out.println("3. Reproducir carrusel");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Duración (segundos): ");
                    int duracion = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Categoría: ");
                    String categoria = sc.nextLine();

                    carrusel.agregar(titulo, duracion, categoria);
                    break;

                case 2:
                    carrusel.mostrar();
                    break;

                case 3:
                    System.out.print("Número de ciclos: ");
                    int ciclos = sc.nextInt();
                    carrusel.reproducir(ciclos);
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
