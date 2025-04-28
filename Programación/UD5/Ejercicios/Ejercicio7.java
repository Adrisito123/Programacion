package Ejercicios;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ejercicio7 {
    public static void main(String[] args) {
        SortedSet<Persona> personas = new TreeSet<>();
        Set<Persona> personas2 = new TreeSet<>();

        Persona persona1 = new Persona("Lucia", 20, 1.60, "Martinez");
        Persona persona2 = new Persona("Lucia", 25, 1.80, "Martinez");
        Persona persona3 = new Persona("Lucia", 22, 1.65, "Martinez");
        Persona persona4 = new Persona("Jorge", 18, 1.70, "Nuñez");
        //Personas con SortedSet
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        //Personas Con Set
        personas2.add(persona1);
        personas2.add(persona2);
        personas2.add(persona3);
        personas2.add(persona4);

        for (Persona persona : personas) {
            System.out.println(persona);
        }


        System.out.println("Mostar la primera que se coge con SortedSet");
        System.out.println(personas.first());
        System.out.println("Mostar la ultima que se coge con SortedSet");
        System.out.println(personas.last());


        System.out.println("Mostar la primera que se coge con Set");
        Iterator<Persona> iterator = personas.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
