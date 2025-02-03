
package Ejercicio1_Ampliacion;

public class cuentaCorrienteMain {
    public static void main(String[] args) {
        
        cuentaCorriente cuenta1 = new cuentaCorriente("Adrián" , "123456789A" , 0 );
        cuentaCorriente cuenta2 = new cuentaCorriente("Juan", 0);
        cuentaCorriente cuenta3 = new cuentaCorriente("Hugo", "123456789B" , 0 , "Unicaja");
        cuenta1.setNombre("Adrián");
        cuenta1.setDNI("123456789m");
        cuenta1.setSaldo(0);
        cuenta1.ingresarDinero(20);
        cuenta1.retirarDinero(10);
        
        System.out.println(cuenta1.getNombre() + " " + cuenta1.getDNI() + " " + cuenta1.getSaldo());

        cuenta2.setNombre("Juan");
        cuenta2.setSaldo(0);
        System.out.println(cuenta2.getNombre() + " " + cuenta2.getSaldo());
        
        cuenta3.setNombre("Hugo");
        cuenta3.setDNI("123456789B");
        cuenta3.setSaldo(0);
        cuenta3.setNombreBanco("Unicaja");
        System.out.println(cuenta3.getNombre() + " " + cuenta3.getDNI() + " " + cuenta3.getSaldo() + " " + cuenta3.getNombreBanco());
    }
}
