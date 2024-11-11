
package programacion.ud2;

import java.util.Scanner;

public class ejercicio25 {
    public static void main (String[]args){
        int aciertos = 0;
        int suma;
        int  random1 , random2;
        Scanner sc = new Scanner(System.in);
        
        do{
            random1 = (int) (Math.random() * 100 + 1);
            random2 = (int) (Math.random() * 100 + 1);

            System.out.println("¿Cual es la suma de" + random1 + "+" + random2 +   "?" );
            suma = sc.nextInt();
            
           if (suma == random1 + random2){
               aciertos++;
           }
                
            } while (suma == random1 + random2);
        System.out.println("El numero de aciertos es: " + aciertos);
        } 
        }

