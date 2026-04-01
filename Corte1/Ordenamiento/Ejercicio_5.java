/*5. El Inspector de Eficiencia (Duelo de Métodos)
Algoritmos obligatorios: Selección vs Inserción

Contexto: Un analista de sistemas quiere saber cuál algoritmo es más "pesado" en términos de operaciones para un caso específico.
Detalle del ejercicio: El usuario debe ingresar 6 números enteros desordenados. El programa aplicará AMBOS métodos al mismo conjunto de datos (puedes usar una copia del arreglo original).
Lógica de Conteo:
En Selección: Cuenta cada vez que ocurre un swap (intercambio físico de posiciones).
En Inserción: Cuenta cada vez que un elemento se "mueve" hacia la izquierda dentro del bucle interno.
Resultado esperado: El programa debe imprimir cuántos intercambios hizo Selección y cuántos movimientos hizo Inserción. El estudiante debe concluir cuál fue más eficiente para esos datos ingresados por el teclado. */

package Ordenamiento;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_5 {
   public Ejercicio_5() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int[] var2 = new int[6];
      System.out.println("Ingrese 6 números enteros desordenados:");

      for(int var3 = 0; var3 < 6; ++var3) {
         System.out.print("Número " + (var3 + 1) + ": ");
         var2[var3] = var1.nextInt();
      }

      int[] var10 = Arrays.copyOf(var2, var2.length);
      int[] var4 = Arrays.copyOf(var2, var2.length);
      int var5 = 0;
      int var6 = 0;

      for(int var7 = 0; var7 < var10.length - 1; ++var7) {
         int var8 = var7;

         for(int var9 = var7 + 1; var9 < var10.length; ++var9) {
            if (var10[var9] < var10[var8]) {
               var8 = var9;
            }
         }

         if (var8 != var7) {
            int var13 = var10[var7];
            var10[var7] = var10[var8];
            var10[var8] = var13;
            ++var5;
         }
      }

      for(int var11 = 1; var11 < var4.length; ++var11) {
         int var12 = var4[var11];

         int var14;
         for(var14 = var11 - 1; var14 >= 0 && var4[var14] > var12; ++var6) {
            var4[var14 + 1] = var4[var14];
            --var14;
         }

         var4[var14 + 1] = var12;
      }

      System.out.println("\nArreglo original:");
      System.out.println(Arrays.toString(var2));
      System.out.println("\nOrdenado con Selection Sort:");
      System.out.println(Arrays.toString(var10));
      System.out.println("Cantidad de intercambios (swaps): " + var5);
      System.out.println("\nOrdenado con Insertion Sort:");
      System.out.println(Arrays.toString(var4));
      System.out.println("Cantidad de movimientos: " + var6);
      System.out.println("\nConclusión:");
      if (var5 < var6) {
         System.out.println("Selection Sort fue más eficiente para este ejemplo.");
      } else if (var6 < var5) {
         System.out.println("Insertion Sort fue más eficiente para este ejemplo.");
      } else {
         System.out.println("Ambos algoritmos realizaron la misma cantidad de operaciones.");
      }

      var1.close();
   }
}
