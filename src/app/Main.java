package app;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        // LISTAS DE PEDIDOS
        List<Pedido> pedidosRepartidor1 = new ArrayList<>();
        List<Pedido> pedidosRepartidor2 = new ArrayList<>();
        List<Pedido> pedidosRepartidor3 = new ArrayList<>();


        // PEDIDOS REPARTIDOR 1
        pedidosRepartidor1.add(new PedidoComida("P001", "Gran Avenida 1234", 4.5));
        pedidosRepartidor1.add(new PedidoExpress("P002", "Los Morros 567", 3.2));


        // PEDIDOS REPARTIDOR 2
        pedidosRepartidor2.add(new PedidoEncomienda("P003", "San José 890", 8.0));
        pedidosRepartidor2.add(new PedidoComida("P004", "Lo Blanco 432", 5.5));


        // PEDIDOS REPARTIDOR 3
        pedidosRepartidor3.add(new PedidoExpress("P005", "Colón 765", 2.8));
        pedidosRepartidor3.add(new PedidoEncomienda("P006", "Portales 321", 7.4));


        // REPARTIDORES
        Repartidor repartidor1 = new Repartidor("Camila", pedidosRepartidor1);
        Repartidor repartidor2 = new Repartidor("Luis", pedidosRepartidor2);
        Repartidor repartidor3 = new Repartidor("Sofía", pedidosRepartidor3);


        // EJECUTOR CON 3 HILOS
        ExecutorService executor = Executors.newFixedThreadPool(3);


        // EJECUTAR LOS 3 REPARTIDORES EN PARALELO
        executor.execute(repartidor1);
        executor.execute(repartidor2);
        executor.execute(repartidor3);


        // NO RECIBIR MÁS TAREAS
        executor.shutdown();


        // ESPERAR A QUE TODOS TERMINEN
        try {

            if (!executor.awaitTermination(1, TimeUnit.MINUTES)) {
                executor.shutdownNow();
            }

        } catch (InterruptedException e) {

            executor.shutdownNow();
            Thread.currentThread().interrupt();

        }

        System.out.println("Todos los repartidores finalizaron sus entregas.");
    }
}