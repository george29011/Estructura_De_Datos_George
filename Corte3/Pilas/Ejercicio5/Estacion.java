package Corte3.Pilas.Ejercicio5;

public class Estacion {
    private String nombrePunto;
    private int profundidad;
    private double nivelOxigeno;

    public Estacion(String nombrePunto, int profundidad, double nivelOxigeno) {
        this.nombrePunto = nombrePunto;
        this.profundidad = profundidad;
        this.nivelOxigeno = nivelOxigeno;
    }

    public double getNivelOxigeno() {
        return nivelOxigeno;
    }

    @Override
    public String toString() {
        return "Estacion{" +
                "Punto='" + nombrePunto + '\'' +
                ", Profundidad=" + profundidad + "m" +
                ", Oxígeno=" + nivelOxigeno + "%" +
                '}';
    }
}
