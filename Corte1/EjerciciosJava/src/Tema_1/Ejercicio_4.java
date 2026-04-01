//Placa de un vehículo

package Tema_1;
public class Ejercicio_4 {
  public static void main(String[] args) {
    
        String placa;
        int anioFabricacion;
        int cilindraje;
        double precioCompra;
        char inicialColor;
        boolean soatVigente;

        
        placa = "AEI123";
        anioFabricacion = 2022;
        cilindraje = 1600;
        precioCompra = 45000000.0;
        inicialColor = 'R';  
        soatVigente = true;

       
        System.out.println("=== Datos del Vehículo ===");
        System.out.println("Placa: " + placa);
        System.out.println("Año de fabricación: " + anioFabricacion);

        System.out.println("Cilindraje: " + cilindraje + " cc");
        System.out.println("Precio de compra: $" + precioCompra);
        System.out.println("Inicial del color: " + inicialColor);
        System.out.println("SOAT vigente: " + soatVigente);

  }
}
