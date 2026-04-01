package Tema_3;

public class Ejercicio_11 {


  public static void main(String[] args) {

        
        String[] pasajeros = new String[6];

        
        pasajeros[0] = "Carlos";
        pasajeros[1] = "María";
        pasajeros[2] = "Andrés";
        pasajeros[3] = "Laura";
        pasajeros[4] = "Sofía";
        pasajeros[5] = "Miguel";

        
        int ocupados = 0;

        
        for (int i = 0; i < pasajeros.length; i++) {

            if (pasajeros[i] != null) {
                System.out.println("Asiento " + (i + 1) + ": " + pasajeros[i]);
                ocupados++;
            }
        }

        
        System.out.println("Total de asientos ocupados: " + ocupados);
}
}
