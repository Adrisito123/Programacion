package Ejercicio4_16;

public abstract class Perro extends Animal implements Corredor {

    public Perro(String nombre, int edad) {
        super(nombre, edad); 
    }

    @Override
    public void correr() {
        System.out.println("El perro está corriendo.");
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro hace 'Guau'.");
    }

   
}
