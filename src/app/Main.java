package app;

import model.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class Main {

    public static void main(String[] args) {

        ZonaDeCarga zonaDeCarga = new ZonaDeCarga();

        zonaDeCarga.agregarPedido(new Pedido(001, "San bernardo"));
        zonaDeCarga.agregarPedido(new Pedido(002, "Santiago centro"));
        zonaDeCarga.agregarPedido(new Pedido(003, "Rancagua"));
        zonaDeCarga.agregarPedido(new Pedido(004, "San miguel"));
        zonaDeCarga.agregarPedido(new Pedido(005, "Puente alto"));

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(new Repartidor("Eduardo", zonaDeCarga));
        executor.submit(new Repartidor("Catalina", zonaDeCarga));
        executor.submit(new Repartidor("Mauri", zonaDeCarga));



        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\n\nTodos los pedidos han sido entregados correctamente");







    }
}