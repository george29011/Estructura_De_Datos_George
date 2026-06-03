package Corte3.Pilas.Ejercicio3;


public class Camion {
    private String placa;
    private String conductor;
    private double cargaToneladas;

    public Camion(String placa, String conductor, double cargaToneladas) {
        this.placa = placa;
        this.conductor = conductor;
        this.cargaToneladas = cargaToneladas;
    }

    public double getCargaToneladas() {
        return cargaToneladas;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "Placa='" + placa + '\'' +
                ", Conductor='" + conductor + '\'' +
                ", Carga=" + cargaToneladas + " toneladas" +
                '}';
    }
}
