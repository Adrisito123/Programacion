
package programacion.ud2;
    

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un numerol: ");
        double numeroDecimal = sc.nextDouble();
        
        int num = (int) Math.round(numeroDecimal);
        
        System.out.println("El número redondeado es:  " + num);
        
        

    }
}

