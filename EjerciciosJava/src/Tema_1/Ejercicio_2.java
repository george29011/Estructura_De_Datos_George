//Facturacion de una tienda

package Tema_1;
public class Ejercicio_2 {
  public static void main(String[] args) {
    
        double precioUnitario;
        int cantidadComprada;
        double descuentoPorcentaje;
        double totalBruto;
        double totalDescuento;
        double totalPagar;

       
        precioUnitario = 2500.0;    
        cantidadComprada = 4;        
        descuentoPorcentaje = 10.0;   

        // Cálculos
        totalBruto = precioUnitario * cantidadComprada;
        totalDescuento = totalBruto * (descuentoPorcentaje / 100);
        totalPagar = totalBruto - totalDescuento;

        System.out.println("=== Factura de Compra ===");
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Cantidad comprada: " + cantidadComprada);
        System.out.println("Descuento aplicado: " + descuentoPorcentaje + "%");
        System.out.println("Total a pagar: $" + totalPagar);
    }
  }