
package Ejercicio4_17;


public class Motocicleta  extends Vehiculo{
    
    public Motocicleta(String matricula, String marca, int anyo, FuelType FuelType) {
        super(matricula, marca, anyo, FuelType);
    }

    @Override
    public double calculateSpeed() {
        return 120;
    }

    @Override
    public String toString() {
        return  "matricula: " + getMatricula() + "marca: " +  getMarca() + "anyo: " + getAnyo();
    }

}
