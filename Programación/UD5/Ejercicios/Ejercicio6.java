package Ejercicios;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ejercicio6 {
    public static void main(String[] args) {
        SortedSet<Persona> personas = new TreeSet<>();

        Persona persona1 = new Persona("Lucia", 20, 1.60, "Martinez");
        Persona persona2 = new Persona("Lucia", 25, 1.80, "Martinez");
        Persona persona3 = new Persona("Lucia", 22, 1.65, "Martinez");
        Persona persona4 = new Persona("Jorge", 18, 1.70, "Nuñez");
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);

        for (Persona persona : personas) {
            System.out.println(persona);
        }


    }
}
