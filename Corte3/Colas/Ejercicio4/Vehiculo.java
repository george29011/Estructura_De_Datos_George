package Corte3.Colas.Ejercicio4;

public class Vehiculo {
    private String placa;
    private String tipoVehiculo;
    private double tarifa;
    private boolean esExento;

    public Vehiculo(String placa, String tipoVehiculo, double tarifa, boolean esExento) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.tarifa = tarifa;
        this.esExento = esExento;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isExento() {
        return esExento;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "Placa='" + placa + '\'' +
                ", Tipo='" + tipoVehiculo + '\'' +
                ", Tarifa=" + tarifa +
                ", Exento=" + (esExento ? "Sí" : "No") +
                '}';
    }
}
