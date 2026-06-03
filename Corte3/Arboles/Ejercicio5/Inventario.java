package Corte3.Arboles.Ejercicio5;

public class Inventario {
    private Repuesto raiz;

   
    public void insertar(int codigo, String descripcion, String marca, int stock) {
        raiz = insertarRec(raiz, codigo, descripcion, marca, stock);
    }

    private Repuesto insertarRec(Repuesto actual, int codigo, String descripcion, String marca, int stock) {
        if (actual == null) {
            return new Repuesto(codigo, descripcion, marca, stock);
        }
        if (codigo < actual.codigoRef) {
            actual.izquierda = insertarRec(actual.izquierda, codigo, descripcion, marca, stock);
        } else if (codigo > actual.codigoRef) {
            actual.derecha = insertarRec(actual.derecha, codigo, descripcion, marca, stock);
        } else {
            System.out.println("El código " + codigo + " ya existe en el inventario.");
        }
        return actual;
    }

 
    public void backupPreOrden() {
        System.out.println("\n--- BACKUP INVENTARIO (PreOrden) ---");
        preOrden(raiz);
    }

    private void preOrden(Repuesto actual) {
        if (actual != null) {
            System.out.println(actual);
            preOrden(actual.izquierda);
            preOrden(actual.derecha);
        }
    }

    
    public void reporteRepuestosUnicos() {
        int hojas = contarHojas(raiz);
        System.out.println("\n--- REPORTE REPUESTOS ÚNICOS ---");
        System.out.println("Total de repuestos sin variantes relacionadas: " + hojas);
    }

    private int contarHojas(Repuesto actual) {
        if (actual == null) return 0;
        if (actual.izquierda == null && actual.derecha == null) return 1;
        return contarHojas(actual.izquierda) + contarHojas(actual.derecha);
    }
}
