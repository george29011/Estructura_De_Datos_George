// Inventario de supermercado
public class Ejercicio_1 {

    public static void main(String[] args) {

        
        int[] codigos = {458912, 770555, 123456, 770123, 998877, 445566};

        
        int codigoBuscado = 770123;

        boolean encontrado = false;
        int posicion = -1;

        
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigoBuscado) {
                encontrado = true;
                posicion = i;
                break; 
            }
        }

        
        if (encontrado) {
            System.out.println("Producto encontrado.");
            System.out.println("Se encuentra en la posición: " + posicion);
        } else {
            System.out.println("Producto no encontrado en la estantería.");
        }
    }
}

