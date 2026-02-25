public class Ejercicio_3 {
public static void main(String[] args) {
        double temperaturaActual;
        String nombreSensor;
        int numeroLectura;
        boolean enAlarma;

         temperaturaActual = 85.5;
        nombreSensor = "Sensor_Temperatura_A1";
        numeroLectura = 102;

        enAlarma = temperaturaActual > 80;

        System.out.println("=== Estado del Sensor ===");
        System.out.println("Nombre del sensor: " + nombreSensor);
        System.out.println("Número de lectura: " + numeroLectura);
        System.out.println("Temperatura actual: " + temperaturaActual + " °C");
        System.out.println("En alarma: " + enAlarma);
  }
}
