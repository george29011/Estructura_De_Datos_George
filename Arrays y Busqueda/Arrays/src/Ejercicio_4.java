// Control de acceso en gimnasio

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
