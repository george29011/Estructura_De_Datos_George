/*4. Control de Acceso (Gimnasio)
Un gimnasio tiene una lista de códigos de acceso de los socios que pagaron la mensualidad. La lista está ordenada de menor a mayor.

El Problema: Cuando un socio digita su código, el sistema debe validar si el código está en la lista de "pagos al día". Si no está, se le niega la entrada.
Algoritmo a usar: Búsqueda Binaria. Es eficiente para buscar códigos numéricos en una lista que ya está organizada. */

public class Ejercicio_4 {
  

    public static void main(String[] args) {

        
        int[] codigosPagos = {
            1001, 1005, 1010, 1020, 1035,
            1040, 1055, 1070, 1085, 1100
        };

        
        int codigoIngresado = 1035;

        int inicio = 0;
        int fin = codigosPagos.length - 1;
        boolean autorizado = false;

        
        while (inicio <= fin) {

            int medio = (inicio + fin) / 2;

            if (codigosPagos[medio] == codigoIngresado) {
                autorizado = true;
                break;
            }

            if (codigoIngresado < codigosPagos[medio]) {
                fin = medio - 1;    
            } else {
                inicio = medio + 1;  
            }
        }

        
        if (autorizado) {
            System.out.println("Acceso permitido. Socio al día.");
        } else {
            System.out.println("Acceso denegado. Pago pendiente.");
        }
    }

}
