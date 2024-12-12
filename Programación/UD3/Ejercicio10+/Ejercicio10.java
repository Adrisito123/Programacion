
package Ejercicios;

import java.util.Arrays;


public class Ejercicio10 {
    public static void main(String[] args) {
        
        int [] n = new int [10];
        
        Arrays.fill(n, 3);
        System.out.println(Arrays.toString(n));
        
        Arrays.fill(n, 5, 8, 7);
        System.out.println(Arrays.toString(n));
    }
    
}
