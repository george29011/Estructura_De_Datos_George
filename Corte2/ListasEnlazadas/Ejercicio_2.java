package Corte2.ListasEnlazadas;

public class Ejercicio_2 {

    public static void main(String[] args) {

        Estante estante = new Estante();

       
        estante.agregarProducto("Leche", 10, 2);      // va al inicio
        estante.agregarProducto("Queso", 5, 7);       // va al final
        estante.agregarProducto("Yogurt", 8, 1);      // va al inicio
        estante.agregarProducto("Mantequilla", 4, 6); // va al final
        estante.agregarProducto("Crema", 6, 4);       // va al final

        System.out.println("=== TODOS LOS PRODUCTOS ===");
        estante.mostrarProductos();

        System.out.println("\n=== PRODUCTOS POR VENCER (<5 días) ===");
        estante.productosPorVencer();
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