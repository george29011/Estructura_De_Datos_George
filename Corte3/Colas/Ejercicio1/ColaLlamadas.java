package Corte3.Colas.Ejercicio1;
import Corte3.Colas.Ejercicio1.Llamada;
import java.util.LinkedList;
import java.util.Queue;

public class CentroLlamadas {
    private Queue<Llamada> colaLlamadas = new LinkedList<>();

    public void agregarLlamada(Llamada llamada) {
        colaLlamadas.add(llamada);
    }

    public void mostrarCola() {
        if (colaLlamadas.isEmpty()) {
            System.out.println("No hay llamadas en espera.");
        } else {
            System.out.println("Llamadas en espera:");
            for (Llamada l : colaLlamadas) {
                System.out.println(" - " + l);
            }
        }
    }

    public int contarPorMotivo(String motivo) {
        int contador = 0;
        for (Llamada l : colaLlamadas) {
            if (l.getMotivoConsulta().equalsIgnoreCase(motivo)) {
                contador++;
            }
        }
        return contador;
    }
}

