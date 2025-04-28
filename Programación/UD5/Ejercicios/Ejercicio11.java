package Ejercicios;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        LinkedList<String> tareas = new LinkedList<>();
        tareas.addFirst("Lavar los platos");
        tareas.addFirst("Hacer la compra");
        tareas.addFirst("Estudiar Java");
        tareas.addFirst("Ir al gimnasio");
        tareas.addFirst("Leer un libro");

        mostrarTareas(tareas);

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una nueva tarea: ");
        String nuevaTarea = sc.nextLine();
        tareas.addFirst(nuevaTarea);

        System.out.println("Lista con tareas añadidas:");
        mostrarTareas(tareas);

        System.out.println("Lista de tareas completadas:");
        eliminarTarea(tareas);

        System.out.println(" Añadir tarea urgente:");
        String tareaUrgente =  sc.nextLine();
        tareas.addLast(tareaUrgente);
        System.out.println("Lista completa con tareas añadidas urgentes:");
        mostrarTareas(tareas);

    }
    public static void mostrarTareas(LinkedList<String> tareas) {
        for (String tarea : tareas) {
            System.out.println("- " + tarea);
        }
    }
    public static void eliminarTarea(LinkedList<String> tareas) {
        String borrarPrimera = tareas.removeLast();
        System.out.println("TareaS completadaS:: " + borrarPrimera);
    }

}

