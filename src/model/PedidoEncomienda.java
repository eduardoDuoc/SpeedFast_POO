package model;

public class PedidoEncomienda extends Pedido {

    private boolean validarPeso;
    private boolean validarEmbalaje;

    public PedidoEncomienda(String idPedido, String direccionEntrega, String tipoPedido, boolean validarPeso, boolean validarEmbalaje) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.validarPeso = validarPeso;
        this.validarEmbalaje = validarEmbalaje;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("\n[Pedido Encomienda]");
        System.out.println("Asignando repartidor...");

        if (validarPeso && validarEmbalaje) {
            System.out.println("Peso y embalaje validados... OK");
        } else {
            System.out.println("No cumple con la validación de peso y embalaje.");
        }
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Validando peso y embalaje... OK");
        System.out.println("Pedido asignado a " + nombreRepartidor);
    }
}
