package Corte3.Pilas.Ejercicio3;

import java.util.Stack;

public class Callejon {
    private Stack<Camion> pilaCamiones = new Stack<>();

    public void ingresarCamion(Camion c) {
        pilaCamiones.push(c);
    }

    public void mostrarCamiones() {
        if (pilaCamiones.isEmpty()) {
            System.out.println("No hay camiones en el callejón.");
        } else {
            System.out.println("Camiones en el callejón:");
            for (Camion c : pilaCamiones) {
                System.out.println(" - " + c);
            }
        }
    }

    public double calcularCargaTotal() {
        if (pilaCamiones.isEmpty()) {
            System.out.println("No hay camiones en el callejón.");
            return 0;
        }

        double total = 0;
        Stack<Camion> pilaAux = new Stack<>();

        
        while (!pilaCamiones.isEmpty()) {
            Camion c = pilaCamiones.pop();
            total += c.getCargaToneladas();
            pilaAux.push(c);
        }

       
        while (!pilaAux.isEmpty()) {
            pilaCamiones.push(pilaAux.pop());
        }

        return total;
    }
}

