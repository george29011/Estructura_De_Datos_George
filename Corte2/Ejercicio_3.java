package Corte2;

public class Ejercicio_3 {

    public static void main(String[] args) {

        ColaVuelos cola = new ColaVuelos();

        cola.agregarVuelo("AV123", "Avianca", 50, 120);
        cola.agregarVuelo("LA456", "Latam", 8, 100);
        cola.agregarVuelo("AA789", "American", 30, 150);
        cola.agregarVuelo("IB321", "Iberia", 5, 200); 

        System.out.println("=== COLA DE VUELOS ===");
        cola.mostrarVuelos();

        System.out.println("\n=== REPORTAR EMERGENCIA (AV123) ===");
        cola.reportarEmergencia("AV123");

        cola.mostrarVuelos();
    }
}


class ColaVuelos {
    private Vuelo cabeza;

    public ColaVuelos() {
        cabeza = null;
    }

   
    public void agregarVuelo(String numero, String aerolinea, int combustible, int pasajeros) {
        Vuelo nuevo = new Vuelo(numero, aerolinea, combustible, pasajeros);

      
        if (combustible < 10) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        } 
       
        else {
            if (cabeza == null) {
                cabeza = nuevo;
            } else {
                Vuelo actual = cabeza;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevo;
            }
        }
    }

   
    public void reportarEmergencia(String numeroVuelo) {

        
        if (cabeza == null || cabeza.numeroVuelo.equals(numeroVuelo)) {
            return;
        }

        Vuelo actual = cabeza;
        Vuelo anterior = null;

       
        while (actual != null && !actual.numeroVuelo.equals(numeroVuelo)) {
            anterior = actual;
            actual = actual.siguiente;
        }

        
        if (actual == null) {
            System.out.println("Vuelo no encontrado");
            return;
        }

     
        anterior.siguiente = actual.siguiente;

       
        actual.siguiente = cabeza;
        cabeza = actual;
    }

   
    public void mostrarVuelos() {
        Vuelo actual = cabeza;

        while (actual != null) {
            System.out.println("Vuelo: " + actual.numeroVuelo +
                    " | Aerolínea: " + actual.aerolinea +
                    " | Combustible: " + actual.combustibleRestante +
                    " | Pasajeros: " + actual.pasajeros);
            actual = actual.siguiente;
        }
    }
}


class Vuelo {
    String numeroVuelo;
    String aerolinea;
    int combustibleRestante;
    int pasajeros;

    Vuelo siguiente;

    public Vuelo(String numeroVuelo, String aerolinea, int combustibleRestante, int pasajeros) {
        this.numeroVuelo = numeroVuelo;
        this.aerolinea = aerolinea;
        this.combustibleRestante = combustibleRestante;
        this.pasajeros = pasajeros;
        this.siguiente = null;
    }
}