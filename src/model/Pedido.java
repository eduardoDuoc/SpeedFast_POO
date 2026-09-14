package model;

public class Pedido {

    private int idPedido;
    private String direccionEntrega;
    private EstadoPedido estado;


    public Pedido(int idPedido, String direccionEntrega) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void mostrarResumen() {
        System.out.println("\nID: " + idPedido);
        System.out.println("Direccion: " + direccionEntrega);
    }
}
