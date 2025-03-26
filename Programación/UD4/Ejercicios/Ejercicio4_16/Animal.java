package Ejercicio4_16;

public abstract class Animal {

    String nombre;
    int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("Tiene: " + edad + " años");
    }
    public abstract void hacerSonido();
    
}
