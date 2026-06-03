package Corte3.Colas.Ejercicio3;

public class Documento {
    private String nombreArchivo;
    private String usuario;
    private int numeroPaginas;
    private boolean esColor;

    public Documento(String nombreArchivo, String usuario, int numeroPaginas, boolean esColor) {
        this.nombreArchivo = nombreArchivo;
        this.usuario = usuario;
        this.numeroPaginas = numeroPaginas;
        this.esColor = esColor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "Archivo='" + nombreArchivo + '\'' +
                ", Usuario='" + usuario + '\'' +
                ", Páginas=" + numeroPaginas +
                ", Color=" + (esColor ? "Sí" : "No") +
                '}';
    }
}
