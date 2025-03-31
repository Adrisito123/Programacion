package Ejercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> libros = new HashSet();
        String nombreLibro;

        while(true){
            System.out.println("Ingrese el nombre del libro: ");
            nombreLibro = sc.nextLine();

            if(nombreLibro.equals("fin")){
                break;
            } else{
                System.out.println("Libro añadido");
                libros.add(nombreLibro);
            }


        }
        System.out.println("Lista de libros:");
        for(String libro: libros){
            System.out.println(libro);
           /* if(libro.equals("libro2")){
                libros.remove("libro2");
            }
            */
        }

        System.out.println("Lista de libros con iterator:");
        libros.forEach(System.out::println);
        Iterator<String> it = libros.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            if(it.next().equals("libro2")){
                it.remove();
            }

        }


    }
}

