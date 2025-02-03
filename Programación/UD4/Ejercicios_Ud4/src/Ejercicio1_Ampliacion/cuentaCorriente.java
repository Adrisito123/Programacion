
package Ejercicio1_Ampliacion;


public class cuentaCorriente {
   public String nombre;
   private String DNI;
   private  int saldo ;
   public String nombreBanco;

    public cuentaCorriente(String nombre, String DNI, int saldo) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.saldo = saldo;
        
    }
    public cuentaCorriente(String nombre , int saldo){
        this.nombre = nombre;
        this.saldo =  saldo;
    }
    public cuentaCorriente(String nombre, String DNI, int saldo, String nombreBanco){
        this.nombre = nombre;
        this.DNI = DNI;
        this.saldo = saldo;
        this.nombreBanco = nombreBanco;
    }
    public void ingresarDinero(int cantidad){
        if(cantidad > 0){
            saldo += cantidad;
            System.out.println("Has ingresado " + cantidad + " € ");
        } else{
            System.out.println("No se ha podido realizar");
        }
    }
    public void retirarDinero(int cantidad){
        if (cantidad > 0){
            saldo -= cantidad;
            System.out.println("Has retitado " + cantidad + "  € ");
        } else{
            System.out.println("No tienes suficente dinero");
        }
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }
    
    
}
