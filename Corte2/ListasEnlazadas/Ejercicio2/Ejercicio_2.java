package Corte2.ListasEnlazadas.Ejercicio2;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Estante estante = new Estante();

        int opcion;

        do {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Productos por vencer (<5 días)");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombre = sc.nextLine();

                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();

                    System.out.print("Días para vencer: ");
                    int dias = sc.nextInt();
                    sc.nextLine();

                    estante.agregarProducto(nombre, cantidad, dias);
                    System.out.println("Producto agregado correctamente");
                    break;

                case 2:
                    estante.mostrarProductos();
                    break;

                case 3:
                    estante.productosPorVencer();
                    break;

                case 4:
                    estante.mostrarProductos();
                    System.out.print("Nombre del producto a eliminar: ");
                    String eliminar = sc.nextLine();
                    estante.eliminarProducto(eliminar);
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 5);

        sc.close();
    }
}