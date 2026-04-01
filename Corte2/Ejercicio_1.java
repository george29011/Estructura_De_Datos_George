package Corte2;

public class Ejercicio_1 {

    public static void main(String[] args) {

        Tren tren = new Tren();

        tren.agregarVagon("Carbón", 20.5, "Colombia", "México");
        tren.agregarVagon("Acero", 15.0, "Brasil", "Argentina");
        tren.agregarVagon("Granos", 10.2, "Perú", "Chile");

        tren.mostrarTren();

        double total = tren.calcularPesoTotal();
        System.out.println("Peso total del tren: " + total + " toneladas");
    }
}

// 🔥 Clase Tren fuera del main
class Tren {
    private Vagon cabeza;

    public Tren() {
        cabeza = null;
    }

    public void agregarVagon(String contenido, double peso, String origen, String destino) {
        Vagon nuevo = new Vagon(contenido, peso, origen, destino);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Vagon actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public double calcularPesoTotal() {
        double total = 0;
        Vagon actual = cabeza;

        while (actual != null) {
            total += actual.pesoToneladas;
            actual = actual.siguiente;
        }

        return total;
    }

    public void mostrarTren() {
        Vagon actual = cabeza;

        while (actual != null) {
            System.out.println("Contenido: " + actual.contenido +
                    " | Peso: " + actual.pesoToneladas +
                    " | Origen: " + actual.origen +
                    " | Destino: " + actual.destino);
            actual = actual.siguiente;
        }
    }
}

// 🔥 Clase Vagon también fuera
class Vagon {
    String contenido;
    double pesoToneladas;
    String origen;
    String destino;

    Vagon siguiente;

    public Vagon(String contenido, double pesoToneladas, String origen, String destino) {
        this.contenido = contenido;
        this.pesoToneladas = pesoToneladas;
        this.origen = origen;
        this.destino = destino;
        this.siguiente = null;
    }
}