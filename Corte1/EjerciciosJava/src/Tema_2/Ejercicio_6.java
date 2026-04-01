//Turno en un banco

package Tema_2;

public class Ejercicio_6 {
  public static void main(String[] args) {
    int turnoActual = 5;
    int turnoEnPantalla = turnoActual;

    turnoEnPantalla = 20;
    System.out.println("Turno en pantalla: " + turnoEnPantalla);
    System.out.println("Turno actual: " + turnoActual);
    //son variables diferentes solo dependientes en el primer momento en el que turno en pantalla toma el valor de turno actual, al ser una copia, mas sin embargo independiente, cambiar su valor mas adelante no afecta al turno actual.
  }
}
