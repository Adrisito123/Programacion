
package Ejercicio4_9;

public class main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Audi" , "A3" , 2008 , 5);
        Motocicleta motocicleta1 = new Motocicleta("BMW" , "Serie 1" , 2013 , false);
        Camion camion1 = new Camion("VOLVO" , "Gam FH", 2009 , 900);
        
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
