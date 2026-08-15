package model;

public class PedidoComida extends Pedido {

    private boolean mochilaTermica;

    public PedidoComida(String idPedido, String direccionEntrega, String tipoPedido, boolean mochilaTermica) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.mochilaTermica = mochilaTermica;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("\n[Pedido Comida]");
        System.out.println("Asignando repartidor...");

        if (mochilaTermica) {
            System.out.println("Verificando mochila térmica... OK");
        } else {
            System.out.println("Repartidor sin mochila térmica.");
        }
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Verificando mochila térmica... OK");
        System.out.println("Pedido asignado a " + nombreRepartidor);
    }
}
