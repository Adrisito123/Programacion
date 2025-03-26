package Ejercicio12;

public class Pajaro extends Animal {
    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Pío pío");
    }

    @Override
    public String moverse() {
        return "Vuela por el aire";
    }

    // Método adicional
    public void volar() {
        System.out.println("fly fly");
    }
}