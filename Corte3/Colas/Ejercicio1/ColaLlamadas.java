package Corte3.Colas.Ejercicio1;
import java.util.LinkedList;
import java.util.Queue;

public class ColaLlamadas {

    private Queue<Llamada> cola;

    public ColaLlamadas() {
        cola = new LinkedList<>();
    }


    public void agregarLlamada(Llamada llamada) {
        cola.offer(llamada);
        System.out.println("Llamada agregada correctamente.");
    }

   
    public void atenderLlamada() {

        if (cola.isEmpty()) {
            System.out.println("No hay llamadas en espera.");
        } else {
            Llamada atendida = cola.poll();

            System.out.println("Atendiendo llamada:");
            System.out.println(atendida);
        }
    }

   
    public void mostrarLlamadas() {

        if (cola.isEmpty()) {
            System.out.println("No hay llamadas en espera.");
        } else {

            System.out.println("\n=== LLAMADAS EN ESPERA ===");

            for (Llamada llamada : cola) {
                System.out.println(llamada);
            }
        }
    }

 
    public int contarPorMotivo(String motivo) {

        int contador = 0;

        for (Llamada llamada : cola) {

            if (llamada.motivoConsulta.equalsIgnoreCase(motivo)) {
                contador++;
            }
        }

        return contador;
    }
}

