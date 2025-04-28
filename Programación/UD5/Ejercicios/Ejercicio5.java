package Ejercicios;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ejercicio5 {
    public static void main(String[] args) {
        SortedSet <Persona> personas = new TreeSet<>();
        Persona hugo = new Persona("Hugo" , 16, 1.71);
        Persona adrian = new Persona("Adrian", 19,1.77);
        Persona alejandro = new Persona("Hugo", 12, 1.20);
        personas.add(hugo);
        personas.add(adrian);
        personas.add(alejandro);

        for (Persona persona : personas) {
            System.out.println(persona);
        }



    }
}
