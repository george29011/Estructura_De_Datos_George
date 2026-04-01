package Tipo_Parcial;
import java.util.Scanner;

public class Ejercicio_1TP {
  
  



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Producto[] productos = new Producto[5];

        System.out.println("--- REGISTRO DE PRODUCTOS ---");

        
        for (int i = 0; i < productos.length; i++) {

            System.out.println("\nProducto " + (i + 1) + ":");

            System.out.print("Ingrese ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingrese Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese Precio: ");
            double precio = sc.nextDouble();

            System.out.print("Ingrese Stock: ");
            int stock = sc.nextInt();

            productos[i] = new Producto(id, nombre, precio, stock);
        }

       
        shellSort(productos);

        System.out.println("\n--- PRODUCTOS ORDENADOS POR ID ---");
        for (Producto p : productos) {
            p.mostrar();
            System.out.println();
        }

       
        System.out.print("\nIngrese el ID a buscar: ");
        int buscarId = sc.nextInt();

        int posicion = busquedaBinaria(productos, buscarId);

        if (posicion != -1) {
            System.out.println("\nProducto encontrado:");
            productos[posicion].mostrar();
        } else {
            System.out.println("\nProducto no encontrado.");
        }
        sc.close();
    }

    
    public static void shellSort(Producto[] arr) {

        int n = arr.length;

        for (int salto = n / 2; salto > 0; salto /= 2) {

            for (int i = salto; i < n; i++) {

                Producto temp = arr[i];
                int j = i;

                while (j >= salto && arr[j - salto].id > temp.id) {
                    arr[j] = arr[j - salto];
                    j -= salto;
                }

                arr[j] = temp;
            }
        }
    }

    
    public static int busquedaBinaria(Producto[] arr, int id) {

        int izquierda = 0;
        int derecha = arr.length - 1;

        while (izquierda <= derecha) {

            int medio = (izquierda + derecha) / 2;

            if (arr[medio].id == id) {
                return medio;
            }

            if (arr[medio].id < id) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return -1;
        
    }
   
}

