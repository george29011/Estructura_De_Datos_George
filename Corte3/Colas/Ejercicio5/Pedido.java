package Corte3.Colas.Ejercicio5;

public class Pedido {
    private String numeroPedido;
    private String cliente;
    private double totalPagar;
    private boolean cancelado;

    public Pedido(String numeroPedido, String cliente, double totalPagar, boolean cancelado) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.totalPagar = totalPagar;
        this.cancelado = cancelado;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "Número='" + numeroPedido + '\'' +
                ", Cliente='" + cliente + '\'' +
                ", Total=$" + totalPagar +
                ", Cancelado=" + (cancelado ? "Sí" : "No") +
                '}';
    }
}
