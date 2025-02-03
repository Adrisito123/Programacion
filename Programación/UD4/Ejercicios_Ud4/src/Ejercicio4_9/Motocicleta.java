
package Ejercicio4_9;

public class Motocicleta extends Vehiculo {
    
    boolean tieneSidecar;

    public Motocicleta( String marca, String modelo, int anio, boolean tieneSidecar) {
        super(marca, modelo, anio);
        this.tieneSidecar = tieneSidecar;
    }
    
    public void mostrarDetalles(){
    
        super.mostrarDetalles();
        System.out.println("Tiene Sidecar: " + tieneSidecar);
        
    }

    public void mover(){
    
        System.out.println("La motocicleta esta en movimiento");
    
    }
    
}
