package Corte3.Arboles.Ejercicio3;

public class Nomina {
    private Empleado raiz;

    
    public void insertar(long cedula, String nombre, String cargo, double salario) {
        raiz = insertarRec(raiz, cedula, nombre, cargo, salario);
    }

    private Empleado insertarRec(Empleado actual, long cedula, String nombre, String cargo, double salario) {
        if (actual == null) {
            return new Empleado(cedula, nombre, cargo, salario);
        }
        if (cedula < actual.cedula) {
            actual.izquierda = insertarRec(actual.izquierda, cedula, nombre, cargo, salario);
        } else if (cedula > actual.cedula) {
            actual.derecha = insertarRec(actual.derecha, cedula, nombre, cargo, salario);
        } else {
            System.out.println("La cédula " + cedula + " ya está registrada.");
        }
        return actual;
    }

   
    public void buscarMinimo() {
        if (raiz == null) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        Empleado actual = raiz;
        while (actual.izquierda != null) {
            actual = actual.izquierda;
        }
        System.out.println("Empleado con cédula más baja: " + actual);
    }

  
    public void buscarMaximo() {
        if (raiz == null) {
            System.out.println("No hay empleados registrados.");
            return;
        }
        Empleado actual = raiz;
        while (actual.derecha != null) {
            actual = actual.derecha;
        }
        System.out.println("Empleado con cédula más alta: " + actual);
    }

  
    public void reporteEficiencia() {
        int altura = calcularAltura(raiz);
        int hojas = contarHojas(raiz);
        System.out.println("\n--- REPORTE DE EFICIENCIA ---");
        System.out.println("Altura del árbol: " + altura);
        System.out.println("Número de hojas: " + hojas);
    }

    private int calcularAltura(Empleado actual) {
        if (actual == null) return 0;
        int izq = calcularAltura(actual.izquierda);
        int der = calcularAltura(actual.derecha);
        return Math.max(izq, der) + 1;
    }

    private int contarHojas(Empleado actual) {
        if (actual == null) return 0;
        if (actual.izquierda == null && actual.derecha == null) return 1;
        return contarHojas(actual.izquierda) + contarHojas(actual.derecha);
    }
}
