package app;

import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;
import model.ControladorDeEnvios;

public class Main {


    public static void main(String[] args) {

        // Creación de pedidos
        PedidoComida comida = new PedidoComida("0001", "San Bernardo", 2);
        PedidoEncomienda encomienda = new PedidoEncomienda("0002", "Buin", 6);
        PedidoExpress express = new PedidoExpress("0003", "Av. Italia 123", 12);

        ControladorDeEnvios controlador = new ControladorDeEnvios();


        // Reserva de pedidos
        System.out.println("\n--- RESERVA DE PEDIDOS ---");

        comida.reservar();
        encomienda.reservar();
        express.reservar();


        // Asignación automática
        System.out.println("\n--- ASIGNACIÓN AUTOMÁTICA ---");

        comida.asignarRepartidor();
        encomienda.asignarRepartidor();
        express.asignarRepartidor();


        // Resumen de pedidos
        comida.mostrarResumen();
        encomienda.mostrarResumen();
        express.mostrarResumen();


        // Cálculo de tiempos
        System.out.println("\n--- TIEMPOS DE ENTREGA ---");

        comida.calcularTiempoEntrega();
        encomienda.calcularTiempoEntrega();
        express.calcularTiempoEntrega();


        // Asignación manual
        System.out.println("\n--- ASIGNACIÓN MANUAL ---");

        comida.asignarRepartidor("Felipe");
        comida.mostrarResumen();


        // Despacho
        System.out.println("\n--- DESPACHO ---");

        controlador.despachar("Pedido Comida 0001");
        controlador.despachar("Pedido Encomienda 0002");


        // Cancelación
        System.out.println("\n--- CANCELACIÓN ---");

        controlador.cancelar("Pedido Express 0003");


        // Historial
        System.out.println("\n--- HISTORIAL DE ENTREGAS ---");

        controlador.verHistorial();
    }
}