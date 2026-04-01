/*2. Buscador de Cédulas (Base de Datos Bancaria)
Un banco tiene una lista de 1.000 clientes organizados de forma estricta y ascendente por su número de cédula o ID.

El Problema: Un cliente llega a la ventanilla y da su número. El sistema debe encontrar sus datos de la manera más rápida posible (en pocos pasos).
Algoritmo a usar: Búsqueda Binaria. Como los datos ya están ordenados, este algoritmo permitirá encontrar al cliente dividiendo la lista a la mitad en cada paso. */

public class Ejercicio_2 {

    public static void main(String[] args) {

        
        int[] clientes = new int[1000];

        
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = 100000 + i; 
        }

        
        int idBuscado = 100345;

        int inicio = 0;
        int fin = clientes.length - 1;
        int posicion = -1;

        
        while (inicio <= fin) {

            int medio = (inicio + fin) / 2;

            if (clientes[medio] == idBuscado) {
                posicion = medio;
                break;
            }

            if (idBuscado < clientes[medio]) {
                fin = medio - 1;      
            } else {
                inicio = medio + 1;  
            }
        }

       
        if (posicion != -1) {
            System.out.println("Cliente encontrado.");
            System.out.println("Se encuentra en la posición: " + posicion);
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
}
    
