package Ejercicio4_16;

public abstract class Pajaro extends Animal implements Volador {

    public Pajaro(String nombre, int edad) {
        super(nombre, edad); 
    }

    @Override
    public void volar() {
        System.out.println("El pájaro está volando");
    }

    @Override
    public abstract void hacerSonido();
}
