package Ejercicio17_ampliacion;

public class Deportista extends Entrenamiento implements Compite{
    private String nombre;
    private int edad;
    private String deporte;
    private static int totalDeportistas  = 0;

    public Deportista(String nombre , int edad, String deporte) {
        this.nombre = nombre;
        this.edad = edad;
        this.deporte = deporte;
        totalDeportistas++;
    }

    public static int getTotalDeportistas() {
        return totalDeportistas;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Deporte: " + deporte;
    }

    @Override
    public String competir() {
        return "El futbolista está compitiendo en un partidos";
    }

    @Override
    public void entrenar(){
        System.out.println("El deportista esta entrenado");
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getDeporte(){
        return deporte;
    }
    public void setDeporte(String deporte){
        this.deporte = deporte;
    }

}
