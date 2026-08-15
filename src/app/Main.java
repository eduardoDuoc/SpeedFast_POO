package app;

import model.Pedido;
import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;

public class Main {

    public static void main(String[] args) {


        PedidoComida comida = new PedidoComida("P01", "San Bernardo", "comida", true);

        PedidoEncomienda encomienda = new PedidoEncomienda("P002", "Buin", "encomienda", true, true);

        PedidoExpress express = new PedidoExpress("P03", "Rancagua", "express", true, true);

        comida.asignarRepartidor();
        comida.asignarRepartidor("Juan Pérez");

        encomienda.asignarRepartidor();
        encomienda.asignarRepartidor("Camila Soto");

        express.asignarRepartidor();
        express.asignarRepartidor("Luis Díaz");
    }
}
