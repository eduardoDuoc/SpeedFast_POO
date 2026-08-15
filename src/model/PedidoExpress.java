package model;

public class PedidoExpress extends Pedido {

    private boolean repartidorCercano;
    private boolean repartidorDisponible;

    public PedidoExpress(String idPedido, String direccionEntrega, String tipoPedido, boolean repartidorCercano, boolean repartidorDisponible) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.repartidorCercano = repartidorCercano;
        this.repartidorDisponible = repartidorDisponible;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("\n[Pedido Express]");
        System.out.println("Asignando repartidor...");

        if (repartidorCercano && repartidorDisponible) {
            System.out.println("Repartidor cercano con disponibilidad inmediata encontrado.");
        } else {
            System.out.println("No hay repartidor cercano disponible.");
        }
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Verificando disponibilidad inmediata...");
        System.out.println("Pedido asignado a " + nombreRepartidor);
    }
}
