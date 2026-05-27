package Corte3.Colas.Ejercicio1;

public class Llamada {
    private String idLlamada;
    private String nombreCliente;
    private String motivoConsulta;
    private int duracionEstimadaMinutos;

    public Llamada(String idLlamada, String nombreCliente, String motivoConsulta, int duracionEstimadaMinutos) {
        this.idLlamada = idLlamada;
        this.nombreCliente = nombreCliente;
        this.motivoConsulta = motivoConsulta;
        this.duracionEstimadaMinutos = duracionEstimadaMinutos;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    @Override
    public String toString() {
        return "Llamada{" +
                "ID='" + idLlamada + '\'' +
                ", Cliente='" + nombreCliente + '\'' +
                ", Motivo='" + motivoConsulta + '\'' +
                ", Duración=" + duracionEstimadaMinutos + " min" +
                '}';
    }
}

