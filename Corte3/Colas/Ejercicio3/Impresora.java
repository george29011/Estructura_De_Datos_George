package Corte3.Colas.Ejercicio3;

import java.util.LinkedList;
import java.util.Queue;

public class Impresora {
    private Queue<Documento> colaImpresion = new LinkedList<>();

    public void agregarDocumento(Documento doc) {
        colaImpresion.add(doc);
    }

    public void mostrarCola() {
        if (colaImpresion.isEmpty()) {
            System.out.println("No hay documentos en la cola.");
        } else {
            System.out.println("Documentos en cola:");
            for (Documento d : colaImpresion) {
                System.out.println(" - " + d);
            }
        }
    }

    public int calcularPaginasTotales() {
        int total = 0;
        for (Documento d : colaImpresion) {
            total += d.getNumeroPaginas();
        }
        return total;
    }
}

