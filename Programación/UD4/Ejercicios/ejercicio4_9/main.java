
package Ejercicio4_9;

public class main {
    public static void main(String[] args) {
        coche coche1 = new coche("Audi" , "A3" , 2008 , 5);
        motocicleta motocicleta1 = new motocicleta("BMW" , "Serie 1" , 2013 , false);
        camion camion1 = new camion("VOLVO" , "Gam FH", 2009 , 900);
        
        System.out.println("Coche 1:");
        coche1.mostrarDetalles();
        coche1.mover();
        
        System.out.println("Motocicleta1:");
        motocicleta1.mostrarDetalles();
        motocicleta1.mover();
        
        System.out.println("Camón 1");
        camion1.mostrarDetalles();
        camion1.mover();
        
    }
    
}