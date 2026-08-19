package model;

public class PedidoComida extends Pedido {


    public PedidoComida(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public void calcularTiempoEntrega() {

        double tiempo = 15 + (2 * getDistanciaKm());

        System.out.println("Tiempo estimado de entrega: " + tiempo + " minutos");
    }

}
