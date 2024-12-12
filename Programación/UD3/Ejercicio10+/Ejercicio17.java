
package Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String contrasena  ;
        String respuesta ;
        boolean iguales = false;
        
        System.out.println("Usuario 1");
        System.out.println("Dime la contraseña:");
        contrasena = sc.nextLine();
        
         while(iguales == false){
            
            System.out.println("Usuario 2");
            System.out.println("Intenta adivinar la contraseña:");
            respuesta = sc.nextLine();
            
           iguales = contrasena.equals(respuesta);
           
            if(iguales == false){
                System.out.println("Lo siento es incorecta, la contraseña tiene " + contrasena.length() + " caracteres");
            } 
         }
        System.out.println("Bien has acertado");
    }
}