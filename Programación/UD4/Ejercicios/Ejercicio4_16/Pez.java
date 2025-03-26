package Ejercicio4_16;

public abstract class Pez extends Animal implements Nadador {
    
    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }
    
    @Override
    public void nadar() {
        System.out.println("El pez nada");
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pez no hace ruido");
    }
}
