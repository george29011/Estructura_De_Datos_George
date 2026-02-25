import java.util.Scanner;

public class Ejercicio_1 {
  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
   System.out.println("Ingrese el descuento en entero");
        System.out.println("nombre del producto");
        String producto = scanner.nextLine();
        System.out.println("cantidad comprada");
        int cantidad = scanner.nextInt();
        System.out.println("precio producto");
        double precio = scanner.nextDouble();
        double precioT = precio * cantidad;
        double precioIva = precioT * 0.19;
        double precioTotal = precioIva + precioT;
        System.out.println("====Recibo====");
        System.out.println("Nombre producto " + producto);
        System.out.println("Cantidad " + cantidad);
        System.out.println("Precio unitario " + precio);
        System.out.println("Total productos " + precioT);
        System.out.println("Total Iva 19% " + precioIva);
        System.out.println("Total a pagar " + precioTotal);
  
}

}
