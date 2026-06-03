package Corte3.Colas.Ejercicio1;

public class Llamada {

    String idLlamada;
    String nombreCliente;
    String motivoConsulta;
    int duracionEstimadaMinutos;

    public Llamada(String idLlamada, String nombreCliente,
                    String motivoConsulta, int duracionEstimadaMinutos) {

        this.idLlamada = idLlamada;
        this.nombreCliente = nombreCliente;
        this.motivoConsulta = motivoConsulta;
        this.duracionEstimadaMinutos = duracionEstimadaMinutos;
    }

    @Override
    public String toString() {
        return "ID: " + idLlamada +
                " | Cliente: " + nombreCliente +
                " | Motivo: " + motivoConsulta +
                " | Duración Estimada: " +
                duracionEstimadaMinutos + " min";
    }
}