
package programacion.ud2;

import java.util.Scanner;

public class ejercicio7 {
    public static void main (String[]args){
        int edad;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Dime tu edad:");
        edad = sc.nextInt();
        
        boolean mayor = (edad >= 18);
        
        if (mayor) {
            System.out.println("Es mayor de edad");
        }  else {
                    System.out.println("Es menor de edad");
                    }
            
        }
        
    }
    

