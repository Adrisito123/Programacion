package programacion.ud2;

import java.util.Scanner;

public class ejercicio30 {
    public static void main(String[] args) {
        int num;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un numero");
        num = sc.nextInt();
        
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) { 
                System.out.print("*");
            }
            System.out.println(); 
        }
        
    }
}

