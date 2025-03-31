package Ejercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ejercicio2 {
    public static void main(String[] args) {
    Set<String> alumnos = new LinkedHashSet<>();
    Set<String> alumnos2 = new HashSet<>();

        alumnos.add("Adrian");
        alumnos.add("Alejandro");
        alumnos.add("Pablo");

        System.out.println("Inicial: " + alumnos);

        alumnos.add("Adrian");

        alumnos.add(null);

        System.out.println("Añadiendo el mismo nombre y valor null: " + alumnos);

        System.out.println("Ordenados:");

        for (String alumno : alumnos) {
        System.out.println(alumno);
    }


        //Comparación con HashHSet

        System.out.println("Comparación con hashset");

        alumnos2.add("Adrian");
        alumnos2.add("Alejandro");
        alumnos2.add("Pablo");

        System.out.println("Inicial con hashSet: " + alumnos2);

        alumnos2.add("Adrian");
        alumnos2.add(null);
        System.out.println("Añadiendo un alumno que ya existe y un null con hasSET: " + alumnos2);
        System.out.println("Ordenados con hashSet:");

        for (String alumno : alumnos2) {
            System.out.println(alumno);
        }

        System.out.println("Iterator:");

        Iterator<String> iterator = alumnos.iterator();
        while (iterator.hasNext()) {
            String alumno = iterator.next();
            System.out.println(alumno);
        }
}
}
