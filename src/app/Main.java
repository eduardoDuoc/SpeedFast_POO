package app;

import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;

public class Main {

    public static void main(String[] args) {

        PedidoComida comida = new PedidoComida("0001", "San Bernardo", 2);

        PedidoEncomienda encomienda = new PedidoEncomienda("0002", "Buin", 6);

        PedidoExpress express = new PedidoExpress("0003", "Av. Italia 123", 12);

        comida.mostrarResumen();
        comida.calcularTiempoEntrega();

        encomienda.mostrarResumen();
        encomienda.calcularTiempoEntrega();

        express.mostrarResumen();
        express.calcularTiempoEntrega();
    }
}
