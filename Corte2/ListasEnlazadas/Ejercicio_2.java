package Corte2.ListasEnlazadas;


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
            System.out.println("4. Salir");
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

                    estante.agregarProducto(nombre, cantidad, dias);
                    System.out.println("Producto agregado correctamente");
                    break;

                case 2:
                    System.out.println("\n=== TODOS LOS PRODUCTOS ===");
                    estante.mostrarProductos();
                    break;

                case 3:
                    System.out.println("\n=== PRODUCTOS POR VENCER (<5 días) ===");
                    estante.productosPorVencer();
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);

        sc.close();
    }

}


class Estante {
    private Producto cabeza;

    public Estante() {
        cabeza = null;
    }

    
    public void agregarProducto(String nombre, int cantidad, int dias) {
        Producto nuevo = new Producto(nombre, cantidad, dias);

        
        if (dias < 3) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        } 
       
        else {
            if (cabeza == null) {
                cabeza = nuevo;
            } else {
                Producto actual = cabeza;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevo;
            }
        }
    }

    
    public void mostrarProductos() {
        Producto actual = cabeza;

        while (actual != null) {
            System.out.println("Nombre: " + actual.nombre +
                    " | Cantidad: " + actual.cantidad +
                    " | Días para vencer: " + actual.diasParaVencer);
            actual = actual.siguiente;
        }
    }

    
    public void productosPorVencer() {
        Producto actual = cabeza;

        while (actual != null) {
            if (actual.diasParaVencer < 5) {
                System.out.println("Nombre: " + actual.nombre +
                        " | Cantidad: " + actual.cantidad +
                        " | Días para vencer: " + actual.diasParaVencer);
            }
            actual = actual.siguiente;
        }
    }
}


class Producto {
    String nombre;
    int cantidad;
    int diasParaVencer;

    Producto siguiente;

    public Producto(String nombre, int cantidad, int diasParaVencer) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.diasParaVencer = diasParaVencer;
        this.siguiente = null;
    }
}