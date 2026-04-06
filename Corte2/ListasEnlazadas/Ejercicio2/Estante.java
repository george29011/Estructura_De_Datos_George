package Corte2.ListasEnlazadas.Ejercicio2;

public class Estante {
    private Producto cabeza;

    public Estante() {
        cabeza = null;
    }

    public void agregarProducto(String nombre, int cantidad, int dias) {
        Producto nuevo = new Producto(nombre, cantidad, dias);

        // Prioridad si está por vencer pronto
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
            System.out.println("La lista está vacía");
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