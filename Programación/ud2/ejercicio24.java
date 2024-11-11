
package programacion.ud2;

import java.util.Scanner;

public class ejercicio24 {
    public static void main (String[]args){
        int edad = 0;
        int max = edad ;
        int min = edad;
        
        Scanner sc = new Scanner(System.in);
        
        while(edad == -1){
            System.out.println("Dime un numero");
            edad = sc.nextInt();
            
            if (max < edad){
                max  = edad;
            }
            if (min > edad){
                min = edad;
            }
            
        }
        System.out.println("Maximo:" + max + " Minimo:" + min);
    }
    
}
