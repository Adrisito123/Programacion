
package programacion.ud2;

import java.util.Scanner;

public class ejercicio20 {
    public static void main (String[]args){
        int num1;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime tu nota:");
        num1 = sc.nextInt();
        
        /*if (num1 <= 10){
        switch(num1){
        case 0,1,2,3,4:
            System.out.println("Tienes un INSUFICIENTE");
            break;
        case 5:
            System.out.println("Tienes un SUFICIENTE");
            break;
        case 6:
            System.out.println("Tienes un BIEN");
            break;
        case 7,8:
            System.out.println("Tienes un NOTABLE");
            break;
        case 9,10:
            System.out.println("Tienes un SOBRESALIENTE");
            break;
        default:   
        }
    } else {
            System.out.println("Esa nota no existe");
            }
        */
        if (num1 <= 10){
        switch(num1){
        case 0,1,2,3,4 -> System.out.println("Tienes un INSUFICIENTE");
        case 5 -> System.out.println("Tienes un SUFICIENTE");
        case 6 -> System.out.println("Tienes un BIEN");
        case 7,8 -> System.out.println("Tienes un NOTABLE");
        case 9,10 -> System.out.println("Tienes un SOBRESALIENTE");
        default -> {
                }   
        }
    } else {
            System.out.println("Esa nota no existe");
            }
    }
   
}
