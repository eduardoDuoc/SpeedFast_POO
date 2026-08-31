package model;

public class PedidoComida extends Pedido {


    public PedidoComida(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public void reservar() {
        System.out.println("Pedido comida reservado");

    }

    @Override
    public void calcularTiempoEntrega() {

        double tiempo = 15 + (2 * getDistanciaKm());

        System.out.println("Tiempo estimado de entrega: " + tiempo + " minutos");
    }

    @Override
    public void asignarRepartidor() {
        asignarRepartidor("Mauricio");


    }

}
