package Corte2.ListasCircularesDobles.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Historial h = new Historial();

      
        h.agregar("ls", true, "/home");
        h.agregar("cd documentos", true, "/home");
        h.agregar("mkdir test", true, "/home/documentos");
        h.agregar("rm -rf *", false, "/home/documentos");
        h.agregar("git status", true, "/repo");

      
        h.arriba();
        h.arriba();
        h.arriba();

       
        h.mostrarCursor();

      
        h.eliminarActual();

       
        h.abajo();

      
        System.out.println("\nHistorial final:");
        h.mostrarHistorial();
    }
}