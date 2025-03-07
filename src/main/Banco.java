package main;

import java.util.LinkedList;

public class Banco {
    public static void main(String[] args) {
        LinkedList<String> turnos = new LinkedList<>();


        turnos.add("Cliente 1");
        turnos.add("Cliente 2");
        turnos.add("Cliente 3");

        System.out.println("Turnos pendientes: " + turnos);

        System.out.println("Atendiendo a: " + turnos.poll());

        turnos.addFirst("Cliente VIP");

        System.out.println("Turnos pendientes: " + turnos);
    }
}

