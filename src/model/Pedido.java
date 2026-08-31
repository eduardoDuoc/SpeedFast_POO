package model;

public abstract class Pedido {

    private String idPedido;
    private String direccionEntrega;
    private double distanciaKm;
    private String repartidor;

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
        System.out.println("Repartidor: " + repartidor);
    }

    public abstract void reservar();

    public abstract void calcularTiempoEntrega();

    public abstract void asignarRepartidor();

    public void asignarRepartidor(String nombre) {

        this.repartidor = nombre;

    }
}
