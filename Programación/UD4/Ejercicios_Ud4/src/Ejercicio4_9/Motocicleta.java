
package Ejercicio4_9;

public class Motocicleta extends Vehiculo {
    
    boolean tieneSidecar;

    public Motocicleta( String marca, String modelo, int anio, boolean tieneSidecar) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }
    
    public void mostrarDetalles(){
    
        System.out.println("Marca: " + marca);
        System.out.println("Modelo " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Tiene Sidecar: " + tieneSidecar);
        
    }

    
}
