
package Ejercicios;

import java.util.Arrays;



public class Ejercicio9 {
    public static void main(String[] args) {
        
        char [][] m = {{'A','B','C'},{'D','E','F'},{'C','H','I'}};
        int [] n = {1,2,3,4};
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");      
            }
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(n));
    }
    
}
