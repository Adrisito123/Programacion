
package programacion.ud2;

import java.util.Scanner;

public class ejercicio5 {
    public static void main (String[]args){
        int num1;
        int num2;
        double notaMedia;
        
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("Dime un numero:");
        num1 = sc.nextInt();
        
        System.out.println("Dime otro numero:");
        num2 = sc.nextInt();
        
        notaMedia = (num1 + num2) / 2.0 ;
        
        System.out.println("La nota media es:" + notaMedia);
        
}
    
    
}
