// creacion de copia de un array


package Tema_2;

import java.util.Arrays;
public class Ejercicio_10 {
  public static void main(String[] args) {
    int[] Configuracion = {1920, 1080, 60};
    int[] Copia = Configuracion.clone();

    Copia[0] = 1280;

    System.out.println("configuracion es: " + Arrays.toString(Configuracion));
    System.out.println("copia es: " + Arrays.toString(Copia));
  }
}
