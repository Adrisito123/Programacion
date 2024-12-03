
package Ejercicios;

public class Ejercicio8 {
    public static void main(String[] args) {
        
        int t [] ={1,7,66,96,4,8,35};
        
            System.out.println("El maximo numero es: " + maximo(t));
        
    }
    public static  int maximo(int t[]){
        
        int max = t[0];
        
        for (int i = 1; i < t.length; i++) {
            if(t[i] > max){
                max  = t[i];
            }
        }
        
        return max;
        
        
        
    }
}
