//Base de datos bancaria- buscador de celulas

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
    
