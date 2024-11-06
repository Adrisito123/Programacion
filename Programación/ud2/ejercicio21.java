
package programacion.ud2;

import java.util.Scanner;

public class ejercicio21 {
    public static void main (String[]arrgs){
        int num;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime mes del año (1-12)");
        num = sc.nextInt( );
        
        
        /* if (num > 0 && num <=12){
        switch(num){
            case 1:
                System.out.println("Enero tiene 31 Dias");
                break;
            case 2:
                System.out.println("Febrero puede tener 28 o 29 días (si es año bisiesto)");
                break;
            case 3:
                System.out.println("Marzo tiene 31 Dias");
                break;
            case 4:
                System.out.println("Abril tiene 30 Dias");
                break;
            case 5:
                System.out.println("Mayo tiene 31 Dias");
                break;
            case 6:
                System.out.println("Junio tiene 30 Dias");
                break;
            case 7:
                System.out.println("Julio tiene 31 Dias");
                break;
            case 8:
                System.out.println("Agosto tiene 31 Dias");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 Dias");
                break;
            case 10:
                System.out.println("Octubre tiene 31 Dias");
                break;
            case 11:
                System.out.println("Nombiembre tiene 30 Dias");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 Dias");
                break;
            default:
        } 
    } else {
            System.out.println("No existe ese mes");
        }
    */
        if (num > 0 && num <= 12){
        switch(num){
            case 1,3,5,7,8,10,12:
                System.out.println("Tiene 31 Dias");
                break;
            case 2:
                System.out.println("Puede tener 28 o 29 dias si es año bisisesto");
                break;
            case 4,6,9,11:
                System.out.println("Tiene 30 Dias");
                break;
            default:
        }
} else {
            System.out.println("Ese mes no existe");
        }
    }
}