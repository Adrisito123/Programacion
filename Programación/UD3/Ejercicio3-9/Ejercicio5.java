
package Ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        int num [] = {2,76,9,4,3,6};
        
        System.out.println("La  suma del array es: " + array(num));
        
    }
    public static int array(int[] num){
        
        int suma = 0;
        
       for (int i : num){
           suma += i;
            
        }
         return suma;
        }
        }
        
    

