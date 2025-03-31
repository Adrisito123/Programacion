package Ejercicios;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio3 {
    public static void main(String[] args) {
        Set<Integer> numeros = new TreeSet<>();
        Set<String>  nombres = new TreeSet<>();

        numeros.add(8);
        numeros.add(2);
        numeros.add(15);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        //Listar nombres con TreeSet
        System.out.println("Lista de TreeSet pero con nombres:");

        nombres.add("Adrian");
        nombres.add("Amador");
        nombres.add("Antonio");

        for(String alumno : nombres){
            System.out.println(alumno);
        }

        Iterator<Integer> iterator = numeros.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        TreeSet<Persona> treeSet = new TreeSet<>();
        treeSet.add(new Persona("Ronaldo" , 40 , 1.80 , "Bicho"));
        treeSet.add(new Persona("Pepsi" , 35 , 1.10 , "Pulga"));
        treeSet.add(new Persona("Loic" , 22 , 1.85 , "Bade"));

        for(Persona persona : treeSet){
            System.out.println(persona);
        }


    }
}
