package Corte2.ListasDobleEnlazadas.Ejercicio1;

class Historial {
    private Cambio cabeza = null;
    private Cambio actual = null;

    
    public void agregarCambio(String texto, String tipoOperacion) {
        Cambio nuevo = new Cambio(texto, tipoOperacion);

        if (cabeza == null) {
            cabeza = nuevo;
            actual = nuevo;
        } else {
          
            if (actual.siguiente != null) {
                actual.siguiente.anterior = null;
                actual.siguiente = null;
            }

            actual.siguiente = nuevo;
            nuevo.anterior = actual;
            actual = nuevo;
        }

        System.out.println("Cambio agregado.");
    }

    
    public void deshacer() {
        if (actual == null) {
            System.out.println("No hay cambios.");
            return;
        }

        if (actual.anterior == null) {
            System.out.println("No se puede deshacer más.");
        } else {
            actual = actual.anterior;
            System.out.println("Deshecho → " + actual.tipoOperacion + ": " + actual.texto);
        }
    }

    
    public void rehacer() {
        if (actual == null) {
            System.out.println("No hay cambios.");
            return;
        }

        if (actual.siguiente == null) {
            System.out.println("No se puede rehacer.");
        } else {
            actual = actual.siguiente;
            System.out.println("Rehecho → " + actual.tipoOperacion + ": " + actual.texto);
        }
    }

   
    public void mostrarHistorial() {
        if (cabeza == null) {
            System.out.println("Historial vacío.");
            return;
        }

        Cambio temp = cabeza;
        System.out.println("\n--- HISTORIAL ---");

        while (temp != null) {
            String marcador = (temp == actual) ? " <-- actual" : "";
            System.out.println(temp.tipoOperacion + ": " + temp.texto + marcador);
            temp = temp.siguiente;
        }
    }

    
    public void mostrarActual() {
        if (actual == null) {
            System.out.println("Sin contenido.");
        } else {
            System.out.println("Actual → " + actual.tipoOperacion + ": " + actual.texto);
        }
    }
}