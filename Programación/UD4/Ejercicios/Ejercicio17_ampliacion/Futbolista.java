package Ejercicio17_ampliacion;

public class Futbolista extends Deportista {
    private String posicion;
    private int golesMarcados;

    public Futbolista(String nombre, int edad, String deporte, String posicion, int golesMarcados) {
        super(nombre, edad, deporte);
        this.posicion = posicion;
        this.golesMarcados = golesMarcados;
    }

    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getAnotarGol(){
        return golesMarcados;
    }
    public void setAnotarGol(int golesMarcados){
        this.golesMarcados = golesMarcados;
    }

    public void anotarGol(){
        golesMarcados++;
    }

    public String toString() {
        return  super.toString() + "posicion: " + posicion + ", golesMarcados: " + golesMarcados;
    }
}
