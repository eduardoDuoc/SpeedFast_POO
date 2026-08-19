package model;

public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public void calcularTiempoEntrega() {

        int tiempo = (int) (20 + (1.5 * getDistanciaKm()));

        System.out.println("Tiempo estimado de entrega: " + tiempo + " minutos");
    }
}
