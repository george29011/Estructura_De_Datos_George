package Corte3.Pilas.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LineaEnsamblaje linea = new LineaEnsamblaje();
        int opcion;

        do {
            System.out.println("\n*** MENÚ CONTROL DE CALIDAD ***");
            System.out.println("1. Agregar pieza");
            System.out.println("2. Mostrar piezas en pila");
            System.out.println("3. Limpiar hasta defecto");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la pieza: ");
                    String nombre = sc.nextLine();
                    System.out.print("Número de serie: ");
                    String serie = sc.nextLine();
                    System.out.print("¿Es defectuosa? (true/false): ");
                    boolean defectuosa = sc.nextBoolean();
                    sc.nextLine();

                    linea.agregarPieza(new Pieza(nombre, serie, defectuosa));
                    System.out.println("Pieza agregada.");
                    break;

                case 2:
                    linea.mostrarPiezas();
                    break;

                case 3:
                    linea.limpiarHastaDefecto();
                    break;

                case 0:
                    System.out.println("Fin del control de calidad.");
                    break;

                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
