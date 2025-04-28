package Ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ejercicio15 {
    public static void main(String[] args) {

        List<Cartas> baraja = crearBaraja() ;

        Collections.shuffle(baraja);


        System.out.println("Repartir 5 cartas");
        List<Cartas> repartir = baraja.subList(0, 5);
        for (Cartas cartas : repartir) {
            System.out.println(cartas);
        }
        

    }

    public static List<Cartas> crearBaraja() {
        String[] palos = {"Basto", "Oro", "Copa", "Espada"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        List<Cartas> baraja = new ArrayList<>();

        for (String palo : palos) {
            for (String valor : valores) {
                baraja.add(new Cartas(valor, palo));
            }
        }

        return baraja;
    }

}
