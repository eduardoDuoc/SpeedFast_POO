package model;

public abstract class Pedido {

    private String idPedido;
    private String direccionEntrega;
    private double distanciaKm;

    public Pedido(String idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void mostrarResumen() {
        System.out.println("\nID: " + idPedido);
        System.out.println("Direccion: " + direccionEntrega);
        System.out.println("Distancia Km: " + distanciaKm);
    }

    public abstract void calcularTiempoEntrega();
}
