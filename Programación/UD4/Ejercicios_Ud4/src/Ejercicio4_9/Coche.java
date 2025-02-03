
package Ejercicio4_9;

public class Coche extends Vehiculo {
    
   int numPuertas;

    public Coche(String marca, String modelo, int anio,int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }
   
    public void mostrarDetalles(){
        
        super.mostrarDetalles();
        System.out.println("Número de Puertas: " + numPuertas);

    }

    public void mover(){
    
        System.out.println("El coche esta en movimiento");
    
    }
    
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

      
}
