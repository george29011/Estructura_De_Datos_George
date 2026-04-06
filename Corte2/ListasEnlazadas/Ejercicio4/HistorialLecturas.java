package Corte2.ListasEnlazadas.Ejercicio4;

public class HistorialLecturas {
    private Lectura cabeza;

    public HistorialLecturas() {
        cabeza = null;
    }

    // Inserta al inicio (tipo pila)
    public void agregarLectura(int idSensor, double temp, double presion, String hora) {
        Lectura nueva = new Lectura(idSensor, temp, presion, hora);
        nueva.siguiente = cabeza;
        cabeza = nueva;
    }

    public void mostrarLecturas() {
        if (cabeza == null) {
            System.out.println("No hay lecturas registradas");
            return;
        }

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