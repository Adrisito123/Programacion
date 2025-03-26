
package Ejercicio4_9;

public class camion extends vehiculo {
    
    int capacidadCarga;

    public camion(String marca, String modelo, int anio, int capacidadCarga) {
        super(marca, modelo, anio);
        this.capacidadCarga = capacidadCarga;
    }
    
    public void mostrarDetalles(){
    
    super.mostrarDetalles();
        System.out.println("La capciadad de carga es: " + capacidadCarga);
    
    }
    
    public void mover(){
    
        System.out.println("El camión esta en movimiento");
    
    }
    
}