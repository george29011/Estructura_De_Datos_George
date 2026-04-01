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
                    System.out.println("\n=== TODOS LOS PRODUCTOS ===");
                    estante.mostrarProductos();
                    break;

                case 3:
                    System.out.println("\n=== PRODUCTOS POR VENCER (<5 días) ===");
                    estante.productosPorVencer();
                    break;

                case 4:
                    System.out.println("\n=== LISTA ACTUAL ===");
                    estante.mostrarProductos();

                    System.out.print("\nIngrese el nombre del producto a eliminar: ");
                    String nombreEliminar = sc.nextLine();

                    estante.eliminarProducto(nombreEliminar);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 5);

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
        } else {
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
        if (cabeza == null) {
            System.out.println("No hay productos en el estante");
            return;
        }

        Producto actual = cabeza;

        while (actual != null) {
            System.out.println("Nombre: " + actual.nombre +
                    " | Cantidad: " + actual.cantidad +
                    " | Días para vencer: " + actual.diasParaVencer);
            actual = actual.siguiente;
        }
    }

    public void productosPorVencer() {
        if (cabeza == null) {
            System.out.println("No hay productos");
            return;
        }

        Producto actual = cabeza;
        boolean hay = false;

        while (actual != null) {
            if (actual.diasParaVencer < 5) {
                System.out.println("Nombre: " + actual.nombre +
                        " | Cantidad: " + actual.cantidad +
                        " | Días para vencer: " + actual.diasParaVencer);
                hay = true;
            }
            actual = actual.siguiente;
        }

        if (!hay) {
            System.out.println("No hay productos próximos a vencer");
        }
    }

    public void eliminarProducto(String nombre) {
        if (cabeza == null) {
            System.out.println("⚠️ La lista está vacía");
            return;
        }

        
        if (cabeza.nombre.equalsIgnoreCase(nombre)) {
            cabeza = cabeza.siguiente;
            System.out.println("Producto eliminado");
            return;
        }

        Producto actual = cabeza;

        while (actual.siguiente != null) {
            if (actual.siguiente.nombre.equalsIgnoreCase(nombre)) {
                actual.siguiente = actual.siguiente.siguiente;
                System.out.println("Producto eliminado");
                return;
            }
            actual = actual.siguiente;
        }

        System.out.println("Producto no encontrado");
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