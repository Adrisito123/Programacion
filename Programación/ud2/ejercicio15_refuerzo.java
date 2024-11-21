
package programacion.ud2;

import java.util.Scanner;

public class ejercicio15_refuerzo {
    public static void main (String[]args){
        int edad;
        String mayor = "Mayor de edad";
        String menor = "Menor de edad";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime tu edad");
        edad = sc.nextInt();
        
        String tuEdad = edad >= 18 ? mayor : menor;
        
        System.out.println(tuEdad);
    }
    public static void mayorMenor(int edad, String mayor , String menor){
        
    }
}
