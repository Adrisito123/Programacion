
package Ejercicio4_9;

public class Coche extends Vehiculo {
    
   int numPuertas;

    public Coche(String marca, String modelo, int anio,int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }
   
    public void mostrarDetalles(){
        
        System.out.println("Marca: " + marca);
        System.out.println("Modelo " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Número de Puertas: " + numPuertas);

    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

      
}
