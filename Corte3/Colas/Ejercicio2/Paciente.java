package Corte3.Colas.Ejercicio2;

public class Paciente {
    private String cedula;
    private String nombreCompleto;
    private int edad;
    private String sintomaPrincipal;

    public Paciente(String cedula, String nombreCompleto, int edad, String sintomaPrincipal) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.sintomaPrincipal = sintomaPrincipal;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "Cédula='" + cedula + '\'' +
                ", Nombre='" + nombreCompleto + '\'' +
                ", Edad=" + edad +
                ", Síntoma='" + sintomaPrincipal + '\'' +
                '}';
    }
}
