//Ficha de un estudiante 

package Tema_1;
import java.util.Scanner;

public class Ejercicio_1 {
  static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args){

        String nombre;
        int codigo;
        int semestre;
        double promedio;
        boolean matriculado;

        nombre = "Pepito Perez";
        codigo = 12345;
        semestre = 7;
        promedio = 5.0;
        matriculado = true;

        System.out.println("===Ficha del Estudiante===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Semestre: " + semestre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Matriculado: " + matriculado);

    }
}
