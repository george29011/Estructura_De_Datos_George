package Corte3.Colas.Ejercicio5;


import java.util.LinkedList;
import java.util.Queue;

public class Bodega {
    private Queue<Pedido> colaPedidos = new LinkedList<>();

    public void registrarPedido(Pedido p) {
        colaPedidos.add(p);
    }

    public void mostrarCola() {
        if (colaPedidos.isEmpty()) {
            System.out.println("No hay pedidos en espera.");
        } else {
            System.out.println("Pedidos en cola:");
            for (Pedido p : colaPedidos) {
                System.out.println(" - " + p);
            }
        }
    }

    public void procesarPedidos() {
        if (colaPedidos.isEmpty()) {
            System.out.println("No hay pedidos para procesar.");
            return;
        }

        int cancelados = 0;
        int despachados = 0;
        double totalDespachado = 0;

        System.out.println("\n--- PROCESANDO PEDIDOS ---");
        while (!colaPedidos.isEmpty()) {
            Pedido p = colaPedidos.poll(); 
            if (p.isCancelado()) {
                System.out.println(" Pedido cancelado: " + p);
                cancelados++;
            } else {
                System.out.println(" Pedido despachado: " + p);
                despachados++;
                totalDespachado += p.getTotalPagar();
            }
        }

        System.out.println("\nResumen del turno:");
        System.out.println("Total despachados: " + despachados + " | Valor total: $" + totalDespachado);
        System.out.println("Total cancelados: " + cancelados);
    }
}
