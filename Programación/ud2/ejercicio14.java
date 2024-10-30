
package programacion.ud2;

import java.util.Scanner;

public class ejercicio14 {
    public static void main (String[]args){
        
        int trimestre1;
        int trimestre2;
        int trimestre3;
        double resultadodecimal;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime la nota del primer trimestre:");
        trimestre1 = sc.nextInt();
        
        System.out.println("Dime la nota del segundo trimestre:");
        trimestre2 = sc.nextInt();
        
        System.out.println("Dime la nota del tercer trimestre:");
        trimestre3 = sc.nextInt();
        
        resultadodecimal = (trimestre1 + trimestre2 + trimestre3) / 3.0;
        int resultadoentero = (int)resultadodecimal;
        
        System.out.println("La nota media entera es:" + resultadoentero);
        System.out.println("La nota media es:" + resultadodecimal);
        
    }
    
}
