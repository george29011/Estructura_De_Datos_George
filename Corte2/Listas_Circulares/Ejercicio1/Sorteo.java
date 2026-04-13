package Corte2.Listas_Circulares.Ejercicio1;

class Sorteo {
    private Participante cabeza = null;

   
    public void agregar(String nombre, int numeroBoleta, String ciudad) {
        Participante nuevo = new Participante(nombre, numeroBoleta, ciudad);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
        } else {
            Participante temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    
    public void mostrar() {
        if (cabeza == null) {
            System.out.println("No hay participantes.");
            return;
        }

        Participante temp = cabeza;
        do {
            System.out.println("Nombre: " + temp.nombre +
                               " | Boleta: " + temp.numeroBoleta +
                               " | Ciudad: " + temp.ciudad);
            temp = temp.siguiente;
        } while (temp != cabeza);
    }

    
    public void realizarSorteo(int pasos) {
        if (cabeza == null) {
            System.out.println("No hay participantes para el sorteo.");
            return;
        }

        Participante actual = cabeza;
        Participante anterior = null;

        
        for (int i = 0; i < pasos; i++) {
            anterior = actual;
            actual = actual.siguiente;
        }

       
        System.out.println("\n🎉 GANADOR 🎉");
        System.out.println("Nombre: " + actual.nombre);
        System.out.println("Boleta: " + actual.numeroBoleta);

       
        if (actual == cabeza && cabeza.siguiente == cabeza) {
            cabeza = null; 
        } else {
            if (actual == cabeza) {
                
                Participante temp = cabeza;
                while (temp.siguiente != cabeza) {
                    temp = temp.siguiente;
                }
                cabeza = cabeza.siguiente;
                temp.siguiente = cabeza;
            } else {
                anterior.siguiente = actual.siguiente;
            }
        }

        
        System.out.println("\nLista actualizada:");
        mostrar();
    }
}
