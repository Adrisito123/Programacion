
package programacion.ud2;

import java.util.Scanner;

public class ejercicio3 {
    public static void  main (String[] args){
        int anyoActual;
        int anyoUsuario;
        int anyo;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime el año actual");
        anyoActual = sc.nextInt();
        
        System.out.println("Dime tu año de nacimiento");
        anyoUsuario = sc.nextInt();
        
        anyo = anyoActual - anyoUsuario;
        System.out.println("Tu edad es: " + anyo);
        
        
    }
    
}
