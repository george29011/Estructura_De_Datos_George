//Sensor de temperatura

public class Ejercicio_3 {
  

    public static void main(String[] args) {

        
        double[] temperaturas = {
            65.2, 67.8, 70.1, 68.5, 72.3,
            69.9, 74.0, 71.4, 73.6, 68.2
        };

        
        double temperaturaMaxima = temperaturas[0];

        
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > temperaturaMaxima) {
                temperaturaMaxima = temperaturas[i];
            }
        }

       
        System.out.println("La temperatura más alta registrada fue: "
                + temperaturaMaxima + " °C");

        
        if (temperaturaMaxima > 75) {
            System.out.println("⚠ Advertencia: Posible recalentamiento.");
        } else {
            System.out.println("La máquina operó dentro del rango seguro.");
        }
    }
}

