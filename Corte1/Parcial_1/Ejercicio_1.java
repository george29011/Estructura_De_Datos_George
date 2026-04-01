// Gestion de precios de taquilla y buscar registros

package Parcial_1;

import java.util.Scanner;

public class Ejercicio_1 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("¿ingrese los precios de las 5 boletas? ");
        int n = 5;

    double[] precios = new double[n];

    for (int i = 0; i < n; i++) {
            System.out.println("Precio de la boleta " + (i + 1) + ":  ");
            precios[i] = scanner.nextDouble();
        }
    

   
     for (int i = 0; i < n - 1; i++) {

            int indiceMinimo = i;

            for (int j = i + 1; j < n; j++) {
                if (precios[j] > precios[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            double temp = precios[i];
            precios[i] = precios[indiceMinimo];
            precios[indiceMinimo] = temp;

           
  }
  for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "ra boleta: " + precios[i]);
        }
      
        
      System.out.println("¿Desea buscar un precio? si = 1/no = 2");
      int eleccion = scanner.nextInt();
      
      if (eleccion ==1)
      {
        System.out.print("Ingrese el precio que desea buscar ");
        double codigoBuscado = scanner.nextDouble();
        int posicion = -1;
        boolean encontrado = false;

        for (int i = 0; i < precios.length; i++) {
                    if (precios[i] == codigoBuscado) {
                        encontrado = true;
                        posicion = i;
                        break; 
                    }
                }

                
                if (encontrado) {
                    System.out.println("Precio encontrado.");
                    System.out.println("Se encuentra en la posición: " + posicion);
                } else {
                    System.out.println("Precio no encontrado.");
                }
        scanner.close();

      }else{
        System.out.println("gracias por usar el programa");
      }
        
      
        
      
     
    }
       
  
}
