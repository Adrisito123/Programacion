
package programacion.ud2;

import java.util.Scanner;

public class ejrercicio10 {
    public static void main (String[]args){
         final double manzanas  = 2.35;
         final double peras = 1.95;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuntos kilos de manzanas has vendido el primer semestre?");
        int res1 = sc.nextInt();
        
        double manzanares1 = res1 * manzanas;
        
        System.out.println("¿Cuntos kilos de manzanas has vendido el segundo semestre?");
        int res2 = sc.nextInt();
        
        double manzanasem2 = res2 * manzanas;
        double manzanastotal = manzanares1 + manzanasem2;
        
        System.out.println("¿Cuntos kilos de peras has vendido el primer semestre?");
        int res3 = sc.nextInt();
        
        double perassem1 = res3 * peras;
        
        System.out.println("¿Cuntos kilos de peras has vendido el segundo semestre?");
        int res4 = sc.nextInt();
        
        double perassem2 = res4 * peras;
        double perastotal = perassem1 + perassem2;
        
        double restotal = manzanastotal ;
        
        restotal += perastotal;
        
        System.out.println("En total has ganado:"  + restotal + "€");
        
    }
    
}
