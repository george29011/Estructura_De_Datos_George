package Corte3.Pilas.Ejercicio2;

public class Pieza {
    private String nombrePieza;
    private String numeroSerie;
    private boolean esDefectuosa;

    public Pieza(String nombrePieza, String numeroSerie, boolean esDefectuosa) {
        this.nombrePieza = nombrePieza;
        this.numeroSerie = numeroSerie;
        this.esDefectuosa = esDefectuosa;
    }

    public boolean isDefectuosa() {
        return esDefectuosa;
    }

    @Override
    public String toString() {
        return "Pieza{" +
                "Nombre='" + nombrePieza + '\'' +
                ", Serie='" + numeroSerie + '\'' +
                ", Defectuosa=" + (esDefectuosa ? "Sí" : "No") +
                '}';
    }
}
