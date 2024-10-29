package programacion.ud2;

import java.util.Scanner;

public class ejercicio12 {
    public static void main (String[]args){
        int num;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un numero:");
        num = sc.nextInt();
        
        int valorabsoluto = Math.abs(num);
        
        System.out.println("El valor absoluto de " + num + " es " + valorabsoluto);
    }
    
}
