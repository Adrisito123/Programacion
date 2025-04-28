package Ejercicios;

import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de Set
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Agregar elementos a cada Set
        String[] elementos = {"Java", "Python", "C++", "JavaScript", "Ruby", "Java"};
        for (String elemento : elementos) {
            hashSet.add(elemento);
            treeSet.add(elemento);
            linkedHashSet.add(elemento);
        }

        // Imprimir cada Set
        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Medir tiempo de inserción para cada Set
        medirTiempoInsercion(new HashSet<>());
        medirTiempoInsercion(new TreeSet<>());
        medirTiempoInsercion(new LinkedHashSet<>());

        //Metodo mostrarElementosConIterador
        System.out.println("Mostrar Elementos con Iterator:");
        System.out.println("Con HashSet: ");
        mostrarElementosConIterador(hashSet);
        System.out.println("Con TreeSet: ");
        mostrarElementosConIterador(treeSet);
        System.out.println("Con LinkedHashSet: ");
        mostrarElementosConIterador(linkedHashSet);

        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(4);
        numeros.add(40);
        numeros.add(36);
        numeros.add(76);
        numeros.add(21);
        numeros.add(22);
        numeros.add(98);
        numeros.add(71);
        numeros.add(84);
        numeros.add(42);

        Iterator<Integer>  itRemove = numeros.iterator();
        Integer e;
        while (itRemove.hasNext()){
            e = itRemove.next();
            if(e%2==0){
                itRemove.remove();
            }

        }




    }

    private static void medirTiempoInsercion(Set<Integer> set) {
        long inicio = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            set.add(i);
        }
        long fin = System.nanoTime();
        System.out.println("Tiempo de inserción para " + set.getClass().getSimpleName() + ": " + (fin - inicio) + " ns");
    }
    public static void mostrarElementosConIterador(Set<String> set) {
        Iterator<String> iterator = set.iterator();
        int indice = 1;
        while (iterator.hasNext()) {
            System.out.println("Elemento #" + indice + ": " + iterator.next());
            indice++;
        }
    }
}

