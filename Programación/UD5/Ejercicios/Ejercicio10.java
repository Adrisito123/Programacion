package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ejercicio10 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        numeros.add(60);
        numeros.add(70);
        numeros.add(80);
        numeros.add(90);
        numeros.add(100);

        System.out.println("Lista normal");
        System.out.println(numeros);

        ListIterator<Integer> iterator = numeros.listIterator();
        System.out.println("Lista ordenada");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Lista orden al reves");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        System.out.println("Lista mayores 50 x 2:");
        while (iterator.hasNext()) {
            int numero = iterator.next();
            if (numero > 50) {
                iterator.set(numero * 2);
            }
        }
        System.out.println(numeros);

        System.out.println("Lista menores de 30");
        while (iterator.hasPrevious()) {
            Integer numero = iterator.previous();
            if (numero < 30) {
                numeros.add(25);
            }
        }
        System.out.println(numeros);

    }
}
