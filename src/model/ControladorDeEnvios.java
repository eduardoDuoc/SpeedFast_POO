package model;

import interfaces.Cancelable;
import interfaces.Despachable;
import interfaces.Rastreable;

import java.util.ArrayList;

public class ControladorDeEnvios implements Despachable, Cancelable, Rastreable {

    private ArrayList<String> historial = new ArrayList<>();

    @Override
    public void cancelar() {
        System.out.println("Pedido Cancelado");

    }

    public void cancelar(String pedido) {
        System.out.println(pedido + " cancelado");
    }

    @Override
    public void despachar() {
        System.out.println("Pedido Despachado");
        historial.add("Pedido Despachado");
    }

    public void despachar(String pedido) {
        System.out.println(pedido + " despachado correctamente");
        historial.add(pedido + " despachado");
    }

    @Override
    public void verHistorial() {

        for (String registro : historial) {
            System.out.println("- " + registro);
        }

    }
}
