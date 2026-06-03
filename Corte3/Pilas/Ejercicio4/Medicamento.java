package Corte3.Pilas.Ejercicio4;

public class Medicamento {
    private String nombre;
    private String lote;
    private int diasParaVencer;

    public Medicamento(String nombre, String lote, int diasParaVencer) {
        this.nombre = nombre;
        this.lote = lote;
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "Nombre='" + nombre + '\'' +
                ", Lote='" + lote + '\'' +
                ", Días para vencer=" + diasParaVencer +
                '}';
    }
}
