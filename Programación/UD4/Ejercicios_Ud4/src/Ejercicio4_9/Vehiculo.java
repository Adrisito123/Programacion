
package Ejercicio4_9;

public class Vehiculo {
 String marca;
 String modelo;
 int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    public void  mostrarDetalles(){
     
        System.out.println("Marca: " + marca);
        System.out.println("Modelo " + modelo);
        System.out.println("Año: " + anio);

 }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
        
}
