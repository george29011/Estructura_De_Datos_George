package Corte2.ListasCircularesDobles.Ejercicio1;

class MetroCircular {
    private Estacion cabeza;

   
    public void agregarEstacion(String nombre, int zona, int pasajeros) {
        Estacion nueva = new Estacion(nombre, zona, pasajeros);

        if (cabeza == null) {
            cabeza = nueva;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
        } else {
            Estacion ultima = cabeza.anterior;

            ultima.siguiente = nueva;
            nueva.anterior = ultima;

            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
        }
    }

    
    private Estacion buscar(String nombre) {
        if (cabeza == null) return null;

        Estacion actual = cabeza;
        do {
            if (actual.nombre.equalsIgnoreCase(nombre)) {
                return actual;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        return null;
    }

    
    public void rutaMasCorta(String origen, String destino) {
        Estacion inicio = buscar(origen);
        Estacion fin = buscar(destino);

        if (inicio == null || fin == null) {
            System.out.println("Una o ambas estaciones no existen.");
            return;
        }

        
        int pasosAdelante = 0;
        StringBuilder rutaAdelante = new StringBuilder();
        Estacion actual = inicio;

        do {
            rutaAdelante.append(actual.nombre).append(" -> ");
            if (actual == fin) break;
            actual = actual.siguiente;
            pasosAdelante++;
        } while (actual != inicio);

        rutaAdelante.append(fin.nombre);

        
        int pasosAtras = 0;
        StringBuilder rutaAtras = new StringBuilder();
        actual = inicio;

        do {
            rutaAtras.append(actual.nombre).append(" -> ");
            if (actual == fin) break;
            actual = actual.anterior;
            pasosAtras++;
        } while (actual != inicio);

        rutaAtras.append(fin.nombre);

        
        System.out.println("Ruta hacia adelante:");
        System.out.println(rutaAdelante + " | Paradas: " + pasosAdelante);

        System.out.println("\nRuta hacia atrás:");
        System.out.println(rutaAtras + " | Paradas: " + pasosAtras);

        
        System.out.println("\nResultado:");
        if (pasosAdelante < pasosAtras) {
            System.out.println("La ruta más corta es hacia adelante.");
        } else if (pasosAtras < pasosAdelante) {
            System.out.println("La ruta más corta es hacia atrás.");
        } else {
            System.out.println("Ambas rutas tienen la misma cantidad de paradas.");
        }
    }
}