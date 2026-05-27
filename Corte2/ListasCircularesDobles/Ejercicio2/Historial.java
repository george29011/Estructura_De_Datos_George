package Corte2.ListasCircularesDobles.Ejercicio2;

class Historial {
    private Comando cabeza;
    private Comando cursor;

    
    public void agregar(String texto, boolean exitoso, String dir) {
        Comando nuevo = new Comando(texto, exitoso, dir);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
            cursor = cabeza;
        } else {
            Comando ultimo = cabeza.anterior;

            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;

            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
        }
    }


    public void arriba() {
        if (cursor != null) {
            cursor = cursor.anterior;
        }
    }

 
    public void abajo() {
        if (cursor != null) {
            cursor = cursor.siguiente;
        }
    }

   
    public void mostrarCursor() {
        if (cursor == null) {
            System.out.println("Historial vacío.");
        } else {
            System.out.println(">> " + cursor.texto +
                " | dir: " + cursor.directorio +
                " | ok: " + cursor.exitoso);
        }
    }

  
    public void eliminarActual() {
        if (cursor == null) return;

     
        if (cursor.siguiente == cursor) {
            cabeza = null;
            cursor = null;
            return;
        }

        Comando anterior = cursor.anterior;
        Comando siguiente = cursor.siguiente;

        anterior.siguiente = siguiente;
        siguiente.anterior = anterior;

     
        if (cursor == cabeza) {
            cabeza = siguiente;
        }

     
        cursor = siguiente;
    }

   
    public void mostrarHistorial() {
        if (cabeza == null) {
            System.out.println("Historial vacío.");
            return;
        }

        Comando actual = cabeza;

        do {
            if (actual == cursor) {
                System.out.println(" [" + actual.texto + "]");
            } else {
                System.out.println("   " + actual.texto);
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
    }
}