package model;

import java.util.List;
import java.util.Random;

public class Repartidor implements Runnable {

    private String nombre;
    private List<Pedido> pedidosAsignados;
    private Random random = new Random();

    public Repartidor(String nombre, List<Pedido> pedidosAsignados) {
        this.nombre = nombre;
        this.pedidosAsignados = pedidosAsignados;
    }

    @Override
    public void run() {
        for (Pedido pedido : pedidosAsignados) {

            System.out.println("Repartiendo pedido...");

            try {
                int tiempo = 1000 + random.nextInt(2000);
                Thread.sleep(tiempo);

            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }

            System.out.println("Pedido entregado");

        }

    }
}
