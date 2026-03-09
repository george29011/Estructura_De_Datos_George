/*1. El Podio de la Competencia
Algoritmo obligatorio: Ordenamiento por Selección (Selection Sort)

Contexto: Se ha realizado una carrera de 100 metros planos y el comité olímpico necesita determinar quiénes ganaron las medallas.
Detalle del ejercicio: El programa debe solicitar primero cuántos corredores participaron (ej. 5 a 10). Luego, debe pedir el tiempo en segundos (con decimales) de cada corredor.
Lógica de Selección: El algoritmo debe buscar el tiempo más bajo (el más rápido) en cada iteración y colocarlo al inicio.
Resultado esperado: El programa debe imprimir el arreglo totalmente ordenado y, adicionalmente, mostrar un mensaje claro indicando quién obtuvo el Oro (1er lugar), Plata (2do lugar) y Bronce (3er lugar). */


package Ordenamiento;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos corredores participaron (5 a 10)? ");
        int n = scanner.nextInt();

        double[] tiempos = new double[n];

      
        for (int i = 0; i < n; i++) {
            System.out.print("Tiempo del corredor " + (i + 1) + " en segundos: ");
            tiempos[i] = scanner.nextDouble();
        }

        
        for (int i = 0; i < n - 1; i++) {

            int indiceMinimo = i;

            for (int j = i + 1; j < n; j++) {
                if (tiempos[j] < tiempos[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

           
            double temp = tiempos[i];
            tiempos[i] = tiempos[indiceMinimo];
            tiempos[indiceMinimo] = temp;
        }

        
        System.out.println("\nTiempos ordenados (del más rápido al más lento):");

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "° lugar: " + tiempos[i] + " segundos");
        }

        System.out.println("\nResultados:");
        System.out.println("Oro: " + tiempos[0] + " segundos");
        System.out.println("Plata: " + tiempos[1] + " segundos");
        System.out.println("Bronce: " + tiempos[2] + " segundos");

        scanner.close();
    }
}