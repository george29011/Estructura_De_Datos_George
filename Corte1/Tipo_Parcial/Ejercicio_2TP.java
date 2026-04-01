package Tipo_Parcial;

import java.util.Scanner;


public class Ejercicio_2TP {
  

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] puntajes = new int[6];

        System.out.println("--- INGRESO DE PUNTAJES ---");

        
        for (int i = 0; i < puntajes.length; i++) {
            System.out.print("Puntaje del Intento " + (i + 1) + ": ");
            puntajes[i] = sc.nextInt();
        }

        
        for (int i = 1; i < puntajes.length; i++) {

            int clave = puntajes[i];
            int j = i - 1;

            while (j >= 0 && puntajes[j] < clave) {
                puntajes[j + 1] = puntajes[j];
                j--;
            }

            puntajes[j + 1] = clave;
        }

        
        System.out.println("\n--- TABLA DE RESULTADOS (De mayor a menor) ---");

        for (int i = 0; i < puntajes.length; i++) {
            System.out.println((i + 1) + "° Lugar: " + puntajes[i]);
        }

        
        System.out.print("\nIngrese el puntaje a buscar: ");
        int buscar = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < puntajes.length; i++) {
            if (puntajes[i] == buscar) {
                System.out.println("El puntaje está en la posición: " + (i + 1) + "° lugar");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Puntaje no encontrado.");
        }
      sc.close();
    }
}

