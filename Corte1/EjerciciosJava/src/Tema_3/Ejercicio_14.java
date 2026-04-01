package Tema_3;


import java.util.LinkedList;
import java.util.Queue;


public class Ejercicio_14 {
  
  



   
    static class NodoEmpleado {
        String cargo;
        NodoEmpleado izquierdo;
        NodoEmpleado derecho;

        public NodoEmpleado(String cargo) {
            this.cargo = cargo;
            this.izquierdo = null;
            this.derecho = null;
        }
    }

    public static void main(String[] args) {

       
        NodoEmpleado gerente = new NodoEmpleado("Gerente");
        NodoEmpleado supervisor1 = new NodoEmpleado("Supervisor1");
        NodoEmpleado supervisor2 = new NodoEmpleado("Supervisor2");
        NodoEmpleado analista1 = new NodoEmpleado("Analista1");
        NodoEmpleado analista2 = new NodoEmpleado("Analista2");

       
        gerente.izquierdo = supervisor1;
        gerente.derecho = supervisor2;

        supervisor1.izquierdo = analista1;
        supervisor1.derecho = analista2;

        
        imprimirPorNiveles(gerente);
    }

    public static void imprimirPorNiveles(NodoEmpleado raiz) {

        if (raiz == null) return;

        Queue<NodoEmpleado> cola = new LinkedList<>();
        cola.add(raiz);

        int nivel = 0;

        while (!cola.isEmpty()) {

            int cantidadNodos = cola.size();
            System.out.println("Nivel " + nivel + ":");

            for (int i = 0; i < cantidadNodos; i++) {
                NodoEmpleado actual = cola.poll();
                System.out.println(" - " + actual.cargo);

                if (actual.izquierdo != null)
                    cola.add(actual.izquierdo);

                if (actual.derecho != null)
                    cola.add(actual.derecho);
            }

            nivel++;
        }
    }
}

