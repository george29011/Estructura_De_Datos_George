package Corte3.Arboles.Ejercicio3;

public class Empleado {
    long cedula;
    String nombreCompleto;
    String cargo;
    double salario;
    Empleado izquierda, derecha;

    public Empleado(long cedula, String nombreCompleto, String cargo, double salario) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.cargo = cargo;
        this.salario = salario;
        this.izquierda = null;
        this.derecha = null;
    }

    @Override
    public String toString() {
        return cedula + " - " + nombreCompleto + " - " + cargo + " - $" + salario;
    }
}

