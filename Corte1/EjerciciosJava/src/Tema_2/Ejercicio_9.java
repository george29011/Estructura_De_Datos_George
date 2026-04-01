//  Referencias a arrays

package Tema_2;

public class Ejercicio_9 {
  public static void main(String[] args) {
    double[] NotasProfesor = {5.0, 2.5, 8.0, 6.5};
    double[] NotasDirector = NotasProfesor;
    NotasDirector[1] = 3.0;

    System.out.println("Notas del profesor:");
    for (double nota : NotasProfesor) {
      System.out.println(nota);
    }

    System.out.println("Notas del director:");
    for (double nota : NotasDirector) {
      System.out.println(nota);
    }
  }
  
}
