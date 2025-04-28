package Proyecto;

import java.util.*;

public class GestorPeliculas {
    private Set<Peliculas> peliculas = new HashSet<>();

    public void agregarPelicula(Peliculas p) {
        if (peliculas.add(p)) {
            System.out.println("Película agregada.");
        } else {
            System.out.println("Esa película ya existe.");
        }
    }

    public void votarPelicula(String titulo, int valor) {
        for (Peliculas p : peliculas) {
            if (p.getTitulo().equals(titulo)) {
                p.votar(valor);
                System.out.println("¡Gracias por votar!");
                return;
            }
        }
        System.out.println("Película no encontrada.");
    }
    public void mostrarPeliculasPorValoracion() {
        List<Peliculas> listaValoracion = new ArrayList<>(peliculas);

        Collections.sort(listaValoracion, new Comparator<Peliculas>() {
            @Override
            public int compare(Peliculas p1, Peliculas p2) {
                return Double.compare(p2.getValoracionMedia(), p1.getValoracionMedia());
            }
        });
        Iterator<Peliculas> iterator = listaValoracion.iterator();
        while (iterator.hasNext()) {
            Peliculas p = iterator.next();
            System.out.println(p.getTitulo() + " - Valoración: " + p.getValoracionMedia());
        }
    }

    public void mostrarPeliculasPorDirector(){
        List<Peliculas> listaDirector = new ArrayList<>(peliculas);

        Collections.sort(listaDirector, new Comparator<Peliculas>() {
            @Override
            public int compare(Peliculas p1, Peliculas p2) {
                return p1.getDirector().compareTo(p2.getDirector());
            }
        });
        Iterator<Peliculas> iterator = listaDirector.iterator();
        while (iterator.hasNext()) {
            Peliculas pp = iterator.next();
            System.out.println(pp.getTitulo() + " - Valoración: " + pp.getValoracionMedia() + " - Director: " + pp.getDirector());
        }

    }


}
