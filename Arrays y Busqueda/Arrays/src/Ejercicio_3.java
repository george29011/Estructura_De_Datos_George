/*3. Sensor de Temperatura (Control de Calidad)
Una máquina industrial registra la temperatura cada 10 minutos y guarda los datos en un arreglo.

El Problema: Al final del día, el supervisor quiere saber cuál fue la temperatura más alta registrada para asegurarse de que la máquina no se recalentó.
Algoritmo a usar: Búsqueda Lineal de Máximo. Debes recorrer todo el arreglo comparando cada valor para encontrar el mayor de todos. */

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

