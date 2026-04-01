package Parcial_1;

import java.util.Scanner;


public class Ejercicio_2 {
  


  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    Estudiantes[] estudiantes = new Estudiantes[6];

        System.out.println("--- REGISTRO DE ESTUDIANTES ---");

        
        for (int i = 0; i < estudiantes.length; i++) {

            System.out.println("\nEstudiante " + (i + 1) + ":");

            System.out.print("Ingrese ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingrese Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese Nota: ");
            double nota = sc.nextDouble();

}
        Insertion_Sort(estudiantes);

        System.out.println("\n--- ESTUDIANTES ORDENADOS POR ID ---");
        for (Estudiantes e : estudiantes) {
            e.mostrar();
            System.out.println();
        }

       
        System.out.print("\nIngrese el ID a buscar: ");
        int id = sc.nextInt();

        int posicion = busquedaBinaria(estudiantes, id);

        if (posicion != -1) {
            System.out.println("\n Estudiante encontrado:");
            estudiantes[posicion].mostrar();

        } else {
            System.out.println("\nProducto no encontrado.");
        }
        sc.close();
      }

       
private static void Insertion_Sort(Estudiantes[] estudiantes) {

    
    
  }


public static int busquedaBinaria(Estudiantes[] arr, int id) {

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




