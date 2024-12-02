
package ejercicio_ud2;


public class Ejercicio4 {
    public static void main(String[] args) {
        
        int suma = 0;
        int [] num = new int [10];
        
        for (int i = 0; i < num.length  ; i++) {
            num[i] = (int) (Math.random() * 100);
            suma += num[i];
            System.out.println("Los numero generados son: " + num[i] );
        }
        System.out.println("La suma es: " + suma);
    }
    
}
