package model;

public class PedidoExpress extends Pedido {

    public PedidoExpress(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public void calcularTiempoEntrega() {

        int tiempo = 10;

        if (getDistanciaKm() > 5) {
            tiempo += 5;
        }

        System.out.println("Tiempo estimado de entrega: " + tiempo + " minutos");
    }
}
