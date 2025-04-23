package Proyecto;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorPeliculas gestor = new GestorPeliculas();
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar película");
            System.out.println("2. Votar película");
            System.out.println("3. Ver películas por director");
            System.out.println("4. Ver películas ordenadas por valoración");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Director: ");
                    String director = sc.nextLine();
                    gestor.agregarPelicula(new Peliculas(titulo, director));
                    break;
                case 2:
                    System.out.print("Título de la película: ");
                    String tituloVote = sc.nextLine();
                    System.out.print("Valor (1-10): ");
                    int valor = sc.nextInt();
                    sc.nextLine();
                    gestor.votarPelicula(tituloVote, valor);
                    break;
                case 3:
                    gestor.mostrarPeliculasPorDirector();
                    break;
                case 4:
                    gestor.mostrarPeliculasPorValoracion();
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }
}