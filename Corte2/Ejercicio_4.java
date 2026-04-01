package Corte2;

public class Ejercicio_4 {

    public static void main(String[] args) {

        HistorialLecturas historial = new HistorialLecturas();

       
        historial.agregarLectura(1, 35.5, 1.2, "08:00");
        historial.agregarLectura(2, 40.2, 1.5, "09:00");
        historial.agregarLectura(3, 38.7, 1.3, "10:00");
        historial.agregarLectura(4, 42.1, 1.6, "11:00");

        System.out.println("=== HISTORIAL DE LECTURAS ===");
        historial.mostrarLecturas();

        System.out.println("\n=== LECTURA CON MAYOR TEMPERATURA ===");
        historial.mayorTemperatura();
    }
}


class HistorialLecturas {
    private Lectura cabeza;

    public HistorialLecturas() {
        cabeza = null;
    }

   
    public void agregarLectura(int idSensor, double temp, double presion, String hora) {
        Lectura nueva = new Lectura(idSensor, temp, presion, hora);

        nueva.siguiente = cabeza;
        cabeza = nueva;
    }

    
    public void mostrarLecturas() {
        Lectura actual = cabeza;

        while (actual != null) {
            System.out.println("Sensor: " + actual.idSensor +
                    " | Temp: " + actual.temperatura +
                    " | Presión: " + actual.presion +
                    " | Hora: " + actual.hora);
            actual = actual.siguiente;
        }
    }

    
    public void mayorTemperatura() {

        if (cabeza == null) {
            System.out.println("No hay lecturas registradas");
            return;
        }

        Lectura actual = cabeza;
        Lectura mayor = cabeza;

        while (actual != null) {
            if (actual.temperatura > mayor.temperatura) {
                mayor = actual;
            }
            actual = actual.siguiente;
        }

        System.out.println("Sensor: " + mayor.idSensor +
                " | Temp: " + mayor.temperatura +
                " | Presión: " + mayor.presion +
                " | Hora: " + mayor.hora);
    }
}


class Lectura {
    int idSensor;
    double temperatura;
    double presion;
    String hora;

    Lectura siguiente;

    public Lectura(int idSensor, double temperatura, double presion, String hora) {
        this.idSensor = idSensor;
        this.temperatura = temperatura;
        this.presion = presion;
        this.hora = hora;
        this.siguiente = null;
    }
}