package Corte3.Arboles.Ejercicio2;

public class Catalogo {
    private Libro raiz;

    
    public void insertar(long isbn, String titulo, String autor, int anio) {
        raiz = insertarRec(raiz, isbn, titulo, autor, anio);
    }

    private Libro insertarRec(Libro actual, long isbn, String titulo, String autor, int anio) {
        if (actual == null) {
            return new Libro(isbn, titulo, autor, anio);
        }
        if (isbn < actual.isbn) {
            actual.izquierda = insertarRec(actual.izquierda, isbn, titulo, autor, anio);
        } else if (isbn > actual.isbn) {
            actual.derecha = insertarRec(actual.derecha, isbn, titulo, autor, anio);
        } else {
            System.out.println("El ISBN " + isbn + " ya existe en el catálogo.");
        }
        return actual;
    }

    
    public boolean existeISBN(long isbn) {
        return existeRec(raiz, isbn);
    }

    private boolean existeRec(Libro actual, long isbn) {
        if (actual == null) return false;
        if (isbn == actual.isbn) return true;
        return isbn < actual.isbn ? existeRec(actual.izquierda, isbn) : existeRec(actual.derecha, isbn);
    }

    // Imprimir (InOrden)
    public void imprimirCatalogo() {
        System.out.println("\n--- INVENTARIO DE LIBROS ---");
        imprimirInOrden(raiz);
    }

    private void imprimirInOrden(Libro actual) {
        if (actual != null) {
            imprimirInOrden(actual.izquierda);
            System.out.println(actual);
            imprimirInOrden(actual.derecha);
        }
    }
}
