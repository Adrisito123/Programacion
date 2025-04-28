package Ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio14 {
    public static void main(String[] args) {
        List<Integer> notas = new ArrayList<>();
        notas.add(7);
        notas.add(2);
        notas.add(4);
        notas.add(1);

        System.out.println("Lista  normal");
        System.out.println("Notas: " + notas);

        System.out.println("Lista desordenada");
        Collections.shuffle(notas);
        System.out.println("Notas: " + notas);

        System.out.println("Lista ordenada");
        Collections.sort(notas);
        System.out.println("Notas: " + notas);

        System.out.println("Lista ordenada inversamente");
        Collections.reverse(notas);
        System.out.println("Notas: " + notas);

        if(notas.contains(1)){
            System.out.println("Esta en la posicion : " + notas.indexOf(1));
        } else{
            System.out.println("No esta en la lista " );
        }

        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> listaArray = List.of(array);
        System.out.println(listaArray);


    }
}
