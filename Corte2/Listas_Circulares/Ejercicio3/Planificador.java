package Corte2.Listas_Circulares.Ejercicio3;

  import java.util.ArrayList;

class Planificador {
    Proceso cabeza = null;

    public void agregarProceso(String nombre, int pid, int tiempo, int prioridad) {
        Proceso nuevo = new Proceso(nombre, pid, tiempo, prioridad);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
        } else {
            Proceso temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    public void ejecutar(int quantum) {
        if (cabeza == null) return;

        ArrayList<String> ordenFinalizacion = new ArrayList<>();

        Proceso actual = cabeza;
        Proceso anterior = null;

        while (cabeza != null) {

            // Buscar el anterior (solo si es necesario)
            if (anterior == null) {
                anterior = actual;
                while (anterior.siguiente != actual) {
                    anterior = anterior.siguiente;
                }
            }

            System.out.println("Ejecutando: " + actual.nombre + 
                               " (PID: " + actual.pid + ")" +
                               " | Tiempo restante antes: " + actual.tiempoRestante);

            actual.tiempoRestante -= quantum;

            if (actual.tiempoRestante <= 0) {
                System.out.println("➡ Proceso " + actual.nombre + " TERMINÓ");

                ordenFinalizacion.add(actual.nombre);

                // Caso: único nodo
                if (actual == actual.siguiente) {
                    cabeza = null;
                    break;
                }

                // Eliminar nodo
                anterior.siguiente = actual.siguiente;

                if (actual == cabeza) {
                    cabeza = actual.siguiente;
                }

                actual = actual.siguiente;

            } else {
                System.out.println("Tiempo restante después: " + actual.tiempoRestante);
                anterior = actual;
                actual = actual.siguiente;
            }

            System.out.println("------------------------");
        }

        // Resultado final
        System.out.println("\nOrden de finalización:");
        for (String nombre : ordenFinalizacion) {
            System.out.println(nombre);
        }
    }
}

