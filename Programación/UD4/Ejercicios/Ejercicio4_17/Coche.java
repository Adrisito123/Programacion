
package Ejercicio4_17;

public class Coche extends Vehiculo {
    
    public Coche(String matricula, String marca, int anyo, FuelType FuelType) {
        super(matricula, marca, anyo, FuelType);
    }

    @Override
    public double calculateSpeed() {
        return 120 ;
    }

    @Override
    public String toString() {
        return "matricula: " + getMatricula() + "marca: " +  getMarca() + "anyo: " + getAnyo();
    }

    
}
