
package programacion.ud2;

import java.util.Scanner;

public class ejercicio6 {
    public static void main  (String[]args){
        int radio;
        final double PI = 3.1416;
        double longitud;
        double area;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime el radio:");
        radio = sc.nextInt();
        
        longitud = (2 * PI) * radio;
        System.out.println("La longitud es: " + longitud);
        
        area = PI * (radio * radio);
        System.out.println("El area es:" + area);
    }
    
}
