package Tipo_Parcial;


  import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio_3TP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[5];

        System.out.println("--- REGISTRO DE NOTAS ---");

        // INGRESO DE DATOS
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese nota del Estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        // BUSCAR NOTA MAYOR Y MENOR
        double mayor = notas[0];
        double menor = notas[0];

        for (int i = 1; i < notas.length; i++) {

            if (notas[i] > mayor) {
                mayor = notas[i];
            }

            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        // ORDENAMIENTO SELECTION SORT (MENOR A MAYOR)
        for (int i = 0; i < notas.length - 1; i++) {

            int posMenor = i;

            for (int j = i + 1; j < notas.length; j++) {
                if (notas[j] < notas[posMenor]) {
                    posMenor = j;
                }
            }

            double temp = notas[i];
            notas[i] = notas[posMenor];
            notas[posMenor] = temp;
        }

        // RESULTADOS
        System.out.println("\n--- INFORME ACADÉMICO ---");
        System.out.println("La nota más ALTA del grupo es: " + mayor);
        System.out.println("La nota más BAJA del grupo es: " + menor);

        System.out.println("\n--- LISTA DE NOTAS ORDENADA (Menor a Mayor) ---");
        System.out.println(Arrays.toString(notas));

        sc.close();
    }
}

