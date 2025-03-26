package Ejercicio17_ampliacion;

public class EntrenamientoFutbol extends Deportista implements Compite {
    public EntrenamientoFutbol(String nombre, int edad, String deporte) {
        super(nombre, edad, deporte);
    }

    @Override
    public void entrenar(){
        System.out.println("Entrenado Futbol...");
    }

    @Override
    public String competir(){
        return "El futbolista está compitiendo en un partidos";
    }
}
