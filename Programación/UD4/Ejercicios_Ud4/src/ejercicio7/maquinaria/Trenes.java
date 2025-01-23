package ejercicio7.maquinaria;

import ejercicio7.maquinaria.Locomotoras;
import ejercicio7.maquinaria.Vagones;
import ejercicio7.personal.Maquinistas;
import java.util.ArrayList;
import java.util.List;

public class Trenes {
	Locomotoras locomotora;
	Vagones vagones [];
	Maquinistas responsable;
	private int numVagones; //número de vagones que forman el tren
	
	public Trenes (Locomotoras locomotora, Maquinistas responsable) {
		this.locomotora = locomotora;
		this.responsable = responsable;
		vagones = new Vagones [5]; //creamos la tabla de tamaño 5, pero no se
		//crea ningún objeto de tipo Vagón
		numVagones = 0; //por ahora no hay vagones enganchados al tren
	}
	/**
	* Al ser la clase Vagon no visible por clases externas, será la clase Tren la
	* que se encargue de construir el objeto a partir de los datos que nos pasen. */
	public void enganchaVagon (int cargaMax, int cargaActual, String mercancia) {
		if (numVagones >= 5) {
			System.out.println("El tren no admite más vagones");
		} else {
			Vagones v = new Vagones (numVagones, cargaMax, cargaActual, mercancia);
			vagones [numVagones] = v; //el vagón pasado ocupa el último lugar
			numVagones++; //ahora tenemos un vagón más enganchado al tren
		}
	}
}