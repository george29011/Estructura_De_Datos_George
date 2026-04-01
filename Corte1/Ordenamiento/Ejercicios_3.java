/*3. El Salto de Shell (Optimización de Datos)
Algoritmo obligatorio: Ordenamiento Shell (Shell Sort)

Contexto: Una empresa de logística maneja paquetes con diferentes pesos y necesita ordenarlos de forma más eficiente que el método de burbuja o inserción simple.
Detalle del ejercicio: Solicita al usuario el peso de N paquetes (se recomienda probar con al menos 10 para notar el efecto).
Lógica de Shell: Implementa el algoritmo usando el salto (gap) inicial de 
N
/
2
 */




package Ordenamiento;
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicios_3 {
  





    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de paquetes: ");
        int n = scanner.nextInt();

        double[] pesos = new double[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Peso del paquete " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
        }

        
        System.out.println("\nArreglo original:");
        System.out.println(Arrays.toString(pesos));

       
        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i++) {

                double temp = pesos[i];
                int j = i;

                while (j >= gap && pesos[j - gap] > temp) {
                    pesos[j] = pesos[j - gap];
                    j -= gap;
                }

                pesos[j] = temp;
            }
        }

      
        System.out.println("\nArreglo ordenado:");
        System.out.println(Arrays.toString(pesos));

        scanner.close();
    }
}
 /*
        Shell Sort:
        Este algoritmo mejora el método de inserción simple.
        En lugar de comparar elementos vecinos, compara elementos
        separados por un salto llamado "gap".

        El primer salto es N/2, luego se va reduciendo a la mitad
        hasta llegar a 1.

        Esto permite mover elementos que están muy lejos de su
        posición final más rápidamente, reduciendo la cantidad
        de comparaciones necesarias al final del ordenamiento.
        */

