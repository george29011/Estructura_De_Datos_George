// detector de intrusos, registra intentos de acceso, tienes una lista negra de Id de atacantes conocidos numerada Atacantes []= 50,120,450,000,999. solicita al usuario registrar 8 IDs de acceso recientes en el servidor, realiza una busqueda lineal para encontrar el ID mas alto de los intentos ingresados( el sospechoso principal) y luego comparar con la lista negra, si no esta, muestra un mensaje "Nuevo atacante detectado, procediendo a bloquear" 

package Ejercicio_reto;
import java.util.Scanner;
public class Reto {


  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] Atacantes = {50, 120, 450, 000, 999};
    int[] intentos = new int[8];
    for (int i = 0; i < 8; i++) {
      System.out.println("Ingrese el ID de acceso reciente:");
      intentos[i] = scanner.nextInt();
    }
    int sospechosoPrincipal = -1;
    for (int i = 0; i < intentos.length; i++) {
      if (intentos[i] > sospechosoPrincipal) {
        sospechosoPrincipal = intentos[i];
      }
    }
    boolean esAtacante = false;
    for (int i = 0; i < Atacantes.length; i++) {
      if (Atacantes[i] == sospechosoPrincipal) {
        esAtacante = true;
        break;
      }
    }
    if (!esAtacante) {
      System.out.println("Nuevo atacante detectado, procediendo a bloquear");
    }

  }
}
