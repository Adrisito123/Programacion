package Proyecto;

import java.util.Objects;

public class Peliculas {
    private String titulo;
    private String director;
    private double valoracionMedia;
    private int numVotos;

    public  Peliculas(String nombre, String director) {
        this.titulo = nombre;
        this.director = director;
        this.valoracionMedia = 0.0;
        this.numVotos = 0;
    }

    public void votar(int puntuacion){
        valoracionMedia = (valoracionMedia * numVotos + puntuacion) / (++numVotos);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Peliculas peliculas = (Peliculas) o;
        return Double.compare(valoracionMedia, peliculas.valoracionMedia) == 0 && numVotos == peliculas.numVotos && Objects.equals(titulo, peliculas.titulo) && Objects.equals(director, peliculas.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, director, valoracionMedia, numVotos);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public double getValoracionMedia() {
        return valoracionMedia;
    }
    public void setValoracionMedia(int valoracionMedia) {
        this.valoracionMedia = valoracionMedia;
    }
    public int getNumVotos() {
        return numVotos;
    }
    public void setNumVotos(int numVotos) {
        this.numVotos = numVotos;
    }
}
