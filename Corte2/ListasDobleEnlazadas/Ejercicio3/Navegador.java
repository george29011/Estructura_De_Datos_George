package Corte2.ListasDobleEnlazadas.Ejercicio3;

class Navegador {
    private Pestana cabeza = null;
    private Pestana cola = null;
    private Pestana actual = null;

    
    public void abrir(String titulo, String url, String hora) {
        Pestana nueva = new Pestana(titulo, url, hora);

        if (cabeza == null) {
            cabeza = cola = actual = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            cola = nueva;
            actual = nueva;
        }

        System.out.println("Pestaña abierta.");
    }

    
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("No hay pestañas abiertas.");
            return;
        }

        Pestana temp = cabeza;
        System.out.println("\n--- PESTAÑAS ---");

        while (temp != null) {
            String marca = (temp == actual) ? " <-- actual" : "";
            System.out.println(temp.tituloPagina + " | " + temp.url + marca);
            temp = temp.siguiente;
        }
    }

    
    public void siguiente() {
        if (actual == null || actual.siguiente == null) {
            System.out.println("No hay siguiente pestaña.");
        } else {
            actual = actual.siguiente;
            mostrarActual();
        }
    }

    
    public void anterior() {
        if (actual == null || actual.anterior == null) {
            System.out.println("No hay pestaña anterior.");
        } else {
            actual = actual.anterior;
            mostrarActual();
        }
    }

    
    public void mostrarActual() {
        if (actual == null) {
            System.out.println("Sin pestaña activa.");
        } else {
            System.out.println("Actual → " + actual.tituloPagina + " | " + actual.url);
        }
    }

   
    public void cerrarPestanaActual(String url) {
        if (cabeza == null) {
            System.out.println("No hay pestañas.");
            return;
        }

        Pestana temp = cabeza;

        
        while (temp != null && !temp.url.equals(url)) {
            temp = temp.siguiente;
        }

        if (temp == null) {
            System.out.println("No se encontró la pestaña.");
            return;
        }

        System.out.println("Cerrando: " + temp.tituloPagina);

        
        if (cabeza == cola) {
            cabeza = cola = actual = null;
        }
        
        else if (temp == cabeza) {
            cabeza = cabeza.siguiente;
            cabeza.anterior = null;
            actual = cabeza;
        }
        
        else if (temp == cola) {
            cola = cola.anterior;
            cola.siguiente = null;
            actual = cola;
        }
        
        else {
            temp.anterior.siguiente = temp.siguiente;
            temp.siguiente.anterior = temp.anterior;

           
            actual = temp.anterior;
        }
    }
}