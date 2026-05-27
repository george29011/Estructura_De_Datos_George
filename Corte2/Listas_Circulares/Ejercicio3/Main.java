package Corte2.Listas_Circulares.Ejercicio3;

public class Main {

    public static void main(String[] args) {
        Planificador p = new Planificador();

        p.agregarProceso("P1", 1, 10, 1);
        p.agregarProceso("P2", 2, 5, 2);
        p.agregarProceso("P3", 3, 8, 1);

        p.ejecutar(3);
    }
}

